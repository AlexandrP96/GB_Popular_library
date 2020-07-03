package ru.alexbox.gb_popular_l;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import ru.alexbox.gb_popular_l.task2.SecondActivity;
import ru.alexbox.gb_popular_l.task1.FirstActivity;

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
            Intent third = new Intent(getApplicationContext(), FirstActivity.class);
            startActivity(third);
        });

        task2.setOnClickListener(v -> {
            Intent second = new Intent(getApplicationContext(), SecondActivity.class);
            startActivity(second);
        });
    }
}
