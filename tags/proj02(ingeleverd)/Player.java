// $Id: Player.java 149 2012-01-18 16:04:54Z rutgervanaalst $

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.util.List;


/**
 * Player class
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    private int speed = 2;
    // private double speed = 2.0;
    private boolean shooting;
    private int health = 100;
    private HealthBar hpBar;
    private Weapon currentWeapon;
    private Weapon primaryWeapon;
    private Weapon secondaryWeapon;
    public boolean isAlive = true;

    private MouseInfo mouse;
    public static int mouseX;
    public static int mouseY;
    private boolean mouseButtonDown =false;
    
    public Player() 
    {
        this.health = 100;
        this.hpBar = new HealthBar(this.health);
        World w = getWorld();
        
        this.primaryWeapon = new Glock(w);
        this.secondaryWeapon = null;
        this.currentWeapon = this.primaryWeapon;
    }
    
    public void addedToWorld(World world){
        this.hpBar = new HealthBar(this.health);
        if (this.hpBar != null)
            getWorld().addObject(this.hpBar, 148 ,21);
    }
    
    public void act() 
    {
        
        if(this.isAlive){
            MousePosition();
            Movement();
        }
        int x =0;
        int y = 0;

        enemyCollision(x, y);
        itemCollision(x, y);
    }
    
    public void MousePosition()
    {
        mouse   = Greenfoot.getMouseInfo();
        
        if( Greenfoot.mouseMoved( null ) || Greenfoot.mouseDragged( null ) )
        {
            
            mouseX  = mouse.getX();
            mouseY  = mouse.getY();
        }
        
        setRotation( pointTo( mouseX, mouseY ) );
    }


    
    public void Movement()
    {
        int x       = 0;
        int y       = 0;
        int radius  = 5;
        
        String key = Greenfoot.getKey();
        

        
        if(Greenfoot.mousePressed(null) == true)
        {
            mouseButtonDown = true;
        }
        else if((Greenfoot.mouseClicked(null) == true))
        {
           mouseButtonDown = false;
        }
   
        
        if( Greenfoot.isKeyDown( "W" ) || Greenfoot.isKeyDown("up") )
        {
            y-=radius;
            if(!hasCollision(x,y)){
                setLocation( getX(), getY() - speed );
            }
        }
        if( Greenfoot.isKeyDown( "S" ) || Greenfoot.isKeyDown("down") )
        {
            y=radius;
            if(!hasCollision(x,y)){
                setLocation( getX(), getY() + speed );
            }
        }
        if( Greenfoot.isKeyDown( "A" ) || Greenfoot.isKeyDown("left") )
        {
            x-=radius;
            if(!hasCollision(x,y)){
                setLocation( getX() - speed, getY() );
            }
        }
        if( Greenfoot.isKeyDown( "D" ) || Greenfoot.isKeyDown("right") )
        {
            x=radius;
            if(!hasCollision(x,y)){
                setLocation( getX() + speed, getY() );
            }
        }     
        
        if( mouseButtonDown ) {
          this.Shoot();
        }
        
        if( Greenfoot.isKeyDown( "R" ) ) {
            this.reload();
        }
        
        if( Greenfoot.isKeyDown( "C" ) ) {
            Options.setDebugMode( ( Options.getDebugMode() == true ) ? false : true );
        }
        if( Greenfoot.isKeyDown( "escape" ) ) {
            Greenfoot.stop();
        }
        
        if( key!=null && key.equals("1")){
          this.currentWeapon = this.primaryWeapon;
        }
        
        if( key!=null && key.equals("2") && this.secondaryWeapon != null){
          this.currentWeapon = this.secondaryWeapon;
        }
    }
       
    public void Shoot()
    {
        this.currentWeapon.shoot(getX(), getY(), getWorld(),pointTo(mouseX, mouseY));
    }
    
    public void reload(){
        this.currentWeapon.reload();
    }
     
    public int pointTo( int x, int y )
    {
        int pX = x - getX();
        int pY = y - getY();
        
        double  rotation = Math.atan2( pY, pX ); 
                rotation = Math.toDegrees(rotation);

        return (int) rotation;
    }
        
    public void damagePlayer(int damage)
    {
        int newHealth = this.health - damage;
        this.health = ( newHealth > 0 ) ? this.health - damage : 0;            
        this.hpBar.updateHealthBar(this.health);
    }
    
    private boolean hasCollision(int x, int y)
    {
        Tree t = (Tree) getOneObjectAtOffset(x,y , Tree.class);
        if(t != null) {
            return true;
        }
        
        Invisiblewall iw = (Invisiblewall) getOneObjectAtOffset(x,y , Invisiblewall.class);
        if(iw != null)
        {
            return true;
        }

        return false;

    }

    private void enemyCollision(int x, int y){
        List ew = getObjectsInRange(1, EnemyWeapon.class);
        if (!ew.isEmpty())
        {
            int size = ew.size();
            for (int i = 0; i < size; i++)
            {
                EnemyWeapon e = (EnemyWeapon) ew.get(i);
                
                if(Options.debug)
                    System.out.println(String.format("auw =( : %d / %d", this.health, (this.health - e.getDamage())));
                
                this.setHealth(this.health - e.getDamage());
                getWorld().removeObject(e);
            }
        }
    }


    private void itemCollision(int x, int y){
        EnemyPickup ep = (EnemyPickup) getOneObjectAtOffset(x,y, EnemyPickup.class);

        if(ep != null){
            EnemyPickup.EnemyPickup_t s = ep.PICKUP_TYPE;

            switch(s){
                case FLAME_THROWER :
                    setWeapon(new FlameThrower(getWorld()), ep);
                    break;
                case MACHINEGUN :
                   setWeapon(new MachineGun(getWorld()), ep);
                    break; 
                case GLOCK :
                    setWeapon(new Glock(getWorld()), ep);
                    break; 
                case HEALTH : 
                    this.addHealth(ep.doPickup());
                    getWorld().removeObject(ep);
                    break;
            }
        }
        
    }

    private void setWeapon(Weapon w, EnemyPickup ep)
    {
        if(secondaryWeapon == null){
            this.secondaryWeapon = w;
        }else{
            if(primaryWeapon.getClass() == w.getClass())
            {
                primaryWeapon.addAmmo(ep.doPickup());
            }else if(this.secondaryWeapon.getClass() == w.getClass()){
                this.secondaryWeapon.addAmmo(ep.doPickup());
            }else{
                this.currentWeapon = w;
            }
        }

        getWorld().removeObject(ep);
    }

    /**
     * This method checks the players x position and sets the shouldScroll boolean accordingly.
     * @param The x value limits within which scrolling is not required for left/right movement.
     */
    public void updateShouldScroll(int minX, int maxX)
    {
        int playerX = getX();
        boolean shouldScroll = ( playerX <= minX || playerX >= maxX ) ? true : false;
        
        if(shouldScroll == true && (playerX >= 400 && Greenfoot.isKeyDown("left")) || (playerX <= 200 && Greenfoot.isKeyDown("right")))
        {
            shouldScroll = false;
        }
    }




    public void addHealth(int h)
    {
        this.setHealth(this.getHealth() + h);
    }

    //[[region(getters & setters):
    public void setHealth(int health)
    {
        if(health <= 0 ){
            this.health = 0;
            calculateScore();     
            return;
        }else if(health >= 100){
            this.health = 100;
        }else{
            this.health = health;
        }

        this.hpBar.updateHealthBar(this.health);
        this.hpBar.draw();
        
    }
    
    public int getHealth()
    {
        return this.health;
    }
    //]]

    public void calculateScore(){
        int score = (this.primaryWeapon.currentAmmo + this.primaryWeapon.currentClip) * 2;
        if(secondaryWeapon != null)
            score += (this.secondaryWeapon.currentAmmo + this.secondaryWeapon.currentClip ) * 2;
        score += this.health * 5;

        Worlds.score += score;

        this.isAlive = false;
    }
}
    
