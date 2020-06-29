package ru.alexbox.gb_popular_l.task3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.alexbox.gb_popular_l.R;

public class ThirdActivity extends AppCompatActivity {

    private Button rxSub;
    private Button rxUn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        rxSub = findViewById(R.id.btnRxSub);
        rxUn = findViewById(R.id.btnUnRx);

        onRxButtons();
    }

    private void onRxButtons() {

        rxSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        rxUn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}