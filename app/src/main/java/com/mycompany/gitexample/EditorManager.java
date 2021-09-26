package com.mycompany.gitexample;

import android.util.Log;
import android.view.MotionEvent;

public class EditorManager {

    private Unit selectedUnit;
    private MotionEvent event;

    public void selectUnit(Unit unit){
        this.selectedUnit = unit;
        Log.d(DataManager.TAG, this.selectedUnit.toString());
    }

    public void addUnit(MotionEvent event){
        if(this.selectedUnit == null){
            return;
        }
        float posX = event.getX();
        float posY = event.getY();
        Log.d(DataManager.TAG, "Position: " + posX + ", " + posY);
    }

}
