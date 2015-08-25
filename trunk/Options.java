/**
 * Alle opties van het spel zullen hier kunnen worden bewerkt, klasse werd voornamelijk voor de debugmode aangemaakt.
 * 
 * @author Niels van der Beek
 * @version 1.0
 */
public abstract class Options  
{
    public static boolean debug = false;
    
    public static void setDebugMode( boolean mode )
    {
        debug = mode;
    }

    public static boolean getDebugMode()
    {
        return debug;
    }
}
