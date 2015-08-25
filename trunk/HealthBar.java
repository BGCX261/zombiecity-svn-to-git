// $Id: HealthBar.java 119 2012-01-18 11:33:09Z steven@stevencranham.com $

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class HealthBar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class HealthBar  extends Actor
{
    /**
     * Act - do whatever the HealthBar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private GreenfootImage healthBar = new GreenfootImage(150,32);
    private int value = 100;
    private Font font;
    private float size = 20;
    public HealthBar()
    {
        draw();
    }
    public HealthBar(int i)
    {
        value = Math.round(i);
        draw();
    }
    public void act() 
    {
        // Add your action code here.
    }
    public void updateHealthBar(int i)
    {
        value = Math.round(i);
        draw();
    }
    public void draw(){
        healthBar.clear();
        healthBar.setColor(Color.RED);
        healthBar.fill();
        healthBar.setColor(new Color(0,192,0,255));
        healthBar.fillRect(0,0, (int)(1.5 * value), 33);
        healthBar.setColor(Color.BLACK);
        
        font = new Font("courier",0,(int)size);//image.getFont();
        font = font.deriveFont(size);
        healthBar.setFont(font);
        
        healthBar.drawString(""+value+"%", 50, 22);
        setImage(healthBar);
    }
}
