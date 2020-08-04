package ru.alexbox.gb_popular_l.lesson_6.nodi;

import android.util.Log;

public class NoDiRed {

    private static final String TAG = "NoDiActivity - ";

    public NoDiRed() {
        NoDiGreen green = new NoDiGreen();

        Log.d(TAG, "Red: " + green.show());
        Log.i(TAG, "Red: " + green);
    }
}
