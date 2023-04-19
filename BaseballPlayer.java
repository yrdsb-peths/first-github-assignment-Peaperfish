public class BaseballPlayer
{
    private int hits;
    private int atBats;
    private String name;
    
    public BaseballPlayer(String theName, int theHits, int theAtBats)
    {
        name = theName;
        hits = theHits;
        atBats = theAtBats;
    }
    
    public String toString()
    {
        return name + ": " + hits + "/" + atBats;
    }
    
    public double getBattingAverage() {
        if (atBats == 0) {
            return 0.0;
        } else {
            return (double) hits / atBats;
        }
    }
}
