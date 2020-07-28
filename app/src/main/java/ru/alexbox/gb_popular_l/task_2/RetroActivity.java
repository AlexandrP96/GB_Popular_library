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

        presenter = new RetroPresenter();
        initView();
        initTask();
    }

    private void initView() {
        retroButton = findViewById(R.id.btnRetrofit);
        retroView = findViewById(R.id.retroView);
    }

    private void initTask() {
        presenter.getResult();
        String result = presenter.getAnswer();

        retroButton.setOnClickListener(v -> Glide
                .with(this)
                .load(result)
                .into(retroView));
    }
}