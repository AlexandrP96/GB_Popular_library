package ru.alexbox.gb_popular_l.task3;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;

public class Presenter {

    private static final String TAG = "Presenter";

    public Observable<String> getMessage() {

        return Observable.create(new ObservableOnSubscribe<String>() {
            @Override
            public void subscribe(ObservableEmitter<String> emitter) throws Exception {

                for (int i = 0; i < 10; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    String message = " message - " + i;
                    Log.d(TAG, "This is - " + Thread.currentThread().getName() + message);
                    emitter.onNext(message);
                }

                emitter.onError(new NullPointerException());
                emitter.onComplete();
            }
        }).subscribeOn(Schedulers.io());
    }
}
