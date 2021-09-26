package com.mycompany.gitexample;

import android.util.Log;
import android.view.MotionEvent;

public class EditorManager {

    private Unit selectedUnit;

    public void selectUnit(Unit unit){
        this.selectedUnit = unit;
        Log.d(DataManager.TAG, this.selectedUnit.toString());
    }

    public void addUnit(MotionEvent event){
        if(this.selectedUnit == null){
            return;
        }

        float ratioX = DataManager.drawManager.bitmap.getWidth() / DataManager.drawManager.imageView2.getWidth();
        int posX = (int) (event.getX() * ratioX);
        float ratioY = DataManager.drawManager.bitmap.getWidth() / DataManager.drawManager.imageView2.getWidth();
        int posY = (int) (event.getX() * ratioY);

        Log.d(DataManager.TAG, posX + ", " + posY);

    }

}
