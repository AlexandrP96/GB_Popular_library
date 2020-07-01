package ru.alexbox.gb_popular_l;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.alexbox.gb_popular_l.task1.FirstActivity;
import ru.alexbox.gb_popular_l.task2.SecondActivity;
import ru.alexbox.gb_popular_l.task3.ThirdActivity;

public class MainActivity extends AppCompatActivity {

    // Lesson 3

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Buttons();
    }

    private void Buttons() {
        Button task1 = findViewById(R.id.BtnOne);
        Button task2 = findViewById(R.id.BtnTwo);
        Button task3 = findViewById(R.id.BtnThree);


        task1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent first = new Intent(getApplicationContext(), FirstActivity.class);
                startActivity(first);
            }
        });

        task2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent second = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(second);
            }
        });

        task3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent third = new Intent(getApplicationContext(), ThirdActivity.class);
                startActivity(third);
            }
        });

    }
}
