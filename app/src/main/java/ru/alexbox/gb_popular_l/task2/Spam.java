package ru.alexbox.gb_popular_l.task2;

import android.util.Log;

public class Spam implements Observer {

    private static final String TAG = "Spam ";

    @Override
    public void statusOb(String numb) {
        Log.d(TAG, "Number of a spam message: " + numb);
    }
}
