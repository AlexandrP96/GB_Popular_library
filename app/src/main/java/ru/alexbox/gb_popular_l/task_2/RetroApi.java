package ru.alexbox.gb_popular_l.task_2;

import io.reactivex.Observable;
import io.reactivex.schedulers.Schedulers;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

public class RetroApi {

    public Observable<String> requestServer() {

        ScalarsConverterFactory scalarsConverterFactory = ScalarsConverterFactory.create();

        RetroService api = new Retrofit.Builder()
                .baseUrl("https://api.github.com")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(scalarsConverterFactory)
                .build()
                .create(RetroService.class);

        return api.getUser().subscribeOn(Schedulers.io());
    }
}
