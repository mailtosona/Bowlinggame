

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class BowlingGameTest {
    private int score=0;
    public BowlingGame game=new BowlingGame();
@Test
    public void rollingOneScoresOne() throws Exception
{

    game.roll(1);
    assertEquals(1,game.score());
}
    @Test
    public void roliingTwoScoresTwo() throws Exception
{
    game.roll(2);
    assertEquals(2,game.score());
}
    @Test
    public void rollingASpareThanOneScoresTwo() throws Exception
    {
        for (int i=0;i<2;i++)
        game.roll(1);
        assertEquals(2,game.score());
    }
    @Test
    public void rollingASpareThanOneScoresTwelve() throws Exception
    {
   game.roll(5);
   game.roll(5);
   game.roll(1);
   assertEquals(12,game.score());
    }
    @Test
    public void rollingASpareThanOneScoresThirteen() throws Exception
    {
        game.roll(1);
        game.roll(1);
        game.roll(5);
        game.roll(5);
        game.roll(1);
        assertEquals(14,game.score());
    }
    protected void rollspare()
    {
        game.roll(5);
        game.roll(5);
    }

}