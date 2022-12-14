public class RockPaperScissorsGame {
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

