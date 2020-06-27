package ru.alexbox.gb_popular_l.moxymvp.moview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import moxy.presenter.InjectPresenter;
import ru.alexbox.gb_popular_l.moxymvp.mopresenter.MoxyPresenter;
import ru.alexbox.gb_popular_l.R;

public class MoxyActivity extends AppCompatActivity implements MoxyView {

    private TextView textView;

    @InjectPresenter
    MoxyPresenter moxy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moxy);

        textView = findViewById(R.id.textView);
    }

    public void onClick(View v) {
        moxy.onButtonClick();
    }

    @Override
    public void AppendText(String word) {
        textView.append(word);
    }
}