package ru.alexbox.gb_popular_l.task_2;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface RetroService {

    @GET("/users/{user}")
    Observable<User> getUser(@Path("user") String user);

}
