import org.junit.Assert;
import org.junit.Test;

public class RockPaperScissorsGameTest {
    @Test
    public void showWinner(){
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame();
        int result = rockPaperScissorsGame.checkIfYouWinner("rock", "rock");
        Assert.assertEquals(0, result);

        int result1 = rockPaperScissorsGame.checkIfYouWinner("paper", "rock");
        Assert.assertEquals(-1, result1);


        int result2 = rockPaperScissorsGame.checkIfYouWinner("paper", "scissors");
        Assert.assertEquals(+1, result2);
    }
}
