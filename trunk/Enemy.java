// // $Id: Enemy.java 148 2012-01-18 15:51:37Z rutgervanaalst $
// 
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;
import java.util.*;

/**
 * Write a description of class Enemy here.
 * 
 * @author $Author: rutgervanaalst $ 
 * @version $Rev: 148 $
*/


public abstract class Enemy extends SmoothMover
{
	//[[region(Atributes):
	
	// 
	// general attributes
	// 
	
	protected World world;
	
	protected Player player;
	
	// 
	// enemy status related
	// 
	
	protected int health;
	
	protected boolean active = false;
	
	protected int walkingSpeed = 1;
	
	protected boolean canAttackPlayer = true;
	
	// 
	// wander the map
	// 
	
	protected boolean wander = false;
	
	protected int nextPositionX = -1;
	
	protected int nextPositionY = -1;
	
	// 
	// enemy weapon
	// 
	
	protected EnemyWeapon[] weapons;
	
	protected EnemyWeapon currentWeapon;
	
	protected int bulletTriggered = 0;	// getting hit while not knowing where the player is (sneaky trigger?)
	
	// protected int[] bulletTriggerWalk;
	
	// protected int bulletTriggerPtr;
	
	// protected boolean bulletTriggerMove_bool = false;
	
	// protected int bulletTriggerMoved = 0;
	
	// 
	// regarding the player
	// 
	
	protected boolean foundPlayer = false;
	
	protected int playerDetectionRange = 250;
	
	protected int playerLosingRange = 300;
	//]]

	// 
	// greenfoot
	// 
	
	public void act()
	{
		this.world = getWorld();
		this.player = (Player)(this.world.getObjects(Player.class).get(0));
		
		this.playerDetection();
		
		if (this.allowedToChasePlayer() && this.playerDetected())
		{
			this.chasePlayer();
		}
		this.doAttack();
	}
	
	public void initialize()
	{
		
	}
	
	//[[region(wandering the map):
	final protected void wanderThroughMap()
	{
		if (this.nextPositionX == -1 || this.nextPositionY == -1)
		{
			this.calculateNextPosition();
			return;
		}
		
		if ((this.getX() == this.nextPositionX) && (this.getY() == this.nextPositionY))
			this.calculateNextPosition();
		
		if (this.getX() > this.nextPositionX)
			this.setLocation(this.getX() - this.walkingSpeed, this.getY());

		if (this.getX() < this.nextPositionX)
			this.setLocation(this.getX() + this.walkingSpeed, this.getY());

		if (this.getY() > this.nextPositionY)
			this.setLocation(this.getX(), this.getY() - this.walkingSpeed);

		if (this.getY() < this.nextPositionY)
			this.setLocation(this.getX(), this.getY() + this.walkingSpeed);
	}
	
	protected abstract void calculateNextPosition();
	//]]

	//[[region(player detection):
	/**
	 * easy wrapper
	 * @access	public final
	 * @return	void
	*/
	public final void playerDetection()
	{
		this.playerDetected();
		this.playerLost();
	}
	
	/**
	 * tries to detect the player, sets its propery and returns likewise
	 * @access	public
	 * @return	boolean
	*/
	public boolean playerDetected()
	{
		boolean detected;
		List p = getObjectsInRange(this.playerDetectionRange, Player.class);
		
		detected = (p.isEmpty())? false : true;
		
		this.foundPlayer = detected;
		
		if (detected)
		{
			this.wander = false;
		}
		
		return detected;
	}
	
	/**
	 * checks wheter the player is out of range (hide 'n seek?)
	 * @access	public
	 * @return	boolean
	*/
	public boolean playerLost()
	{
		boolean lost;
		List p = getObjectsInRange(this.playerLosingRange, Player.class);
		lost = (p.isEmpty())? false : true;
		this.foundPlayer = lost;
		return lost;
	}
	//]]
	
	//[[region(chasing the player):
	public void chasePlayer()
	{
		this.chasePlayerX(true);
		this.chasePlayerY(true);
	}
	
