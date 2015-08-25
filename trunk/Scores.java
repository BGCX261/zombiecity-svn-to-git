import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;


public class Scores extends Button
{
    private Worlds world;
    
    public Scores( Worlds world )
    {
        this.world = world;    
    }
    
    public void act()
    {
        getWorld().removeObjects(getWorld().getObjects(Start.class));
        getWorld().removeObjects(getWorld().getObjects(Instructions.class));
        getWorld().removeObjects(getWorld().getObjects(Credits.class));
        getWorld().removeObjects(getWorld().getObjects(Highscores.class));
        getWorld().removeObjects(getWorld().getObjects(Exit.class));
     
        GreenfootImage gi = new GreenfootImage("highscores_bg.png");
        Highscore hm = new Highscore();

        String scoreString[] = hm.getHighscoreString().split("\r\n");

        for(int i = 0; i < scoreString.length; i++){
            String line = scoreString[i].replace("\t" , " : ");
            gi.setColor(Color.white);
            gi.drawString(line, 80, 30 * i + 150);
        }
        
        setImage(gi);
        
        Back back = new Back( this.world );
        this.world.addObject(back, 250, 665);
    }
}
