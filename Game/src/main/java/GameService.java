
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;
import java.util.Scanner;

public class GameService {
    private static final Logger logger = LoggerFactory.getLogger("stdout");
    private static final Logger save = LoggerFactory.getLogger("logger");
    private static final Logger process = LoggerFactory.getLogger("process");

    private int countOfGames;
    String playerMoveIs = "Please, enter your move (paper/rock/scissors)";
    String computerMoveIs = "Computer move is: ";

    public GameService(int countOfGames) {
        this.countOfGames = countOfGames;
    }
    public void startGame(FileService fileService){
        int wins = 0;
        int loses = 0;
        int draws = 0;
        int totalCountOfGames = 0;
        String[] rps = {"rock", "paper", "scissors"};
        for (int i = 0; i < countOfGames; i++) {

            String computerMove = rps[new Random().nextInt(rps.length)];
            logger.info(playerMoveIs);
            String playerMove = getPlayerMove();
            process.info(playerMoveIs + " -> " + playerMove);
            logger.info(computerMoveIs + " -> " + computerMove);
            process.info(computerMoveIs + " -> " + computerMove);
            fileService.writeToFile(playerMoveIs + " -> " + playerMove);
            fileService.writeToFile(computerMoveIs + " -> " + computerMove);

            int value = checkIfYouWinner(computerMove, playerMove);
            if (value < 0) {
                loses++;
            } else if (value > 0) {
                wins++;
            } else {
                draws++;
            }
            totalCountOfGames = wins + loses + draws;

            String playAgain = getPlayAgain();
            if (playAgain.equalsIgnoreCase("n")) {
                break;
            }
        }
        save.info("You won : " + wins + " times and lost : " + loses + " times.");
        save.info("Total count round's of your is: " + totalCountOfGames);

        fileService.writeToFile("You won : " + wins + " times and lost : " + loses + " times.");
        fileService.writeToFile("Total count round's of your is: " + totalCountOfGames);
    }
    private String getPlayAgain() {
        String playAgain;
        Scanner cs1 = new Scanner(System.in);
        while (true) {
            logger.info("Do you want to continue game? [Y/N]");
            process.info(playAgain = cs1.nextLine());
            if (playAgain.equalsIgnoreCase("y") || playAgain.equalsIgnoreCase("n")) {
                break;
            }
            logger.info(playAgain + " is not valid");
        }
        return playAgain;
    }

    private String getPlayerMove() {
        String playerMove;
        Scanner cs = new Scanner(System.in);
        while (true) {
            playerMove = cs.nextLine();
            if (playerMove.equalsIgnoreCase("rock") || playerMove.equalsIgnoreCase("paper") || playerMove.equalsIgnoreCase("scissors")) {
                break;
            }
            logger.info(playerMove + " is not valid");
        }
        return playerMove;
    }
    public int checkIfYouWinner(String computerMove, String playerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            logger.info("It's a draw this time!");
            process.info("It's a draw this time!");
            return 0;
        }

        if (playerMove.equalsIgnoreCase("rock")) {
            if (computerMove.equalsIgnoreCase("paper")) {
                logger.info("You lose(((");
                process.info("You lose(((");
                return -1;
            } else if (computerMove.equalsIgnoreCase("scissors")) {
                logger.info("You win !!!");
                process.info("You win !!!");
                return 1;
            }
        } else if (playerMove.equalsIgnoreCase("paper")) {
            if (computerMove.equalsIgnoreCase("rock")) {
                logger.info("You win !!!");
                process.info("You win !!!");;
                return 1;
            } else if (computerMove.equalsIgnoreCase("scissors")) {
                logger.info("You lose(((");
                process.info("You lose(((");
                return -1;
            }
        } else if (playerMove.equalsIgnoreCase("scissors")) {
            if (computerMove.equalsIgnoreCase("paper")) {
                logger.info("You win !!!");
                process.info("You win !!!");
                return 1;
            } else if (computerMove.equalsIgnoreCase("rock")) {
                logger.info("You lose(((");
                process.info("You lose(((");
                return -1;
            }
        }
        return 0;
    }
}
