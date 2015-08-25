import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Map
{
    private Worlds world;
    
    public GameOver( Worlds world )
    {
        this.world = world;
    }
    
    public void makeWorld()
    {
        this.world.removeObjects(this.world.getObjects(Gui.class));
        this.world.removeObjects(this.world.getObjects(HealthBar.class));
        this.world.removeObjects(this.world.getObjects(Player.class));
        
        world.setBackground("gameover.png");
        
        Restart restart = new Restart( this.world );
        this.world.addObject(restart, 351, 465);
   
        Highscores highscore = new Highscores( this.world );
        this.world.addObject(highscore, 351, 525);
    }
}
