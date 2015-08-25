// $Id: Map.java 149 2012-01-18 16:04:54Z rutgervanaalst $

/**
 * Write a description of class Map here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Map  
{
    protected Player player;
    protected Tree tree = new Tree();
    protected Gui gui = new Gui();
    protected Enemy e = new EnemyZombie();
    
    // instance variables - replace the example below with your own
    private int mapId;

    public Map()
    {
        player = Worlds.player;
    }
    
    public void makeWorld() {}
    public void checkLevel() {}
    
    public void setMap( int i )
    {
        this.mapId = i;
    }
}
