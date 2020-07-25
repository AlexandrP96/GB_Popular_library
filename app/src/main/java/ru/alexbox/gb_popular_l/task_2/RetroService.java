package ru.alexbox.gb_popular_l.task_2;

import io.reactivex.Observable;
import retrofit2.http.GET;

public interface RetroService {

    @GET("/users/JakeWharton")
    Observable<String> getUser();

}
