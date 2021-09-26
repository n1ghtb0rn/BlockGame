package com.mycompany.gitexample;

import android.graphics.Color;

import java.util.ArrayList;

public class PlayerUnit extends CircleUnit {

    private String name = name = "Player";

    public PlayerUnit(int _posX, int _posY){
        super(_posX, _posY);
        this.color = Color.parseColor("#43765f");
    }

    public void move(int difX, int difY){
        this.posX += difX;
        this.posY += difY;

        Unit other = this.isCollidingWith();
        if(other instanceof WallUnit){
            this.move(-difX, -difY);
        }
        if(other == UnitManager.box){
            UnitManager.box.move(difX, difY);
        }
    }

    public Unit isCollidingWith(){
        ArrayList<Unit> otherUnits = new ArrayList<Unit>();
        for(Unit unit : UnitManager.units){
            otherUnits.add(unit);
        }
        otherUnits.add(UnitManager.box);

        for(Unit other : otherUnits){
            if(this.posX == other.posX && this.posY == other.posY){
                return other;
            }
        }

        return null;
    }

    public String getName(){
        return this.name;
    }

}
