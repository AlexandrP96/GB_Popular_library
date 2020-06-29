package ru.alexbox.gb_popular_l.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.concurrent.TimeUnit;

import ru.alexbox.gb_popular_l.R;

public class FirstActivity extends AppCompatActivity {

    private static final String TAG = "FirstActivity";
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        button = findViewById(R.id.btnAsynch);
        onButton();
    }

    private void onButton() {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initAsync();
            }
        });
    }

    private void initAsync() {
        MyAsyncTask asyncTask = new MyAsyncTask();
        asyncTask.execute();
        Log.d(TAG, "AsyncTask started in Thread : " + Thread.currentThread().getName());
    }

    private static class MyAsyncTask extends AsyncTask<Void, Void, Void> {

        @Override
        protected Void doInBackground(Void... voids) {

            for (int i = 0; i < 5; i++) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                    Log.d(TAG, " " + Thread.currentThread().getName() + i);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            return null;
        }

        @Override
        protected void onPostExecute(Void aVoid) {
            super.onPostExecute(aVoid);
            Log.d(TAG, "AsyncTask finished in Thread : " + Thread.currentThread().getName());
        }
    }
}