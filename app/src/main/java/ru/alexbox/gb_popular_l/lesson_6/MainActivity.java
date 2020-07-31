package ru.alexbox.gb_popular_l.lesson_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import ru.alexbox.gb_popular_l.R;
import ru.alexbox.gb_popular_l.lesson_6.dagger.DaggerActivity;
import ru.alexbox.gb_popular_l.lesson_6.di.DiActivity;
import ru.alexbox.gb_popular_l.lesson_6.nodi.NoDiActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initButtons();
    }

    private void initButtons() {
        Button btnOne = findViewById(R.id.btnOne);
        Button btnTwo = findViewById(R.id.btnTwo);
        Button btnThree = findViewById(R.id.btnThree);

        btnOne.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), NoDiActivity.class);
            startActivity(intent);
        });

        btnTwo.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), DiActivity.class);
            startActivity(intent);
        });

        btnThree.setOnClickListener(v -> {
            Intent intent = new Intent(getApplicationContext(), DaggerActivity.class);
            startActivity(intent);
        });
    }
}
