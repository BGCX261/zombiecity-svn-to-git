import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.util.*;
/**
 * Write a description of class Flame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Flame  extends SmoothMover
{
    private static GreenfootImage[] flame;
    private static GreenfootImage[] smallFlame;
    private int image = 0;
    private int lastImage;
    private boolean small;
    private boolean burnOil;
    private boolean burnZombie = true;
    private boolean burnPlayer = true;
    private int damage;

    /**
     * Act - do whatever the Flame wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Flame(){
        initialiseImages();
        small = false;
        burnOil = false;
        lastImage = (60 - Greenfoot.getRandomNumber(10));
    }
    public Flame(boolean s){
        initialiseImages();
        small = s;
        burnOil = false;
        lastImage = (60 - Greenfoot.getRandomNumber(10));
    }
    public Flame(boolean s,boolean o){
        initialiseImages();
        small = s;
        burnOil = o;
        lastImage = (60 - Greenfoot.getRandomNumber(10));
    }
    public Flame(boolean s,boolean o, boolean z){
        initialiseImages();
        small = s;
        burnOil = o;
        burnZombie = z;
        lastImage = (60 - Greenfoot.getRandomNumber(10));
    }
    public Flame(boolean s,boolean o, boolean z, boolean p){
        initialiseImages();
        small = s;
        burnOil = o;
        burnZombie = z;
        burnPlayer = p;
        lastImage = (60 - Greenfoot.getRandomNumber(10));
    }
    public Flame(int r, int d){
        initialiseImages();
        setRotation(r);
        small = false;
        burnOil = false;
        addForce(new Vector(r, d));
        lastImage = (60 - Greenfoot.getRandomNumber(10));
    }
    public Flame(int r, int d, boolean s){
        initialiseImages();
        small = s;
        burnOil = false;
        setRotation(r);
        addForce(new Vector(r, d));
        lastImage = (60 - Greenfoot.getRandomNumber(10));
    }
    public Flame(int r, int d, boolean s,boolean o){
        initialiseImages();
        small = s;
        burnOil = o;
        setRotation(r);
        addForce(new Vector(r, d));
        lastImage = (60 - Greenfoot.getRandomNumber(10));
    }
    public Flame(int r, int d, boolean s,boolean o,boolean z){
        initialiseImages();
        small = s;
        burnOil = o;
        burnZombie = z;
        setRotation(r);
        addForce(new Vector(r, d));
        lastImage = (60 - Greenfoot.getRandomNumber(10));
    }
    public Flame(int r, int d, boolean s,boolean o,boolean z, boolean p){
        initialiseImages();
        small = s;
        burnOil = o;
        burnZombie = z;
        burnPlayer = p;
        setRotation(r);
        addForce(new Vector(r, d));
        lastImage = (60 - Greenfoot.getRandomNumber(10));
    }
    public Flame(int r, double d, boolean s,boolean o,boolean z, boolean p ,int damage){
        initialiseImages();
        small = s;
        burnOil = o;
        burnZombie = z;
        burnPlayer = p;
        setRotation(r);
        addForce(new Vector(r, d));
        lastImage = (60 - Greenfoot.getRandomNumber(10));
        this.damage = damage;
    }

    public synchronized static void initialiseImages() {
        if(flame == null) {
            flame = new GreenfootImage[60];
            smallFlame = new GreenfootImage[60];
            Color color;
            for(int x = 0;x < flame.length;x++){
                flame[x] = new GreenfootImage(10,10);
                smallFlame[x] = new GreenfootImage(5,5);
                color = new Color((255 - (x * 2)),(255 - (x * 4)),0,(180 - (x * 3)));//start:(255,50,0,255) end:(15,20,0,100)
                flame[x].setColor(color);
                smallFlame[x].setColor(color);
                flame[x].fillOval(0,0,10,10);
                smallFlame[x].fillOval(0,0,5,5);
            }
        }
    }
    public void addedToWorld(World world){
        if(small){
            setImage(smallFlame[image]);
        }
        else{
            setImage(flame[image]);
        }
    }
    public void act() 
    {
        if(small){
            setImage(smallFlame[image]);
        }
        else{
            setImage(flame[image]);
        }
        //checkHit();
        move();
        image++;
        if(image >= lastImage){
            getWorld().removeObject(this);
        }
    }
    
    public void setSize(){
        small = !small;
    }

    public int getDamage(){
        return this.damage;
    }
}
