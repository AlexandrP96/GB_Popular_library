package ru.alexbox.gb_popular_l.task_2;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Path;
import ru.alexbox.gb_popular_l.task_1.GsonData;

public interface RetroService {

    @GET("/users/{user}")
    Observable<GsonData> getUser(@Path("user") String user);

}
