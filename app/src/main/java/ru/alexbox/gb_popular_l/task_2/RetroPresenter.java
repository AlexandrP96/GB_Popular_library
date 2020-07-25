package ru.alexbox.gb_popular_l.task_2;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import ru.alexbox.gb_popular_l.task_1.GsonData;

public class RetroPresenter {

    private static final String TAG = "Task_2_avatar";

    private RetroApi retroApi;

    public RetroPresenter() {
        retroApi = new RetroApi();
    }

    public void getString() {
        Observable<GsonData> single = retroApi.requestServer();

        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(user -> {
            Log.d(TAG, "Task_2_Avatar: " + user.avatar_url);
        }, throwable -> {
            Log.e(TAG, "onError");
        });
    }
}
