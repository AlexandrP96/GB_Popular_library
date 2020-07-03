package ru.alexbox.gb_popular_l.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import ru.alexbox.gb_popular_l.R;

public class FirstActivity extends AppCompatActivity {

    private static final String TAG = "Task 1";

    private Observable<String> observable;
    private Disposable disposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Presenter presenter = new Presenter();
        observable = presenter.getMessage();

        ButterKnife.bind(this);
    }

    @OnClick(R.id.btnRxSub)
    public void onRxClick(View view) {
        Task1Logic();
    }

    @OnClick(R.id.btnUnRx)
    public void onRxUnClick(View view) {
        disposable.dispose();
    }

    public void Task1Logic() {
        disposable = observable.observeOn(AndroidSchedulers.mainThread()).subscribe(string ->
                Log.d(TAG, "Task 1/ Next in " + Thread.currentThread().getName()), throwable ->
                Log.e(TAG, "Task 1/ Error "), () ->
                Log.d(TAG, "Task 1/ Completed in " + Thread.currentThread().getName()));
    }
}