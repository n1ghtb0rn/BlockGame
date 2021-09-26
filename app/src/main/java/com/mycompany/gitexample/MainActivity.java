package com.mycompany.gitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Unit player;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        player = new Unit();
        draw();
    }

    private void draw(){
        //Create image stuff
        ImageView imageView = (ImageView) findViewById(R.id.imageView);
        Bitmap bitmap = Bitmap.createBitmap(DataManager.CANVAS_SIZE_X, DataManager.CANVAS_SIZE_Y, Bitmap.Config.ARGB_8888);
        Canvas gfx = new Canvas(bitmap);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG);

        //Draw stuff
        paint.setStyle(Paint.Style.FILL);
        gfx.drawPaint(paint);
        paint.setColor(Color.WHITE);
        gfx.drawCircle(player.getPosX()+player.getSize(), player.getPosY()+player.getSize(), player.getSize(), paint);
        imageView.setImageBitmap(bitmap);
    }

    public void btnUp(View v){
        player.move(0, -player.getSpeed());
        this.draw();
    }

    public void btnDown(View v){
        player.move(0, player.getSpeed());
        this.draw();
    }

    public void btnLeft(View v){
        player.move(-player.getSpeed(), 0);
        this.draw();
    }

    public void btnRight(View v){
        player.move(player.getSpeed(), 0);
        this.draw();
    }

}

