package com.mycompany.gitexample;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.ImageView;

public class DrawManager {

    ImageView imageView;
    Bitmap bitmap;
    Canvas gfx;
    Paint paint;

    public void draw(){

        this.initCanvas();

        //Draw stuff
        for(Unit unit : UnitManager.units){
            unit.draw(this.paint, this.gfx);
        }
        UnitManager.button.draw(this.paint, this.gfx);
        UnitManager.box.draw(this.paint, this.gfx);
        UnitManager.player.draw(this.paint, this.gfx);
        //COMMENT
        this.imageView.setImageBitmap(bitmap);

    }

    public void initCanvas(){
        //Reset
        this.imageView = null;
        this.bitmap = null;
        this.gfx = null;
        this.paint = null;
        //Create image stuff
        this.imageView = (ImageView) DataManager.mainActivity.findViewById(R.id.imageView);
        this.bitmap = Bitmap.createBitmap(DataManager.CANVAS_SIZE_X, DataManager.CANVAS_SIZE_Y, Bitmap.Config.ARGB_8888);
        this.gfx = new Canvas(bitmap);
        this.paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        this.paint.setStyle(Paint.Style.FILL);
        this.gfx.drawPaint(this.paint);

        this.imageView.setOnTouchListener(new OnSwipeTouchListener(DataManager.mainActivity));
    }

    public void resetLevel(View v){
        UnitManager.createCurrentLevel();
        this.draw();
    }

}
