package m7homework;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import static m7homework.Game.GameType.*;


public class Game {


    enum GameType {
        SOCCER,
        HOCKEY,
        RUGBY
    }

    public static int getNumOfPlayersPerTeam(GameType game) {

        int numberOfPlayers = 0;
        switch (game) {

            case SOCCER:

                numberOfPlayers = 11;

                break;
            case RUGBY:
                numberOfPlayers = 6;
                break;
            case HOCKEY:
                numberOfPlayers = 15;
                break;
            default:
                System.out.println("no file");
                numberOfPlayers = 0;
        }
        return numberOfPlayers;
    }

    public void createFile(String fileName) {
        File file = new File(fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void writeInFile(String fileName, String txt) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(txt);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println(" You can't write in this file.");
            throw new RuntimeException(e);
        }

    }

}
