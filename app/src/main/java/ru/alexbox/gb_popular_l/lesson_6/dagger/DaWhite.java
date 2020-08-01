package ru.alexbox.gb_popular_l.lesson_6.dagger;

import android.util.Log;

import javax.inject.Inject;

import ru.alexbox.gb_popular_l.lesson_6.dagger.app.App;

public class DaWhite {

    private static final String TAG = "DaggerActivity";

    @Inject
    DaGreen green;

    public DaWhite() {
        App.getAppComponent().inject(this);
        Log.d(TAG, "White: " + green.show());
        Log.i(TAG, "White: " + green);
    }
}
