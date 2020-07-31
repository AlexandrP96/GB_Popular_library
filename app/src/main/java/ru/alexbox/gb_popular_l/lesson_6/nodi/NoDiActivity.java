package ru.alexbox.gb_popular_l.lesson_6.nodi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import ru.alexbox.gb_popular_l.R;

public class NoDiActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_di);

        NoDiGreen green = new NoDiGreen();
        NoDiRed red = new NoDiRed();
        NoDiWhite white = new NoDiWhite();
    }
}