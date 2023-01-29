import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.Scanner;

public class GameService {
    private static final Logger logger = LoggerFactory.getLogger("stdout");
    private static final Logger save = LoggerFactory.getLogger("logger");
    private static final Logger process = LoggerFactory.getLogger("process");

    private int countOfGames;

    public GameService(int countOfGames) {
        this.countOfGames = countOfGames;
    }
    public void startGame(FileService fileService, ResourceBundle resourceBundle){
        int wins = 0;
        int loses = 0;
        int draws = 0;
        int totalCountOfGames = 0;
        String[] rps = {resourceBundle.getString("rock"), resourceBundle.getString("paper"),
                resourceBundle.getString("scissors")};

        for (int i = 0; i < countOfGames; i++) {

            String computerMove = rps[new Random().nextInt(rps.length)];

            logger.info(resourceBundle.getString("playerMoveIs"));
            String playerMove = getPlayerMove(resourceBundle);
            process.info(resourceBundle.getString("playerMoveIs") + " -> " + playerMove);
            logger.info(resourceBundle.getString("computerMoveIs") + " -> " + computerMove);
            process.info(resourceBundle.getString("computerMoveIs")+ " -> " + computerMove);
            fileService.writeToFile(resourceBundle.getString("playerMoveIs")+ " -> " + playerMove);
            fileService.writeToFile(resourceBundle.getString("computerMoveIs")+ " -> " + computerMove);

            int value = checkIfYouWinner(computerMove, playerMove, resourceBundle);
            if (value < 0) {
                loses++;
            } else if (value > 0) {
                wins++;
            } else {
                draws++;
            }
            totalCountOfGames = wins + loses + draws;

            String playAgain = getPlayAgain(resourceBundle);
            if (playAgain.equalsIgnoreCase(resourceBundle.getString("no"))){
                break;
            }
        }
        save.info(resourceBundle.getString("win") + wins);
        save.info(resourceBundle.getString("lost") + loses);
        save.info(resourceBundle.getString("total") + totalCountOfGames);

    }
    private String getPlayAgain(ResourceBundle resourceBundle) {
        String playAgain;
        Scanner cs1 = new Scanner(System.in);
        while (true) {
            logger.info(resourceBundle.getString("playAgain"));
            playAgain = cs1.nextLine();
            process.info(resourceBundle.getString("playAgain") + "-> " + playAgain );
            if (playAgain.equalsIgnoreCase(resourceBundle.getString("yes")) || playAgain.equalsIgnoreCase(resourceBundle.getString("no"))) {
                break;
            }
            logger.info(playAgain + resourceBundle.getString("notValid"));
        }
        return playAgain;
    }

    public String getPlayerMove(ResourceBundle resourceBundle) {

        String paper = resourceBundle.getString("paper");
        String rock = resourceBundle.getString("rock");
        String scissors = resourceBundle.getString("scissors");

        String playerMove;
        Scanner cs = new Scanner(System.in);
        while (true) {
            playerMove = cs.nextLine();
            if (playerMove.equalsIgnoreCase(rock) || playerMove.equalsIgnoreCase(paper) || playerMove.equalsIgnoreCase(scissors)) {
                break;
            }
            logger.info(playerMove + resourceBundle.getString("notValid"));
        }
        return playerMove;
    }
    public int checkIfYouWinner(String computerMove, String playerMove, ResourceBundle resourceBundle) {
        String paper = resourceBundle.getString("paper");
        String rock = resourceBundle.getString("rock");
        String scissors = resourceBundle.getString("scissors");

        if (playerMove.equalsIgnoreCase(computerMove)) {
            logger.info(resourceBundle.getString("draw"));
            process.info(resourceBundle.getString("draw"));
            return 0;
        }

        if (playerMove.equalsIgnoreCase(rock)) {
            if (computerMove.equalsIgnoreCase(paper)) {
                logger.info(resourceBundle.getString("youLose"));
                process.info(resourceBundle.getString("youLose"));
                return -1;
            } else if (computerMove.equalsIgnoreCase(scissors)) {
                logger.info(resourceBundle.getString("youWin"));
                process.info(resourceBundle.getString("youWin"));
                return 1;
            }
        } else if (playerMove.equalsIgnoreCase(paper)) {
            if (computerMove.equalsIgnoreCase(rock)) {
                logger.info(resourceBundle.getString("youWin"));
                process.info(resourceBundle.getString("youWin"));
                return 1;
            } else if (computerMove.equalsIgnoreCase(scissors)) {
                logger.info(resourceBundle.getString("youLose"));
                process.info(resourceBundle.getString("youLose"));
                return -1;
            }
        } else if (playerMove.equalsIgnoreCase(scissors)) {
            if (computerMove.equalsIgnoreCase(paper)) {
                logger.info(resourceBundle.getString("youWin"));
                process.info(resourceBundle.getString("youWin"));
                return 1;
            } else if (computerMove.equalsIgnoreCase(rock)) {
                logger.info(resourceBundle.getString("youLose"));
                process.info(resourceBundle.getString("youLose"));
                return -1;
            }
        }
        return 0;
    }
}
