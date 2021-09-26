package com.mycompany.gitexample;

import android.graphics.Color;

import java.util.ArrayList;

public class BoxUnit extends RectangleUnit {

    public BoxUnit(int _posX, int _posY){
        super(_posX, _posY);
        this.color = Color.YELLOW;
    }

    public void move(int difX, int difY){
        this.posX += difX;
        this.posY += difY;

        Unit other = this.isCollidingWith();
        if(other instanceof WallUnit){
            this.move(-difX, -difY);
            UnitManager.player.move(-difX, -difY);
        }
        if(other == UnitManager.button){
            LevelManager.nextLevel();
            UnitManager.createCurrentLevel();
            DataManager.mainActivity.draw();
        }
    }

    public Unit isCollidingWith(){
        ArrayList<Unit> otherUnits = new ArrayList<Unit>();
        for(Unit unit : UnitManager.units){
            otherUnits.add(unit);
        }
        otherUnits.add(UnitManager.button);

        for(Unit other : otherUnits){
            if(this.posX == other.posX && this.posY == other.posY){
                return other;
            }
        }

        return null;
    }

}
