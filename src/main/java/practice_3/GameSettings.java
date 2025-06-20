package practice_3;

public class GameSettings {
    private static int maxPlayers;
    private final String gameName;
    private int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    public static void setMaxPlayers(int number) {
        maxPlayers = number;
    }

    public void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        } else {
            System.out.println("Играет максимум игроков, невозможно добавить");
        }
    }

    public void printGameStatus() {
        System.out.println("Название игры: " + this.gameName + ", Играют игроков: " + this.currentPlayers
                + ", Максимум игроков: " + GameSettings.maxPlayers);
    }

    public static void main(String[] args) {
        GameSettings gameSettings1 = new GameSettings("Футбол", 14);
        GameSettings gameSettings2 = new GameSettings("Мини футбол", 8);

        GameSettings.maxPlayers = 14;

        gameSettings1.printGameStatus();
        gameSettings1.addPlayer();
        gameSettings1.printGameStatus();

        System.out.println("------------------------------------");

        gameSettings2.printGameStatus();
        gameSettings2.addPlayer();
        gameSettings2.printGameStatus();
    }
}
