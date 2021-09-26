package com.mycompany.gitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ImageView imageView;
    Bitmap bitmap;
    Canvas gfx;
    Paint paint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataManager.mainActivity = this;
        LevelManager.createLevels();
        this.resetLevel(null);
    }

    public void btnUp(View v){
        this.move(0, -UnitManager.player.getSpeed());
    }

    public void btnDown(View v){
        this.move(0, UnitManager.player.getSpeed());
    }

    public void btnLeft(View v){
        this.move(-UnitManager.player.getSpeed(), 0);
    }

    public void btnRight(View v){
        this.move(UnitManager.player.getSpeed(), 0);
    }

    private void move(int difX, int difY){
        UnitManager.player.move(difX, difY);
        this.draw();
    }

    public void draw(){

        this.initCanvas();

        //Draw stuff
        for(Unit unit : UnitManager.units){
            unit.draw(this.paint, this.gfx);
        }
        UnitManager.button.draw(this.paint, this.gfx);
        UnitManager.box.draw(this.paint, this.gfx);
        UnitManager.player.draw(this.paint, this.gfx);

        this.imageView.setImageBitmap(bitmap);

    }

    public void initCanvas(){
        //Reset
        this.imageView = null;
        this.bitmap = null;
        this.gfx = null;
        this.paint = null;
        //Create image stuff
        this.imageView = (ImageView) findViewById(R.id.imageView);
        this.bitmap = Bitmap.createBitmap(DataManager.CANVAS_SIZE_X, DataManager.CANVAS_SIZE_Y, Bitmap.Config.ARGB_8888);
        this.gfx = new Canvas(bitmap);
        this.paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        this.paint.setStyle(Paint.Style.FILL);
        this.gfx.drawPaint(this.paint);
    }

    public void resetLevel(View v){
        UnitManager.createCurrentLevel();
        this.draw();
    }

}

