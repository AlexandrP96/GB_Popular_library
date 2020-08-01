package ru.alexbox.gb_popular_l.lesson_6.di;

import android.util.Log;

public class DiWhite {

    private static final String TAG = "DiActivity - ";

    private DiGreen green;

    public DiWhite(DiGreen green) {
        this.green = green;

        Log.d(TAG, "White: " + green.show());
        Log.i(TAG, "White: " + green);
    }
}
