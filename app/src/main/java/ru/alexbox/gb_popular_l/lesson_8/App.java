package ru.alexbox.gb_popular_l.lesson_8;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        if (LeakCanary.isInAnalyzerProcess(this)) {
            return;
        }
        LeakCanary.install(this);
    }
}
