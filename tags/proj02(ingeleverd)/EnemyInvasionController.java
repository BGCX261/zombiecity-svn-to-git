// $Id$

import greenfoot.*;

/**
 * Write a description of class EnemyInvasionController here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyInvasionController  
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class EnemyInvasionController
     */
    public EnemyInvasionController(World world, Enemy cls)
    {
	
    }

    public EnemyInvasionController(World world, Object cls, int amount)
    {
		for (int i = 0; i < amount; i++)
		{
			world.addObject(new EnemyZombie(), Greenfoot.getRandomNumber(700), Greenfoot.getRandomNumber(700));
		}
    }

}
