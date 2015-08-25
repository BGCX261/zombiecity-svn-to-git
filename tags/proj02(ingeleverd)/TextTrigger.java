import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextTrigger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextTrigger  extends Actor
{
    private OnscreenText textImage;
    private String text;
    private int size;
    /**
     * Act - do whatever the TextTrigger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public TextTrigger(String s, int i){
        text = s;
        size = i;
        textImage = new OnscreenText(text, size, false);

        setImage(new GreenfootImage(10, 10));
    }
    public void addedToWorld(World world){
            getWorld().addObject(textImage,1,1);
            textImage.centerImage();
    }
    public void act() 
    {
        Actor player = getOneIntersectingObject(Player.class);
        if(player != null){
            textImage.setTimer(1);
        }
    }    
}
