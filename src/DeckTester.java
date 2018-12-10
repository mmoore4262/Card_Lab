import java.util.ArrayList;

public class DeckTester {
    public static void main(String[] args)
    {
        ArrayList<Card> unDealt= new ArrayList<Card>();
        String[] rank= {"Jack","King","Queen","Ace","2","3","4","5","6","7","8","9","10"};

        String[] suit= {"Hearts","Clubs","Spades","Diamonds"};
        int[] pointValue={1,2,3,4,5,6,7,8,9,10};
        for (int i=0; i< 5; i++)
        {
            Card sample= new Card (rank[(int)Math.random()*13], suit[(int)Math.random()*4],pointValue[(int)Math.random()*10]);
            unDealt.add(sample);
            System.out.println(unDealt.get(i).toString());
        }
    }
}
