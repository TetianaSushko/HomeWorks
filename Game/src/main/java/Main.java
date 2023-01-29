import java.util.Locale;
import java.util.ResourceBundle;

public class Main {
    public static void main(String[] args) {

        Locale defLocale = Locale.getDefault();
        if (args.length != 0) {
            defLocale = new Locale(args[0]);
        }
        ResourceBundle resourceBundle = ResourceBundle.getBundle("Questions", defLocale);

        FileService fileService = new FileService();
        fileService.createFile();
        WelcomeService welcomeService = new WelcomeService();
        int countOfGames = welcomeService.getPlayerInfo(fileService, resourceBundle);
        GameService gameService = new GameService(countOfGames);
        gameService.startGame(fileService, resourceBundle);
    }
}

