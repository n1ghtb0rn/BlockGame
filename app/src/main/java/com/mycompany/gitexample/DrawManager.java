package com.mycompany.gitexample;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.ImageView;

public class DrawManager {

    ImageView imageView;
    ImageView imageView2;
    Bitmap bitmap;
    Canvas gfx;
    Paint paint;

    public void draw(){

        this.initCanvas();

        //Draw stuff
        for(Unit unit : UnitManager.units){
            unit.draw(this.paint, this.gfx);
        }
        if(UnitManager.button != null){
            UnitManager.button.draw(this.paint, this.gfx);
        }
        if(UnitManager.box != null){
            UnitManager.box.draw(this.paint, this.gfx);
        }
        if(UnitManager.player != null){
            UnitManager.player.draw(this.paint, this.gfx);
        }

        if(this.imageView != null){
            this.imageView.setImageBitmap(bitmap);
        }
        if(this.imageView2 != null){
            this.imageView2.setImageBitmap(bitmap);
        }
    }

    public void initCanvas(){
        //Reset
        this.imageView = null;
        this.bitmap = null;
        this.gfx = null;
        this.paint = null;
        //Create image stuff
        if(DataManager.gameActivity != null){
            this.imageView = (ImageView) DataManager.gameActivity.findViewById(R.id.imageView);
        }
        if(DataManager.editorActivity != null){
            this.imageView2 = (ImageView) DataManager.editorActivity.findViewById(R.id.imageView2);
        }
        this.bitmap = Bitmap.createBitmap(DataManager.CANVAS_SIZE_X, DataManager.CANVAS_SIZE_Y, Bitmap.Config.ARGB_8888);
        this.gfx = new Canvas(bitmap);
        this.paint = new Paint(Paint.ANTI_ALIAS_FLAG);
        this.paint.setStyle(Paint.Style.FILL);
        this.gfx.drawPaint(this.paint);

        if(this.imageView != null){
            this.imageView.setOnTouchListener(new OnSwipeTouchListener(DataManager.gameActivity));
        }
        if(this.imageView2 != null){
            this.imageView2.setOnTouchListener(new OnSwipeTouchListener(DataManager.editorActivity));
        }
    }

    public void resetLevel(){
        UnitManager.createCurrentLevel();
        this.draw();
    }

    public void emptyLevel(){
        UnitManager.createEmptyLevel();
        this.draw();
    }

}
