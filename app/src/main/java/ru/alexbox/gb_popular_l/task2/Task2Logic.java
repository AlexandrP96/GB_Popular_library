package ru.alexbox.gb_popular_l.task2;

import android.util.Log;

import java.util.ArrayList;


public class Task2Logic implements ObsFunc {

    private static final String TAG = "Task 2/ ";

    private ArrayList<Observer> arrayList;
    private String numb;

    public Task2Logic() {
        arrayList = new ArrayList<>();
    }

    public void initSpam(String numb) {
        this.numb = numb;

        spamOb();
    }

    @Override
    public void subscribeOb(Observer observer) {
        Log.d(TAG, "user subscribed");
        arrayList.add(observer);
    }

    @Override
    public void unSubscribeOb(Observer observer) {
        Log.d(TAG, "user unsubscribed");
        arrayList.remove(observer);
    }

    @Override
    public void spamOb() {
        Log.d(TAG, "user check");
        for (int i = 0; i < arrayList.size(); i++) {
            Observer observer = arrayList.get(i);
            observer.statusOb(numb);
        }
    }
}
