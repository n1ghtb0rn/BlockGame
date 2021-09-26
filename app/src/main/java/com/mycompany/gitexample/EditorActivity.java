package com.mycompany.gitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class EditorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        DataManager.editorActivity = this;
        DataManager.editorManager = new EditorManager();
        DataManager.drawManager.emptyLevel();
    }

    public void selectWall(View v){
        DataManager.editorManager.selectUnit(new WallUnit(0,0));
    }

    public void selectButton(View v){
        DataManager.editorManager.selectUnit(new ButtonUnit(0,0));
    }

    public void selectBox(View v){
        DataManager.editorManager.selectUnit(new BoxUnit(0,0));
    }

    public void selectPlayer(View v){
        DataManager.editorManager.selectUnit(new PlayerUnit(0,0));
    }

    public void back(View v){
        startActivity(new Intent(EditorActivity.this, MainActivity.class));
    }
}