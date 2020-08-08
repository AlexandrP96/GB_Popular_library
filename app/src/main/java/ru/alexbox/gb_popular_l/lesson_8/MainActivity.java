package ru.alexbox.gb_popular_l.lesson_8;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import ru.alexbox.gb_popular_l.R;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Task_2_Leak";

    private TextView textView;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.mainView);
        button = findViewById(R.id.btnError);
        textView.setVisibility(View.INVISIBLE);

        buttonLogic();
    }

    private void buttonLogic() {
        button.setOnClickListener(v -> {
            textView.setVisibility(View.VISIBLE);
            start();
        });
    }

    @SuppressLint("StaticFieldLeak")
    private void start(){
        new AsyncTask<Void, Void, Void>(){

            @Override
            protected Void doInBackground(Void... voids) {
                for (int i = 0; i < 30; i++) {
                    SystemClock.sleep(1000);
                    Log.d(TAG, "MainThread: " + MainActivity.this);
                }

                return null;
            }
        }.execute();
    }
}
