import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

import static java.awt.Font.PLAIN;

public class DrawText extends Actor
{
    private String message;
    private GreenfootImage image;
    
    public DrawText( String message )
    {
        this.message    = message;
        this.image      = new GreenfootImage( 300, 500 );
        this.draw();
    }
    
    public void draw()
    {
        image.setColor( Color.white );
        image.setFont(new Font("Serif", PLAIN, 16 ) );
        image.drawString( this.message, 50, 225 );
        setImage( image );
    }
    
    public void act()
    {
        
    }
}
