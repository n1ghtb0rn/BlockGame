package com.mycompany.gitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class EditorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editor);

        DataManager.editorActivity = this;
        DataManager.drawManager.emptyLevel();
    }

    public void selectWall(View v){

    }

    public void selectButton(View v){

    }

    public void selectBox(View v){

    }

    public void selectPlayer(View v){

    }

    public void back(View v){
        startActivity(new Intent(EditorActivity.this, MainActivity.class));
    }
}