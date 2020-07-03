package ru.alexbox.gb_popular_l.task2;

import android.util.Log;

import io.reactivex.Single;
import io.reactivex.SingleOnSubscribe;
import io.reactivex.schedulers.Schedulers;

public class SinglePresenter {

    private static final String TAG = "SinglePresenter";

    public Single<String> getSingle() {
        return Single.create((SingleOnSubscribe<String>) emitter -> {
            String single = "Single Presenter";
            Log.d(TAG, "Task 2/ " + Thread.currentThread().getName() + single);
            emitter.onSuccess(single);
        }).subscribeOn(Schedulers.io());
    }
}
