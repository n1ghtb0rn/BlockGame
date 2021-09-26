package com.mycompany.gitexample;

import java.util.ArrayList;

public class LevelManager {

    public static ArrayList<String[][]> levels = new ArrayList<String[][]>();
    public static int currentLevelIndex = 0;

    // Wal = Wall, Pla = Player, But = Button, Nul = empty
    public static void createLevels() {

        String[][] level1 = {
                {"Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Pla", "Nul", "Nul", "Box", "Nul", "Nul", "Nul", "Nul", "But", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal"}
        };
        levels.add(level1);

        String[][] level2 = {
                {"Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal"},
                {"Wal", "But", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Pla", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Box", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal"}
        };
        levels.add(level2);

        String[][] level3 = {
                {"Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Nul", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Nul", "Wal"},
                {"Wal", "But", "Nul", "Nul", "Pla", "Nul", "Box", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Nul", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal"}
        };
        levels.add(level3);

        String[][] level4 = {
                {"Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal"},
                {"Wal", "Pla", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal", "Nul", "Box", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Nul", "Wal", "Wal", "Wal", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal", "Wal", "Wal", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "But", "Nul", "Wal", "Wal", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal"}
        };
        levels.add(level4);

        String[][] level5 = {
                {"Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Box", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Wal", "Nul", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal"},
                {"Wal", "Nul", "Nul", "Wal", "Nul", "Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Wal", "But", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Nul", "Wal", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Wal", "Nul", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Nul", "Wal", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Wal", "Nul", "Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Pla", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal", "Nul", "Nul", "Nul", "Wal", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal"}
        };
        levels.add(level5);

        /* BLUEPRINT. JUST ADD "Pla", "Box", "But".
        String[][] levelX = {
                {"Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Nul", "Wal"},
                {"Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal", "Wal"}
        };
        levels.add(levelX);
        */

    }

    public static void nextLevel() {
        currentLevelIndex++;

        if(currentLevelIndex > levels.size()-1){
            currentLevelIndex = levels.size()-1;
        }
    }

    public static String[][] getCurrentLevel() {
        return levels.get(currentLevelIndex);
    }

}
