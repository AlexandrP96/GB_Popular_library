package ru.alexbox.gb_popular_l;

import android.app.Application;
import androidx.room.Room;

import ru.alexbox.gb_popular_l.lesson_5.AppDataBase;

public class App extends Application {

    private static AppDataBase base;

    @Override
    public void onCreate() {
        super.onCreate();

        base = Room.databaseBuilder(getApplicationContext(), AppDataBase.class, "room_data").build();
    }

    public static AppDataBase getBase() {
        return base;
    }
}
