package ru.alexbox.gb_popular_l.task_2;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class RetroPresenter {

    private static final String TAG = "Task_2_avatar";

    private RetroApi retroApi;

    public RetroPresenter() {
        retroApi = new RetroApi();
    }

    public void getString() {
        Observable<String> single = retroApi.requestServer();

        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(str -> {
            Log.d(TAG, "onNext: " + str);
        }, throwable -> {
            Log.e(TAG, "onError");
        });
    }
}
