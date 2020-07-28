package ru.alexbox.gb_popular_l.task1;

import android.util.Log;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.schedulers.Schedulers;

public class Presenter {

    private static final String TAG = "Presenter";

    public Observable<String> getMessage() {

        return Observable.create((ObservableOnSubscribe<String>) emitter -> {

            try {
                for (int i = 0; i < 10; i++) {
                    TimeUnit.SECONDS.sleep(1);
                    String message = " message - " + i;
                    Log.d(TAG, "This is - " + Thread.currentThread().getName() + message);
                    emitter.onNext(message);
                }
                emitter.onComplete();
            } catch (InterruptedException e) {
                Log.d(TAG, "Error at task 1!");
            }


        }).subscribeOn(Schedulers.io());
    }
}
