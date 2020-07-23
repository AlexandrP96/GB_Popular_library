package ru.alexbox.gb_popular_l.task_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import ru.alexbox.gb_popular_l.R;

public class RetroActivity extends AppCompatActivity {

    private Button retroButton;
    private ImageView retroView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retro);

        retroButton = findViewById(R.id.btnRetrofit);
        retroView = findViewById(R.id.retroView);
        initTask();
    }

    private void initTask() {
        retroButton.setOnClickListener(v -> {

        });
    }
}