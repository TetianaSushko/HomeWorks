
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int wins = 0;
        int loses = 0;
        int draws = 0;
        int totalCountOfGames = 0;

        Scanner cs = new Scanner(System.in);

        System.out.println(" Please enter your name:");
        cs.nextLine();
        System.out.println("Please enter number of games you wont to play: ");
        int countOfGames = cs.nextInt();
        String[] rps = {"rock", "paper", "scissors"};
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame();
        for (int i = 0; i < countOfGames; i++) {

            String computerMove = rps[new Random().nextInt(rps.length)];
            String playerMove = getPlayerMove();

            System.out.println("Computer move is : " + computerMove);

            int value = rockPaperScissorsGame.checkIfYouWinner(computerMove, playerMove);
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
    }

    private static String getPlayAgain() {
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

    private static String getPlayerMove() {
        String playerMove;
        Scanner cs = new Scanner(System.in);
        while (true) {
            System.out.println("Please, enter your move (paper/rock/scissors)");
            playerMove = cs.nextLine();
            if (playerMove.equalsIgnoreCase("rock") || playerMove.equalsIgnoreCase("paper") || playerMove.equalsIgnoreCase("scissors")) {
                break;
            }
            System.out.println(playerMove + " is not valid");
        }
        return playerMove;
    }
}
