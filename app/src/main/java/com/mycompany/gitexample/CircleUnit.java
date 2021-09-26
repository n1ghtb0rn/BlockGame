package com.mycompany.gitexample;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Build;
import android.widget.ImageView;

public class CircleUnit extends Unit{

    public CircleUnit(int _posX, int _posY){
        super(_posX, _posY);
        this.size = DataManager.UNIT_SIZE/2; //radius = size/2
        this.speed = size*2;
    }

    public void draw(Paint paint, Canvas gfx){
        super.draw(paint, gfx);
        gfx.drawCircle(this.posX+this.size, this.posY+this.size, this.size, paint);
    }

}
