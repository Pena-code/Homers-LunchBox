package org.codeforall;

import java.io.*;

public class FileManager {

    public void saveHighScore(String score) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(Game.PREFIX + "highscore.txt", false));
            bw.write("" + score);
            bw.flush();
            bw.close();
        } catch (IOException e) {
        }
    }
    public int loadHighScore(){
        BufferedReader br = null;
        String line = "";
        int number;
        try {
            br = new BufferedReader(new FileReader(Game.PREFIX + "highscore.txt"));
            line = br.readLine();
            br.close();
        } catch (IOException e) {
            line = "";
        }
        try {
            number = Integer.valueOf(line);
            System.out.println("Converted integer: " + number);
        } catch (NumberFormatException e) {
            number = 0;
        }
        return number;
    }

}
