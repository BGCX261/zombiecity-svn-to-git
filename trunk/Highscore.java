import java.util.*;
import java.io.*;

public class Highscore  
{
    private ArrayList<Score> scores;
    private static final String HIGHSCORE_FILE = "scores.dat";
    ObjectOutputStream outputStream = null;
    ObjectInputStream inputStream = null;
    
    public Highscore() 
    {
        scores = new ArrayList<Score>();
    }
        
    public ArrayList<Score> getScores() 
    {
        loadScoreFile();
        sort();
        return scores;
    }
    
    public void sort()
    {
        ScoreComparator comparator = new ScoreComparator();
        Collections.sort(scores, comparator);
    }
    
    public void addScore(String name, int score)
    {
        loadScoreFile();
        scores.add(new Score(name, score));
        updateScoreFile();
    }
    
    public void loadScoreFile()
    {
        try 
        {
            inputStream = new ObjectInputStream(new FileInputStream(HIGHSCORE_FILE));
            scores = (ArrayList<Score>) inputStream.readObject();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("Highscores worden aangemaakt..");
        }
        catch (IOException e)
        {
            System.out.println("[Laad] IO Error: " + e.getMessage());
        }
        catch (ClassNotFoundException e)
        {
            System.out.println("[Laad] CNF Error: " + e.getMessage());
        }
        finally
        {
            try 
            {
                if (outputStream != null)
                {
                    outputStream.flush();
                    outputStream.close();
                }
            }
            catch (IOException e)
            {
                System.out.println("[Laad] IO Error: " + e.getMessage());
            }
        }
    }
     
    public void updateScoreFile()
    {
        try
        {
            outputStream = new ObjectOutputStream(new FileOutputStream(HIGHSCORE_FILE));
            outputStream.writeObject(scores);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("[Update] FNF Error: " + e.getMessage() + ",the program will try and make a new file");
        }
        catch (IOException e)
        {
            System.out.println("[Update] IO Error: " + e.getMessage());
        }
        finally
        {
            try
            {
                if (outputStream != null)
                {
                    outputStream.flush();
                    outputStream.close();
                }
            }
            catch (IOException e)
            {
                System.out.println("[Update] Error: " + e.getMessage());
            }
        }
    }
    
    public String getHighscoreString()
    {
        String highscoreString = "";
        ArrayList<Score> scores;
        scores = getScores();
        
        for( int i = 0; i < ( scores.size() > 10 ? 10 : scores.size() ); i++ )
        {
            highscoreString +="\r\n" + (i + 1) + ".\t" + scores.get(i).getNaam() + "\t\t" + scores.get(i).getScore() ;
        }
        
        return highscoreString;
    }
}
