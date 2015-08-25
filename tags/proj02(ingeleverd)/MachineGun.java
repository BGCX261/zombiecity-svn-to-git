import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Timer;
import java.util.TimerTask;

/**
* Write a description of class MachineGun here.
* 
* @author (your name) 
* @version (a version number or a date)
*/
public class MachineGun extends Weapon
{
    /**
    * Act - do whatever the MachineGun wants to do. This method is called whenever
    * the 'Act' or 'Run' button gets pressed in the environment.
    */
    private MouseInfo lastmouse;
    private MouseInfo mouse;
    private World world;
    private Boolean reloading = false;
    private Boolean shooting = false;
    
    public MachineGun(World world)
    {
        this.name="Machine Gun";
        this.clipSize = 30;
        this.maxAmmo = 120;
        this.currentAmmo = 60;
        this.currentClip = 30;
        this.shootSpeed = 100;
        this.damage = 15;
        this.reloadTime = 1500;
        this.range = 700;
        this.world = world;
        
    }
}
