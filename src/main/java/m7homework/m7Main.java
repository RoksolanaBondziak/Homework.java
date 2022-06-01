package m7homework;

public class m7Main {

    public static void main(String[] args) {
        String file = "Soccer.txt";
        String file2 = "Rugby.txt";
        String file3 = "Hockey.txt";
        Game game = new Game();
        game.createFile(file);
        game.createFile(file2);
        game.createFile(file3);



        game.writeInFile(file, "Number of soccer players is: " + game.getNumOfPlayersPerTeam(Game.GameType.SOCCER));
        game.writeInFile(file2, "Number of rugby players is: " + game.getNumOfPlayersPerTeam(Game.GameType.RUGBY));
        game.writeInFile(file3, "Number of hockey players is: " + game.getNumOfPlayersPerTeam(Game.GameType.HOCKEY));

    }

}




