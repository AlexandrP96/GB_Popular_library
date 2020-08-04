package ru.alexbox.gb_popular_l.lesson_6.di;

import android.util.Log;

public class DiRed {

    private static final String TAG = "DiActivity - ";

    private DiGreen green;

    public DiRed(DiGreen green) {
        this.green = green;
        Log.d(TAG, "Red: " + green.show());
        Log.i(TAG, "Red: " + green);
    }
}
