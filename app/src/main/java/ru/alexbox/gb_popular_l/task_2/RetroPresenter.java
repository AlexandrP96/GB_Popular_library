package ru.alexbox.gb_popular_l.task_2;

import android.util.Log;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;

public class RetroPresenter {

    // result = "https://avatars0.githubusercontent.com/u/66577?v=4";
    private static final String TAG = "Task_2_avatar";

    private RetroApi retroApi;
    private String result;

    public RetroPresenter() {
        retroApi = new RetroApi();
    }

    public void getResult() {
        Observable<User> single = retroApi.requestServer();
        Disposable disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(user -> {
            initRes(user);
            Log.d(TAG, result);
        }, throwable -> {
            Log.e(TAG, "Task_2_Error");
        });
    }

    private void initRes(User user) {
        result = user.avatar_url;
    }

    public String getAnswer() {
        return result;
    }
}
