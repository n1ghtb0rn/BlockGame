package com.mycompany.gitexample;

import java.util.ArrayList;

public class UnitManager {

    public static ArrayList<Unit> units = new ArrayList<>();
    public static ButtonUnit button = null;
    public static BoxUnit box = null;
    public static PlayerUnit player = null;

    public static void createCurrentLevel() {

        units = new ArrayList<Unit>();
        String[][] level = LevelManager.getCurrentLevel();
        for(int x = 0; x < level[0].length; x++){
            for(int y = 0; y < level.length; y++){
                String current = level[y][x];
                int size = DataManager.UNIT_SIZE;
                if(current.equals("Wal")){
                    WallUnit unit = new WallUnit(x*size, y*size);
                    units.add(unit);
                }
                else if(current.equals("But")){
                    ButtonUnit unit = new ButtonUnit(x*size, y*size);
                    button = unit;
                }
                else if(current.equals("Box")){
                    BoxUnit unit = new BoxUnit(x*size, y*size);
                    box = unit;
                }
                else if(current.equals("Pla")){
                    PlayerUnit unit = new PlayerUnit(x*size, y*size);
                    player = unit;
                }
            }
        }
    }

    public static void createEmptyLevel(){
        units = new ArrayList<Unit>();
        button = null;
        box = null;
        player = null;
    }

}
