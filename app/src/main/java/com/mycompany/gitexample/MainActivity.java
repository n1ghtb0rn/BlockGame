package com.mycompany.gitexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DataManager.drawManager = new DrawManager();
        LevelManager.createLevels();
        this.textView = findViewById(R.id.textView);
        this.textView.setText("Welcome, " + DataManager.playerName + "!");
    }

    public void changeName(View v){
        EditText editText = findViewById(R.id.editText);
        String name = editText.getText().toString();
        if(name.length() < 1){
            this.textView.setTextColor(Color.RED);
            this.textView.setText("Enter at least one char");
            return;
        }
        this.textView.setTextColor(Color.WHITE);
        DataManager.playerName = name;
        this.textView.setText("Welcome, " + DataManager.playerName + "!");
    }

    public void startGame(View v){
        startActivity(new Intent(MainActivity.this, GameActivity.class));
    }

    public void levelEditor(View v){
        startActivity(new Intent(MainActivity.this, EditorActivity.class));
    }
}