	public void chasePlayerX(boolean rotate)
	{
		if (rotate)
			this.rotateTowardsPlayer();
		
		if (this.getX() > this.player.getX())
            this.setLocation(this.getX() - this.walkingSpeed, this.getY());
            
        if (this.getX() < this.player.getX())
            this.setLocation(this.getX() + this.walkingSpeed, this.getY());
	}
	
	public void chasePlayerY(boolean rotate)
	{
		if (rotate)
			this.rotateTowardsPlayer();
		
		if (this.getY() > this.player.getY())
            this.setLocation(this.getX(), this.getY() - this.walkingSpeed);
            
        if (this.getY() < this.player.getY())
            this.setLocation(this.getX(), this.getY() + this.walkingSpeed);
	}
	
	public boolean allowedToChasePlayer()
	{
		return (this.getActive() && this.foundPlayer);
	}
	
	private void rotateTowardsPlayer()
	{
		int xa = this.player.getX();
		int xb = this.getX();
		int ya = this.player.getY();
		int yb = this.getY();
		double rotation = Math.atan2((xa - xb), (ya - yb));
		rotation = -(Math.toDegrees(rotation));
		setRotation((int) rotation);
	}
	//]]

	//[[region(attacking the player):
	protected void doAttack()
	{
		if (this.canAttackPlayer)
		{	
			List p = getObjectsInRange(20, Player.class);
			if (!p.isEmpty())
			{
				this.canAttackPlayer = !this.canAttackPlayer;
				final EnemyWeapon_ZombieBite bite = new EnemyWeapon_ZombieBite();
				getWorld().addObject(bite, this.getX(), this.getY());

				Timer timer = new Timer();

				timer.schedule(new TimerTask()
				{
					public void run()
					{
						canAttackPlayer = true;
						try 
						{
							getWorld().removeObject(bite);
						} catch (NullPointerException e) {
							
						}
						
					}
				}, bite.getAttackInterval());
			}
		}
	}
	//]]
	
	//[[region(getting attacked by the player):
	protected void handleBulletCollision()
	{
		Bullet bullet = (Bullet) getOneIntersectingObject(Bullet.class);
		Flame flame = (Flame) getOneIntersectingObject(Flame.class);
		
		if (bullet != null) 
		{
			this.health -= bullet.getDamage();
			this.world.removeObject(bullet);
		}
				
		if (flame != null)
		{
			this.health -= flame.getDamage();
			this.world.removeObject(flame);
		}
		
		if ((bullet != null) || (flame != null))
		{
			this.wander = false;
			if (!this.playerLost())
				this.foundPlayer = true;
		}

		if (this.health <=0) 
		{
			this.decease();
		}
	}
	//]]
	
	//[[region(decease):
	protected void decease()
	{
		Worlds.score += 100;
		this.world.removeObject(this);
	}
	
	final protected void deceaseByLeavingPickup(boolean leavePickup)
	{
		// this.deceaseByLeavingPickup(EnemyPickup.EnemyPickup_t.FLAME_THROWER);
		// return;
		if (!leavePickup)
			return;
		
		this.deceaseByLeavingPickup(EnemyPickup.randomPickup_t()); // look below =D
	}
	
	final protected void deceaseByLeavingPickup(EnemyPickup.EnemyPickup_t pickup)
	{
		getWorld().addObject(EnemyPickup.getPickupFromEnum(pickup), this.getX(), this.getY());
	}
	//]]
	
	//[[region(finish up):
	final protected void finishUp()
	{
		this.handleBulletCollision();
	}
	//]]

	//[[region(getters & setters):
	public void setActive(boolean a)
	{
		this.active = a;
	}
	
	public void setFoundPlayer(boolean f)
	{
		this.foundPlayer = f;
	}
	
	public boolean getActive()
	{
		return this.active;
	}
	
	public boolean getFoundPlayer()
	{
		return this.foundPlayer;
	}
	//]]

	protected void rotateTowardsWanderPoint()
	{	
		int xa = this.nextPositionX;
		int xb = this.getX();
		int ya = this.nextPositionY;
		int yb = this.getY();
		double rotation = Math.atan2((xa - xb), (ya - yb));
		rotation = -(Math.toDegrees(rotation));
		setRotation((int) rotation);
	}

}













