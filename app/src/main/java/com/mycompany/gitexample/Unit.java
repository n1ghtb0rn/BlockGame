package com.mycompany.gitexample;

public class Unit {
    private int posX = 0;
    private int posY = 0;
    private int size = DataManager.CANVAS_SIZE_X/40;
    private int speed = size*2;

    public void move(int difX, int difY){
        this.posX += difX;
        this.posY += difY;
        if(     this.posX < 0 || this.posX >= DataManager.CANVAS_SIZE_X ||
                this.posY < 0 || this.posY >= DataManager.CANVAS_SIZE_Y){
            this.posX -= difX;
            this.posY -= difY;
        }
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
}