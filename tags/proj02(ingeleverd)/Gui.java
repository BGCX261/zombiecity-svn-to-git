// $Id: Gui.java 149 2012-01-18 16:04:54Z rutgervanaalst $

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gui here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gui extends Actor
{
     private GreenfootImage gui = new GreenfootImage("Gui.png");

    /**
     * Act - do whatever the Gui wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        draw();
    }
    
    public void draw()
    {
        setImage(gui);
    }
}
