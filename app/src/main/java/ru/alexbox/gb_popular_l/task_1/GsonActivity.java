package ru.alexbox.gb_popular_l.task_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import ru.alexbox.gb_popular_l.R;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonActivity extends AppCompatActivity {

    private static final String TAG = "GsonActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gson);

        initTask();
    }

    private void initTask() {
        String json = "{\n" +
                "  \"time_of_year\": \"summer\",\n" +
                "  \"year\": 2019,\n" +
                "  \"avatar_url\": \"https://avatars0.githubusercontent.com/u/66577?v=4\",\n" +
                "  \"test_line\": \"useless\"\n" +
                "}";

        Gson gson = new GsonBuilder().create();
        GsonData data = gson.fromJson(json, GsonData.class);

        Log.e(TAG, "Task_1_time_of_year: " + data.time_of_year);
        Log.e(TAG, "Task_1_year: " + data.year);
    }
}