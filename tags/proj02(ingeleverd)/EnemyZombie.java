// $Id: EnemyZombie.java 149 2012-01-18 16:04:54Z rutgervanaalst $

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class EnemyZombie here.
 * 
 * @author $Author: rutgervanaalst $ 
 * @version $Rev: 149 $
 */
public class EnemyZombie extends Enemy
{
	Random random;
    public EnemyZombie()
    {
		super();
        this.initialize();

		this.random = new Random();
		switch (random.nextInt(2)+1)
		{
			case 1:
				setImage("zombie1.png");
				break;
			case 2:
				setImage("zombie2.png");
				break;
			default:
				setImage("zombie1.png");
				break;
		}
        
        this.health = random.nextInt(100) + 50;
		// this.wander = (random.nextInt(2) == 1)? true : false;
		this.wander = true;
        this.walkingSpeed = 1;
        this.setFoundPlayer(false);
        this.setActive(true);
		this.playerDetectionRange = 300;
		this.playerLosingRange = 400;
    }
    
    public void act() 
    {
		super.act();
		
		if (this.wander)
			this.wanderThroughMap();

		finishUp();
    }

	protected void decease()
	{
	    Random r = this.random;
	
		// leave a pickup at all
		int first = r.nextInt(4)+1;
		int second = r.nextInt(first);
		boolean leavePickup = (second != 0)? true : false;
		
		// leave something random by default
		this.deceaseByLeavingPickup(leavePickup);
		
		super.decease();
	}
	
	protected void calculateNextPosition()
	{
		boolean invertX = (Greenfoot.getRandomNumber(2) == 1);
		boolean invertY = (Greenfoot.getRandomNumber(2) == 1);
		
		int moveX = Greenfoot.getRandomNumber(50);
		moveX = (invertX)? -(moveX) : moveX;
		
		int moveY = Greenfoot.getRandomNumber(50);
		moveY = (invertY)? -(moveY) : moveY;
		
		this.nextPositionX = this.getX() + moveX;
		this.nextPositionY = this.getY() + moveY;
		
		while (this.nextPositionX < 5)
			this.nextPositionX += 10;
			
		while (this.nextPositionY < 5)
			this.nextPositionY += 10;
			
		while (this.nextPositionX > 695)
			this.nextPositionX -= 10;
			
		while (this.nextPositionY > 695)
			this.nextPositionY -= 10;
		
		this.rotateTowardsWanderPoint();
		
		if (Options.debug)
		{
			// System.out.println(String.format("%d / %d", moveX, moveY));
		}
	}
}
