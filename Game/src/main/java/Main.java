
import java.io.*;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Tania\\projects\\HomeWorks\\Game\\ProcessGame.txt");

    try {
        if (file.exists()){
            file.delete();
            file.createNewFile();
        }else {
            file.createNewFile();
        }
    }catch (IOException e){
        throw new RuntimeException(e);
    }
        int wins = 0;
        int loses = 0;
        int draws = 0;
        int totalCountOfGames = 0;
        String nameText = "Please enter your name: ";
        String numberOfGames = "Please enter number of games you want to play: ";
        String playerMoveIs = "Please, enter your move (paper/rock/scissors)";
        String computerMoveIs = "Computer move is: ";

        Scanner cs = new Scanner(System.in);
        System.out.println(nameText);
        String name = cs.nextLine();
        writeToFile(nameText + name);
        System.out.println(numberOfGames);
        int countOfGames = cs.nextInt();
        writeToFile(numberOfGames + countOfGames);

        String[] rps = {"rock", "paper", "scissors"};
        RockPaperScissorsGame rockPaperScissorsGame = new RockPaperScissorsGame();
        for (int i = 0; i < countOfGames; i++) {

            String computerMove = rps[new Random().nextInt(rps.length)];
            System.out.println(playerMoveIs);
            String playerMove = getPlayerMove();
            writeToFile(playerMoveIs + " -> " + playerMove);
            writeToFile(computerMoveIs + " -> " + computerMove);
            System.out.println(computerMoveIs + computerMove);

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
        writeToFile("You won : " + wins + " times and lost : " + loses + " times.");
        writeToFile("Total count round's of your is: " + totalCountOfGames);


    }
    private static void writeToFile(String text) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("ProcessGame.txt",true));
            bufferedWriter.write(text + "\n");
            bufferedWriter.flush();
            bufferedWriter.close();
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
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


            playerMove = cs.nextLine();
            if (playerMove.equalsIgnoreCase("rock") || playerMove.equalsIgnoreCase("paper") || playerMove.equalsIgnoreCase("scissors")) {
                break;
            }
            System.out.println(playerMove + " is not valid");
        }
        return playerMove;
        }
    }

