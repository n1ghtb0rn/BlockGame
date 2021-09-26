package com.mycompany.gitexample;

import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;

public class DataManager {

    public static final int UNIT_SIZE = 40;
    public static final int UNITS_X = 15;
    public static final int UNITS_Y = 15;
    public static final int CANVAS_SIZE_X = UNIT_SIZE * UNITS_X;
    public static final int CANVAS_SIZE_Y = UNIT_SIZE * UNITS_Y;
    public static final int GRADIENT_COLOR = Color.parseColor("#FFFFFF");

    public static String playerName = "Player";

    public static GameActivity gameActivity;
    public static EditorActivity editorActivity;
    public static DrawManager drawManager;

}
