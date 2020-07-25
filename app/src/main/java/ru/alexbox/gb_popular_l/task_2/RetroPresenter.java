package ru.alexbox.gb_popular_l.task_2;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class RetroPresenter {

    private static final String TAG = "Task_2_avatar";

    private RetroApi retroApi;
    private String result;

    public RetroPresenter() {
        retroApi = new RetroApi();
    }

    public String getResult() {
        Observable<User> single = retroApi.requestServer();
        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(user -> {
            result = user.avatar_url;
            Log.d(TAG, "Task_2_Avatar: " + result);
        }, throwable -> {
            Log.e(TAG, "Task_2_Error");
        });
        return result;
    }
}
