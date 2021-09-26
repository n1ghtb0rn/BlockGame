package com.mycompany.gitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startGame(View v){
        startActivity(new Intent(MainActivity.this, GameActivity.class));
    }

    public void levelEditor(View v){
        startActivity(new Intent(MainActivity.this, EditorActivity.class));
    }
}