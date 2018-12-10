public class Card {
    private String rank;
    private String suit;
    private int pointValue;
     public Card( String rank, String suit, int pointValue)
     {
         this.rank=rank;
         this.suit=suit;
         this.pointValue=pointValue;
     }
     private String rankGetter()
     {
         return (this.rank);
     }
    private String suitGetter()
    {
        return (this.suit);
    }
    private int pointValueGetter()
    {
        return (this.pointValue);
    }
    public boolean equals(Card otherCard)
    {
        if (otherCard.rankGetter()==this.rankGetter())
        {
            return true;
        }
        return false;
    }
    public String toString()
    {
        return (""+ this.rankGetter()+ " "+ this.suitGetter() + "" + this.pointValueGetter());
    }

}
