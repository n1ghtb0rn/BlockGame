package com.mycompany.gitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        DataManager.gameActivity = this;
        DataManager.drawManager = new DrawManager();
        LevelManager.createLevels();
        DataManager.drawManager.resetLevel();
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

    public void resetLevel(View v){
        DataManager.drawManager.resetLevel();
    }

    public void back(View v){
        startActivity(new Intent(GameActivity.this, MainActivity.class));
    }

    public void move(int difX, int difY){
        UnitManager.player.move(difX, difY);
        DataManager.drawManager.draw();
    }

}

