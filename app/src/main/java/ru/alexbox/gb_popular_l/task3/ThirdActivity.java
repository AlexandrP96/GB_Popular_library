package ru.alexbox.gb_popular_l.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import ru.alexbox.gb_popular_l.R;

public class ThirdActivity extends AppCompatActivity {

    private static final String TAG = "Task 3";

    private Button rxSub;
    private Button rxUn;

    private Observable<String> observable;
    private Disposable disposable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        rxSub = findViewById(R.id.btnRxSub);
        rxUn = findViewById(R.id.btnUnRx);

        Presenter presenter = new Presenter();
        observable = presenter.getMessage();
        onRxButtons();
    }

    private void onRxButtons() {

        rxSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Task3Logic();
            }
        });

        rxUn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                disposable.dispose();
            }
        });
    }

    private void Task3Logic() {
        observable.observeOn(AndroidSchedulers.mainThread()).subscribe(new Observer<String>() {


            @Override
            public void onSubscribe(Disposable d) {
                Log.d(TAG, "Task 3/ Subscribed in " + Thread.currentThread().getName());
                ThirdActivity.this.disposable = d;
            }

            @Override
            public void onNext(String s) {
                Log.d(TAG, "Task 3/ Next in " + Thread.currentThread().getName() + s);
            }

            @Override
            public void onError(Throwable e) {
                Log.e(TAG, "Task 3/ Error " + e);
            }

            @Override
            public void onComplete() {
                Log.d(TAG, "Task 3/ Completed in " + Thread.currentThread().getName());
            }
        });
        Log.d(TAG, "Task 3/subscribe end in " + Thread.currentThread().getName());
    }
}