package ru.alexbox.gb_popular_l;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import ru.alexbox.gb_popular_l.task_1.GsonActivity;
import ru.alexbox.gb_popular_l.task_2.RetroActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Buttons();
    }

    private void Buttons() {
        Button task1 = findViewById(R.id.BtnOne);
        Button task2 = findViewById(R.id.BtnTwo);


        task1.setOnClickListener(v -> {
            Intent first = new Intent(getApplicationContext(), GsonActivity.class);
            startActivity(first);
        });

        task2.setOnClickListener(v -> {
            Intent second = new Intent(getApplicationContext(), RetroActivity.class);
            startActivity(second);
        });
    }
}
