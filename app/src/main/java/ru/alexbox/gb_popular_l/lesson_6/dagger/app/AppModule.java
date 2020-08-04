package ru.alexbox.gb_popular_l.lesson_6.dagger.app;

import android.app.Application;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ru.alexbox.gb_popular_l.lesson_6.dagger.DaGreen;

@Module
public class AppModule {

    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    DaGreen getGreen() {
        return new DaGreen();
    }
}
