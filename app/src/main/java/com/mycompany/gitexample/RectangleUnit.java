package com.mycompany.gitexample;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.ImageView;

public class RectangleUnit extends Unit{

    public RectangleUnit(int _posX, int _posY){
        super(_posX, _posY);
        this.size = DataManager.UNIT_SIZE; //width of rectangle
        this.speed = size;
    }

    public void draw(Paint paint, Canvas gfx){
        super.draw(paint, gfx);
        gfx.drawRect(new Rect(this.posX, this.posY, this.posX+this.size, this.posY+this.size), paint);
    }

}
