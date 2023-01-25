import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;
public class WelcomeService {
    private static final Logger logger = LoggerFactory.getLogger("stdout");
    private static final Logger process = LoggerFactory.getLogger("process");

    String nameText = "Please enter your name: ";
    String numberOfGames = "Please enter number of games you want to play: ";
    public int getPlayerInfo(FileService fileService){
        Scanner cs = new Scanner(System.in);
        logger.info(nameText);
        String name = cs.nextLine();        process.info(nameText + name);
        fileService.writeToFile(nameText + name);
        logger.info(numberOfGames);
        int countOfGames = cs.nextInt();
        process.info(numberOfGames+ countOfGames);
        fileService.writeToFile(numberOfGames + countOfGames);
        return countOfGames;
    }
}
