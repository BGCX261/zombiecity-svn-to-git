// $Id: Worlds.java 149 2012-01-18 16:04:54Z rutgervanaalst $

import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.*;
import java.awt.event.*;

public class Worlds extends World
{
    public  static int score = 0;
    public  static String playerName = "New Player";
    
    private Map[] maps = new Map[8];
    private Map currentMap;
    public static Player player = new Player();
    private Boolean submitedScore = false;

    public Worlds()
    {
        super(700, 700, 1);
        playerName = JOptionPane.showInputDialog(null, "Enter player name : ", "Zombie City", 1);
        addObject(new Hoofdmenu( this ), 350, 350);
        Greenfoot.start();
    }

    public void act()
    {
        if( !(this.player.isAlive) ) 
        {
            if(!submitedScore){
                Highscore hs = new Highscore();
                hs.addScore(playerName, score); 
                submitedScore = true;
            }

            this.cleanWorld();
            this.changeMap(7);

            return;
        }
        
        if( this.currentMap != null )
            this.currentMap.checkLevel();
    }

    public void setWorld()
    {
        if( !(this.player.isAlive) )  {
            removeObjects(getObjects(Player.class));
            this.player = new Player();
        }
        
        maps[0] = new MapOne( this );
        maps[1] = new MapTwo( this );
        maps[2] = new MapThree( this );
        maps[3] = new MapFour( this );
        maps[4] = new MapFive( this );
        maps[5] = new MapSix( this );
        maps[6] = new MapSeven( this );
        maps[7] = new GameOver( this );
        
        changeMap(0);
    }


    /**
     * Removes all objects from the screen.<br>
     * Used when the player moves to another level.
     */
    public void cleanWorld()
    {
        removeObjects(getObjects(EnemyZombie.class));
        removeObjects(getObjects(EnemyPickup.class));
        removeObjects(getObjects(Invisiblewall.class));
        removeObjects(getObjects(Tree.class));
        removeObjects(getObjects(TextTrigger.class));
    }

    public void changeMap( int map )
    {        
        this.currentMap = this.maps[map];
        this.currentMap.makeWorld();
    }
}
