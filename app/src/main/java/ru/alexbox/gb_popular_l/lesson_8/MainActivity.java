package ru.alexbox.gb_popular_l.lesson_8;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ru.alexbox.gb_popular_l.R;

public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.taskTwoView);
        button = findViewById(R.id.btnTaskTwo);
        textView.setVisibility(View.INVISIBLE);

        buttonLogic();
    }

    private void buttonLogic() {
        button.setOnClickListener(v -> textView.setVisibility(View.VISIBLE));
    }

}
