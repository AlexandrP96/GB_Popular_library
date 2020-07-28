package ru.alexbox.gb_popular_l.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import io.reactivex.Single;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import ru.alexbox.gb_popular_l.R;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "Task 2";

    private Disposable disposable;
    private Single<String> single;

    @BindView(R.id.singleView)
    TextView singleView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        SinglePresenter presenter = new SinglePresenter();
        single = presenter.getSingle();

        ButterKnife.bind(this);
    }

    @SuppressLint("SetTextI18n")
    @OnClick(R.id.btnSingle)
    public void onSingleClick(View view) {
        Task2Logic();
        singleView.setText(TAG);
    }

    public void Task2Logic() {
        disposable = single.observeOn(AndroidSchedulers.mainThread()).subscribe(string -> {
            Log.d(TAG, "Task 2 : " + string);
        }, throwable -> {
            Log.d(TAG, "Task 2 : ", throwable);
        });
    }
}