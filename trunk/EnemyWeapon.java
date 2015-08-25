// $Id: EnemyWeapon.java 99 2012-01-17 20:02:38Z rutgervanaalst $

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
//import javax.swing.timer;
//import javax.swing.event.EventListenerList;

public abstract class EnemyWeapon extends SmoothMover
{
	protected int damage;
	protected int attackInterval;
	protected boolean canAttack;
	
	public boolean canAttack()
	{
		return this.canAttack();
	}
	
	//[[region(getters and setters):
	public int getDamage()
	{
		return this.damage;
	}
	
	public int getAttackInterval()
	{
		return this.attackInterval;
	}
	
	public boolean getCanAttack()
	{
		return this.canAttack;
	}
	//]]
}