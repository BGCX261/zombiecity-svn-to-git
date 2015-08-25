// $Id: Glock.java 149 2012-01-18 16:04:54Z rutgervanaalst $

import greenfoot.*  ;// (World, Actor, GreenfootImage, Greenfoot and MouseInfo
import java.util.Timer;
import java.util.TimerTask;
/**
 * Write a description of class Glock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Glock extends Weapon
{
    /**
     * Act - do whatever the Glock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Glock(World world)
    {	
        this.name="Glock";
        this.clipSize = 10;
        this.maxAmmo = 60;
        this.currentAmmo = 50;
        this.currentClip = 10;
        this.shootSpeed = 300;
        this.damage = 20;
        this.reloadTime = 1500;
        this.range = 700;
        this.world = world;
    }
}
