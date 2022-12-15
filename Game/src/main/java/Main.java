public class Main {
    public static void main(String[] args) {
        FileService fileService = new FileService();
        fileService.createFile();
        WelcomeService welcomeService = new WelcomeService();
        int countOfGames = welcomeService.getPlayerInfo(fileService);
        GameService gameService = new GameService(countOfGames);
        gameService.startGame(fileService);
    }
}

