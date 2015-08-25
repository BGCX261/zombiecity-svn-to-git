// $Id: EnemyPickup.java 149 2012-01-18 16:04:54Z rutgervanaalst $

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.File;
import java.util.*;
import java.util.List;

/**
 * Write a description of class EnemyPickup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class EnemyPickup extends Actor
{
    public EnemyPickup_t PICKUP_TYPE;
    
    enum EnemyPickup_t
    {
        HEALTH, //(0x01),
        FLAME_THROWER, //(0x02),
        // GRENADES, //(0x03),	// Y U NO HAVE GRENADES. because, fuck you. thats why.
        GLOCK, //(0x04),        // seperate these two to pick up 
        MACHINEGUN; //(0x05);   // a different amount of bullets
        
        private int value;
        public int getValue() { return value; }
    };
    
    public abstract int doPickup();

    public static EnemyPickup_t randomPickup_t()
    {
        List<EnemyPickup_t> values = Collections.unmodifiableList(Arrays.asList(EnemyPickup_t.values()));
        int s = values.size();
        Random r = new Random();
        return values.get(r.nextInt(s));
    }

    public static EnemyPickup getPickupFromEnum(EnemyPickup_t t)
    {
        EnemyPickup enp;
        switch (t) 
        {
            case HEALTH:
                enp =  new EnemyPickup_Health();
                break;
            case FLAME_THROWER:
                enp = new EnemyPickup_FlameThrower();
                break;
            // case GRENADES:
            //     enp = new EnemyPickup_Grenades();
            //     break;
            case GLOCK:
                enp = new EnemyPickup_Glock();
                break;
            case MACHINEGUN:
                enp = new EnemyPickup_Machinegun();
                break;
            default:
                enp = new EnemyPickup_Health();
                break;
        }
        return enp;
    }
    
    public void act() 
    {
        // keep this method! even when it's empty (EnemyPickup inheritance)
    }
}


class EnemyPickup_Health extends EnemyPickup
{
    private int _amount;
    
    public EnemyPickup_Health()
    {
        this.__init(25);
    }

    public EnemyPickup_Health(int a)
    {
        this.__init(a);
    }

    private void __init(int a)
    {
        this.PICKUP_TYPE = EnemyPickup.EnemyPickup_t.HEALTH;
        setImage("enemy_pickups/healthpack.png");
        this._amount = a;
    }
    
    public int doPickup()    
	{
        return this._amount;
    }
}

class EnemyPickup_FlameThrower extends EnemyPickup
{
    private int _amount;
        
    public EnemyPickup_FlameThrower()
    {
        this.__init(250);
    }

    public EnemyPickup_FlameThrower(int a)
    {
        this.__init(a);
    }
    
    private void __init(int a)
    {
        this.PICKUP_TYPE = EnemyPickup.EnemyPickup_t.FLAME_THROWER;
        setImage("enemy_pickups/flamethrower.png");
        this._amount = a;
    }
    
    public int doPickup()    
	{
        return this._amount;
    }
}

class EnemyPickup_Glock extends EnemyPickup
{
    private int _amount;

    public EnemyPickup_Glock()
    {
        this.__init(20);
    }

    public EnemyPickup_Glock(int a)
    {
        this.__init(a);
    }

    private void __init(int a)
    {
        this.PICKUP_TYPE = EnemyPickup.EnemyPickup_t.GLOCK;
        setImage("enemy_pickups/glock.png");
        this._amount = a;
    }
    
    public int doPickup()    
	{
        return this._amount;
    }
}

class EnemyPickup_Machinegun extends EnemyPickup
{
    private int _amount;

    public EnemyPickup_Machinegun()
    {
        this.__init(100);
    }

    public EnemyPickup_Machinegun(int a)
    {
        this.__init(a);
    }

    private void __init(int a)
    {
        this.PICKUP_TYPE = EnemyPickup.EnemyPickup_t.MACHINEGUN;
        setImage("enemy_pickups/machinegun.png");
        this._amount = a;
    }
    
    public int doPickup()    
	{
        return this._amount;
    }
}

// class EnemyPickup_Grenades extends EnemyPickup
// {
// 	private int _amount;
// 
//     public EnemyPickup_Grenades()
//     {
//         this.__init(2);
//     }
// 
//     public EnemyPickup_Grenades(int a)
//     {
//         this.__init(a);
//     }
// 
//     private void __init(int a)
//     {
//         this.PICKUP_TYPE = EnemyPickup.EnemyPickup_t.GRENADES;
//         setImage("enemy_pickups/grenade.png");
//         this._amount = a;
//     }
//     
		// public int doPickup()
		// {
		// 	return this._amount;
		// }
// }
