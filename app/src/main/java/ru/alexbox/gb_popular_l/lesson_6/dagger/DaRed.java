package ru.alexbox.gb_popular_l.lesson_6.dagger;

import android.util.Log;

import javax.inject.Inject;

import ru.alexbox.gb_popular_l.lesson_6.dagger.app.App;

public class DaRed {

    private static final String TAG = "DaggerActivity";

    @Inject
    DaGreen green;

    public DaRed() {
        App.getAppComponent().inject(this);
        Log.d(TAG, "Red: " + green.show());
        Log.i(TAG, "Red: " + green);
    }
}
