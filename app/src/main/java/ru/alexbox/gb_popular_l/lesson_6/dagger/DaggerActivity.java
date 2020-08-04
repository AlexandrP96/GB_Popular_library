package ru.alexbox.gb_popular_l.lesson_6.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import ru.alexbox.gb_popular_l.R;
import ru.alexbox.gb_popular_l.lesson_6.dagger.app.App;

public class DaggerActivity extends AppCompatActivity {

    private static final String TAG = "DaggerActivity";

    @Inject
    DaGreen green;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger);

        App.getAppComponent().inject(this);

        initTask();
    }

    private void initTask() {
        DaRed red = new DaRed();
        DaWhite white = new DaWhite();

        Log.d(TAG, "onCreate: " + green.show());
        Log.i(TAG, "onCreate: " + green);
    }
}