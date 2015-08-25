// $Id: OnscreenText.java 149 2012-01-18 16:04:54Z rutgervanaalst $

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Font;
import java.awt.Color;
/**
 * Write a description of class OnscreenText here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OnscreenText  extends Actor
{
    private String text;
    private GreenfootImage image;// = new GreenfootImage(1,1);
    private GreenfootImage empty = new GreenfootImage(1,1);
    private Font font;
    private Color color;
    private int size;
    private int timer = 0;
    private boolean fixed;
    /**
     * Act - do whatever the OnscreenText wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public OnscreenText(String s, int i, boolean b){
        text = s;        
        size = i;
        fixed = b;
        if(b)
            timer = 10;
        createImage();
    }
    private int longestSringLength(String[] s)
    {
        int longest = 0;
        
        for(int x = 0;x < s.length;x++)
        {
            if(s[x].length() > s[longest].length())
            {
               longest = x;
            }
        }
        //System.out.println(s[longest].length());
        return s[longest].length();
    }
    public void addedToWorld(World world){
        setImage(empty);
    }
    public void act() 
    {
        if(timer > 0){
            setImage(image);
        }
        if(timer <= 0){
            setImage(empty);
        }
        if(timer > 0 && !(fixed))
            timer--;
    }
    public void createImage(){
        text = text+"\n";
        String[] lines = text.split("\r\n|\r|\n");
        int longestString = longestSringLength(lines);
        image = new GreenfootImage((int)((size * longestString) /1.6),(lines.length * size) + size +5);
        image.setColor(new Color(255,255,255, 128));
        image.fillRect(0, 0, (int)((size * longestString)/1.6+size), (lines.length * size) + size + 5);
        image.setColor(new Color(0, 0, 0, 128));
        image.fillRect(5, 5, (int)((size * longestString)/1.6-10), ((lines.length * size)+ (size -5)));
        
        font = new Font("courier",0,size);
        font = font.deriveFont((float)size);
        image.setFont(font);
        image.setColor(new Color(255,255,255, 255));
        font = new Font("courier",0,size);
        for(int x = 0;x < lines.length;x++)
        {
            image.drawString(lines[x],10,(size * x) + (size + 5));
        }
        
    }
    public void setTimer(int i){
        timer = i;
    }
    public void centerImage(){
        setLocation(350,350);
    }
}
