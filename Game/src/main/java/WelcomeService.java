import java.util.Scanner;

public class WelcomeService {
    private String nameText = "Please enter your name: ";
    private String numberOfGames = "Please enter number of games you want to play: ";
    public int getPlayerInfo(FileService fileService){
        Scanner cs = new Scanner(System.in);
        System.out.println(nameText);
        String name = cs.nextLine();
        fileService.writeToFile(nameText + name);
        System.out.println(numberOfGames);
        int countOfGames = cs.nextInt();
        fileService.writeToFile(numberOfGames + countOfGames);
        return countOfGames;
    }
}
