// $Id: Bullet.java 149 2012-01-18 16:04:54Z rutgervanaalst $

import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.util.*;

/**
 * A bullet that can hit asteroids.
 * 
 * @author Poul Henriksen
 */
public class Bullet extends SmoothMover
{
	/**
	 * because only having damage-weapons is too mainstream!
	*/
	public enum Effect_t
	{
		DAMAGE(0x01) { public String toString() { return "Damage"; } },
		CONFUSION(0x02) { public String toString() { return "Confusion"; } },
		PARALIZE(0x04) { public String toString() { return "Paralize"; } };
		
		private int value;
		private Effect_t(int value) { this.value = value; }
		public int getValue() { return value; }
	};
	
	private int bulletEffect = Effect_t.DAMAGE.getValue();
    private int damage = 1;
    private int penetrations;
    private static GreenfootImage imageBullet = new GreenfootImage("Bullet.png");
    private static GreenfootSound bulletWallImpact = new GreenfootSound("BulletWallImpact.mp3");
    private static boolean explodingBullets = false;
  
    public Bullet()
    {
        addForce(new Vector(0, 15));
        setImage(imageBullet);
		// this.setBulletEffect(Bullet_effect_t.DAMAGE);
    }
    public Bullet(int idamage)
    {
        addForce(new Vector(0, 15));
        damage = idamage;
        setImage(imageBullet);
		// this.setBulletEffect(Bullet_effect_t.DAMAGE);
    }
    public Bullet(Vector speed, int rotation)
    {
        super(speed);
        setRotation(rotation);
        addForce(new Vector(rotation, 15));
        setImage(imageBullet);
		// this.setBulletEffect(Bullet_effect_t.DAMAGE);
    }
    
    public Bullet(Vector speed, int rotation, int idamage)
    {
        super(speed);
        setRotation(rotation);
        addForce(new Vector(rotation, 15));
        this.damage = idamage;
        penetrations = 1;
        setImage(imageBullet);
		// this.setBulletEffect(Bullet_effect_t.DAMAGE);
    }
    public Bullet(Vector speed, int rotation, int idamage, int ipenetrations)
    {
        super(speed);
        setRotation(rotation);
        addForce(new Vector(rotation, 15));
        this.damage = idamage;
        penetrations = ipenetrations;
        setImage(imageBullet);
		// this.setBulletEffect(Bullet_effect_t.DAMAGE);
    }

    public void move()
    {
        Vector tmp = new Vector(speed.getDirection(), (speed.getLength() / 4));
        for(int i = 0;i < 4;i++)
        {
               x = x + tmp.getX();
               y = y + tmp.getY();
               setLocation(x, y);
               if(checkhit()){
                   break;
               }
        }
    }
    
    public int getDamage()
    {
        return this.damage;
	}
	
	public int getBulletEffect()
	{
		return this.bulletEffect;
	}
	
	public void setBulletEffect(int effect)
	{
		this.bulletEffect = effect;
	}
	
	public ArrayList<String> readableEffect()
	{
		ArrayList<String> effect = new ArrayList<String>();
		for (Effect_t t : Effect_t.values())
		{
			if ((this.getBulletEffect() & t.getValue()) != 0)
				effect.add(t.toString());
		}
		return effect;
	}
	

    public void act()
    {
        if(outofbounds()) // nog in het level?
        {
            getWorld().removeObject(this); //nee, verwijder het object
        }
        else
        {
             move(); //ja, verplaats de kogel, en check of een zombie geraakt is
        }
    }
    
    private boolean checkhit()
    {
        return false;
    }
    public synchronized static void enableExplodingBullets(){
        explodingBullets = true;
    }
    public synchronized static void disableExplodingBullets(){
        explodingBullets = false;
    }
    public synchronized static boolean getExplodingBullets(){
        return explodingBullets;
    }
}