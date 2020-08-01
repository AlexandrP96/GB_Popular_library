package ru.alexbox.gb_popular_l.lesson_6.dagger.app;

import javax.inject.Singleton;
import dagger.Component;
import ru.alexbox.gb_popular_l.lesson_6.dagger.DaRed;
import ru.alexbox.gb_popular_l.lesson_6.dagger.DaWhite;
import ru.alexbox.gb_popular_l.lesson_6.dagger.DaggerActivity;

@Singleton
@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(DaggerActivity daggerActivity);
    void inject(DaRed red);
    void inject(DaWhite white);
}
