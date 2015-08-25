// $Id: Weapon.java 102 2012-01-17 20:28:24Z steven@stevencranham.com $

import greenfoot.*; 
import java.util.Timer; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.TimerTask;

/**
* Write a description of class Weapon here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class Weapon extends Actor
{
    /**
    * Act - do whatever the Weapon wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    protected int clipSize;
    protected int maxAmmo;
    protected int currentClip;
    protected String name;
    protected int range;
    protected int damage;
    protected int reloadTime;
    protected int shootSpeed;
    protected int currentAmmo;
    protected MouseInfo lastmouse;
    protected MouseInfo mouse;
    protected World world;
    protected Boolean reloading = false;
    protected Boolean shooting = false;

    public void act()
    {

    }

    public void shoot(int x,int y, World world, int rotation){
        if(!this.shooting && !this.reloading){

            shootAction(x,y,world,rotation);

            this.shooting = true;

            Timer timer = new Timer();

            timer.schedule(new TimerTask(){
                public void run(){
                    shooting=false;
                }
            }, this.shootSpeed);
        }
    }

    public void shootAction(int x,int y, World world, int rotation){
        int accuracy = 1;
        int accuracySkill = 1;
        this.world = world;

        if(this.currentClip > 0){
            this.currentClip--;

            int angle = rotation;
            Greenfoot.playSound("HandGunShot.mp3");
            Bullet bullet = new Bullet(new Vector(angle,15),(int)(angle + ((Greenfoot.getRandomNumber((accuracy * 2)) - accuracy) * accuracySkill)),this.damage,3);
            bullet.setBulletEffect(Bullet.Effect_t.DAMAGE.getValue() | Bullet.Effect_t.CONFUSION.getValue());
            // System.out.println(bullet.readableEffect(bullet.getBulletEffect()));
            bullet.readableEffect();

            world.addObject(bullet,x,y);
        }  
    }

    public int pointTo( int x, int y )
    {
        int pX = x - getX();
        int pY = y - getY();

        double  rotation = Math.atan2( pY, pX ); 
        rotation = Math.toDegrees(rotation);

        return (int) rotation;
    }

    public void reload(){
        if(!this.reloading){

            this.reloading = true;
            reloadAction(); 

            final Timer t = new Timer();

            t.schedule(new TimerTask(){
                public void run(){
                    reloading=false;
                    this.cancel();    
                }
                }, this.reloadTime);

            }        
        }

        private void reloadAction(){

            int ammoNeeded = this.clipSize - this.currentClip;
            if(this.currentAmmo - ammoNeeded > 0){
                this.currentAmmo -= ammoNeeded;
                this.currentClip += ammoNeeded;
                Greenfoot.playSound("HandGunReload.mp3");
            }else{
                this.currentClip += this.currentAmmo;
                this.currentAmmo = 0;
                Greenfoot.playSound("HandGunReload.mp3");
            }
        }  
        
        public void addAmmo(int a){
            int newAmmo = (currentAmmo + a);

            if(newAmmo > maxAmmo)
            {
                currentAmmo = maxAmmo;
            }else{
                currentAmmo = newAmmo;
            }
        }  
    }
