import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ResourceBundle;
import java.util.Scanner;
public class WelcomeService {
    private static final Logger logger = LoggerFactory.getLogger("stdout");
    private static final Logger process = LoggerFactory.getLogger("process");
    public int getPlayerInfo(FileService fileService, ResourceBundle resourceBundle){

        Scanner cs = new Scanner(System.in);
        logger.info(resourceBundle.getString("name"));
        String name = cs.nextLine();
        process.info(resourceBundle.getString("name")+ " -> " + name);
        fileService.writeToFile(resourceBundle.getString("name") + name);
        logger.info(resourceBundle.getString("numberOfGames"));
        int countOfGames = cs.nextInt();
        process.info(resourceBundle.getString("numberOfGames") + " -> " + countOfGames);
        fileService.writeToFile(resourceBundle.getString("numberOfGames")+ " -> " + countOfGames);
        return countOfGames;
    }
}
