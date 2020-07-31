package ru.alexbox.gb_popular_l.lesson_6.nodi;

import android.util.Log;

public class NoDiWhite {

    private static final String TAG = "White";

    public NoDiWhite() {
        NoDiGreen green = new NoDiGreen();

        Log.i(TAG, "White: " + green.show());
        Log.i(TAG, "White: " + green);
    }
}
