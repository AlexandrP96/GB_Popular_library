package ru.alexbox.gb_popular_l.lesson_5;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;
import io.reactivex.Single;

@Dao
public interface UserDao {

    @Query("SElECT * FROM Users")
    Single<List<User>> getAll();

    @Insert
    Single<Long> addU(User user);

    @Delete
    Single<Integer> delU(User user);

    @Update
    Single<Integer> upU(User user);
}








