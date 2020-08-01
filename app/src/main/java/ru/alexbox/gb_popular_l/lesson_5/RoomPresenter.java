package ru.alexbox.gb_popular_l.lesson_5;

import android.util.Log;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

import ru.alexbox.gb_popular_l.App;

public class RoomPresenter {

    private static final String TAG = "TaskFiveP";

    private UserDao dao;
    private MainView mainView;

    public RoomPresenter(MainView mainView) {
        dao = App.getBase().userDao();
        this.mainView = mainView;
    }


    public void putUser() {
        User user = new User();
        user.name = "Arnold";
        user.surname = "Terminator";
        user.age = 30;

        Disposable disposable = dao.addU(user).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(id -> Log.d(TAG, "add User: " + id), throwable -> Log.d(TAG, "Lesson 5: " + throwable));
        mainView.setText(String.valueOf(user));
    }

    public void deleteUser() {
        User user = new User();
        user.id = 3;
        Disposable disposable = dao.delU(user).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(id -> Log.d(TAG, "delete User: " + id), throwable -> Log.d(TAG, "Lesson 5: " + throwable));
        mainView.setText(String.valueOf(user));
    }

        public void updateUser() {
            User user = new User();
            user.id = 3;
            Disposable disposable = dao.upU(user).subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                    .subscribe(id -> Log.d(TAG, "Update User: " + id), throwable -> Log.d(TAG, "Lesson 5: " + throwable));
            mainView.setText(String.valueOf(user));
    }

    public void getUsers() {
        Disposable disposable = dao.getAll().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
                .subscribe(users -> Log.d(TAG, "get all Users: " + users + " " + Thread.currentThread().getName()),
                        throwable -> Log.d(TAG, "Lesson 5: " + throwable));
    }
}
