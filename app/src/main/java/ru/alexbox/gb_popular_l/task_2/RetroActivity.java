package ru.alexbox.gb_popular_l.task_2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

import ru.alexbox.gb_popular_l.R;

public class RetroActivity extends AppCompatActivity {

    private Button retroButton;
    private ImageView retroView;

    private RetroPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retro);

        retroButton = findViewById(R.id.btnRetrofit);
        retroView = findViewById(R.id.retroView);

        presenter = new RetroPresenter();

        initTask();
    }

    private void initTask() {
        presenter.getString();
        retroButton.setOnClickListener(v -> Glide
                .with(this)
                .load("https://avatars0.githubusercontent.com/u/66577?v=4")
                .into(retroView));
    }
}