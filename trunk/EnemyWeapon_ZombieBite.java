// $Id: EnemyWeapon_ZombieBite.java 140 2012-01-18 15:06:41Z rutgervanaalst $

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
/**
 * Write a description of class EnemyWeapon_ZombieBite here.
 * 
 * @author $Author: rutgervanaalst $ 
 * @version $Rev: 140 $
 */
public class EnemyWeapon_ZombieBite extends EnemyWeapon
{
	public EnemyWeapon_ZombieBite()
	{
		setImage(new GreenfootImage(1, 1));
		this.damage = 10;
		
		this.attackInterval = 2000;
	}
	
	// 
	public void removeSelf(EnemyWeapon_ZombieBite self)
	{
		if (self != null)
			getWorld().removeObject(self);
	}

	public void attack()
	{

	}
}
