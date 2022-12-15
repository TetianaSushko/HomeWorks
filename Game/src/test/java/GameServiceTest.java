import org.junit.Assert;
import org.junit.Test;

public class GameServiceTest {
    @Test
    public void showWinner(){
        GameService gameService = new GameService(1);
        int result = gameService.checkIfYouWinner("rock", "rock");
        Assert.assertEquals(0, result);

        int result1 = gameService.checkIfYouWinner("paper", "rock");
        Assert.assertEquals(-1, result1);


        int result2 = gameService.checkIfYouWinner("paper", "scissors");
        Assert.assertEquals(+1, result2);
    }
}
