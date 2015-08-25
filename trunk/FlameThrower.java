import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.TimerTask;
/**
 * Write a description of class FlameThrower here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FlameThrower extends Weapon
{
    /**
     * Act - do whatever the FlameThrower wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

     private Boolean isTimerActive = false;
     private int ammoTimer = 200;

    public FlameThrower(World world)
    {
        this.name="Flame Thrower";
        this.clipSize = 30;
        this.maxAmmo = 120;
        this.currentAmmo = 60;
        this.currentClip = 30;
        this.shootSpeed = 80;
        this.damage = 1;
        this.reloadTime = 1500;
        this.range = 700;
        this.world = world;
    }

    public void shootAction(int x,int y, World world, int rotation){

        if(this.currentClip > 0 && !this.reloading){
    		int radius = 18;
    		double angle = Math.toRadians(rotation);

    		double myx = Math.cos(angle) * radius;
    		double myy =  Math.sin(angle) * radius;

    		myx += x;
    		myy += y;

        	Flame[] flame = new Flame[10];
            for(int i = 0;i < flame.length;i++){
                flame[i] = new Flame((rotation + (Greenfoot.getRandomNumber(40) - 20)),2,false,true,true,false, this.damage);
                world.addObject(flame[i],(int) myx ,(int) myy );
                addedToWorld(world);
            }

            if(!isTimerActive){
                isTimerActive = true;
                currentClip--;
                final Timer t = new Timer();

                t.schedule(new TimerTask(){
                    public void run(){
                        isTimerActive=false;   
                    }
                }, this.ammoTimer);    
                
            }
        }
    }
}
