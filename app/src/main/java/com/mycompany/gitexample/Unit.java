package com.mycompany.gitexample;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.widget.ImageView;

abstract public class Unit {

    protected int posX;
    protected int posY;
    protected int size = 0;
    protected int speed = 0;
    protected int color = Color.WHITE;

    public Unit(int _posX, int _posY){
        this.posX = _posX;
        this.posY = _posY;
    }

    public void move(int difX, int difY){
        //OVERRIDE THIS IN PLAYER AND BOX CLASS
    }

    public int getPosX(){
        return this.posX;
    }

    public int getPosY(){
        return this.posY;
    }

    public int getSize(){
        return this.size;
    }

    public int getSpeed(){
        return this.speed;
    }

    public int getColor() {
        return this.color;
    }

    public void draw(Paint paint, Canvas gfx){
        paint.setColor(this.color);
    }
}