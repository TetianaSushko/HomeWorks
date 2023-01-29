import org.junit.Assert;
import org.junit.Test;
import java.util.Locale;
import java.util.ResourceBundle;

public class GameServiceTest {
    @Test
    public void showWinner(){

        ResourceBundle resourceBundle = ResourceBundle.getBundle("Questions", Locale.GERMAN);
        GameService gameService = new GameService(1);

        String paper = resourceBundle.getString("paper");
        String rock = resourceBundle.getString("rock");
        String scissors = resourceBundle.getString("scissors");

        int result = gameService.checkIfYouWinner(rock, rock, resourceBundle);
        Assert.assertEquals(0, result);
        int result1 = gameService.checkIfYouWinner(paper, rock, resourceBundle);
        Assert.assertEquals(-1, result1);
        int result2 = gameService.checkIfYouWinner(paper, scissors, resourceBundle);
        Assert.assertEquals(+1, result2);
    }
}
