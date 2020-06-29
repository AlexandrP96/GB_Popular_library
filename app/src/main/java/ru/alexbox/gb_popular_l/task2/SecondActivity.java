package ru.alexbox.gb_popular_l.task2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.alexbox.gb_popular_l.R;

public class SecondActivity extends AppCompatActivity {

    private Button subscribe;
    private Button unSubscribe;
    private Button spam;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        subscribe = findViewById(R.id.btnSubscribe);
        unSubscribe = findViewById(R.id.btnUnsubscribe);
        spam = findViewById(R.id.btnSpam);

        onButtons();
    }


    private void onButtons() {

        subscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        unSubscribe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        spam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}