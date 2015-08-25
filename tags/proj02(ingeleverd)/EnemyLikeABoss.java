// $Id: EnemyLikeABoss.java 149 2012-01-18 16:04:54Z rutgervanaalst $

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class EnemyLikeABoss here.
 * 
 * @author $Author: rutgervanaalst $ 
 * @version $Rev: 149 $
 */
public class EnemyLikeABoss extends Enemy
{
	protected int invasions = 5;
	
	protected int invasionCount = 0;
	
	protected boolean done = false;
	
	protected boolean acceptDamage = false;
	
	public EnemyLikeABoss()
	{
		super();
		// precautions
		this.initialize(); // Enemy.initialize();
		setImage("zombie_jack.png");
		
		this.health = 5000;
		this.wander = true;
		this.walkingSpeed = 1;
		this.setFoundPlayer(false);
		this.setActive(true);
	}
    /**
     * Act - do whatever the EnemyLikeABoss wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
		List zombies = getWorld().getObjects(EnemyZombie.class);
		
		if ((zombies.size() < 5) && (this.invasionCount < this.invasions))
		{
			int rand = Greenfoot.getRandomNumber(10) + 10;
			
			new EnemyInvasionController(getWorld(), EnemyZombie.class, rand);
			this.invasionCount++;
		} else {
			this.acceptDamage = true;
		}
		this.wanderThroughMap();
    }

	protected void calculateNextPosition()
	{
		this.nextPositionX = Greenfoot.getRandomNumber(600) + 50;
		this.nextPositionY = Greenfoot.getRandomNumber(600) + 50;
		
		while (this.nextPositionX < 5)
			this.nextPositionX += 10;
			
		while (this.nextPositionY < 5)
			this.nextPositionY += 10;
			
		while (this.nextPositionX > 695)
			this.nextPositionX -= 10;
			
		while (this.nextPositionY > 695)
			this.nextPositionY -= 10;
	}
	
	protected void handleBulletCollision()
	{
		if (!this.acceptDamage)
			return;
			
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
}
