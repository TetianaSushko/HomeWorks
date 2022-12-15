import java.util.Random;
import java.util.Scanner;

public class GameService {
    private int countOfGames;
    private String playerMoveIs = "Please, enter your move (paper/rock/scissors)";
    private String computerMoveIs = "Computer move is: ";

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
            System.out.println(playerMoveIs);
            String playerMove = getPlayerMove();
            fileService.writeToFile(playerMoveIs + " -> " + playerMove);
            fileService.writeToFile(computerMoveIs + " -> " + computerMove);
            System.out.println(computerMoveIs + computerMove);

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

        System.out.println("You won : " + wins + " times and lost : " + loses + " times.");
        System.out.println("Total count round's of your is: " + totalCountOfGames);
        fileService.writeToFile("You won : " + wins + " times and lost : " + loses + " times.");
        fileService.writeToFile("Total count round's of your is: " + totalCountOfGames);
    }
    private String getPlayAgain() {
        String playAgain;
        Scanner cs1 = new Scanner(System.in);
        while (true) {
            System.out.println("Do you want to continue game? [Y/N]");
            playAgain = cs1.nextLine();
            if (playAgain.equalsIgnoreCase("y") || playAgain.equalsIgnoreCase("n")) {
                break;
            }
            System.out.println(playAgain + " is not valid");
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
            System.out.println(playerMove + " is not valid");
        }
        return playerMove;
    }
    public int checkIfYouWinner(String computerMove, String playerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            System.out.println("It's a draw this time!");
            return 0;
        }

        if (playerMove.equalsIgnoreCase("rock")) {
            if (computerMove.equalsIgnoreCase("paper")) {
                System.out.println("You lose(((");
                return -1;
            } else if (computerMove.equalsIgnoreCase("scissors")) {
                System.out.println("You win !!!");
                return 1;
            }
        } else if (playerMove.equalsIgnoreCase("paper")) {
            if (computerMove.equalsIgnoreCase("rock")) {
                System.out.println("You win !!!");
                return 1;
            } else if (computerMove.equalsIgnoreCase("scissors")) {
                System.out.println("You lose(((");
                return -1;
            }
        } else if (playerMove.equalsIgnoreCase("scissors")) {
            if (computerMove.equalsIgnoreCase("paper")) {
                System.out.println("You win !!!");
                return 1;
            } else if (computerMove.equalsIgnoreCase("rock")) {
                System.out.println("You lose(((");
                return -1;
            }
        }
        return 0;
    }

}
