package practice_3;

public class GameSettings {
    static int maxPlayers = 20;
    final String gameName;
    int currentPlayers;

    public GameSettings(String gameName, int currentPlayers) {
        this.gameName = gameName;
        this.currentPlayers = currentPlayers;
    }

    static void setMaxPlayers(int count) {
        maxPlayers = count;
    }

    void addPlayer() {
        if (currentPlayers < maxPlayers) {
            currentPlayers++;
        }
    }

    void printGameStatus() {
        System.out.println("Название игры: " + gameName + ", Играет игроков: " + currentPlayers + ", Максимум игроов: " + maxPlayers);
    }
}
