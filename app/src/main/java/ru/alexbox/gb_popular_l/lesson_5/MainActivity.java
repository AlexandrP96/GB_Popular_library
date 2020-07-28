package ru.alexbox.gb_popular_l.lesson_5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import ru.alexbox.gb_popular_l.R;

public class MainActivity extends AppCompatActivity {

    private RoomPresenter presenter;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        presenter = new RoomPresenter();
    }

    public void AppUser(View view) {
        presenter.putUser();
    }

    public void DeleteUser(View view) {
        presenter.deleteUser();

    }

    public void UpdateUser(View view) {
        presenter.updateUser();

    }

    public void GetUsers(View view) {
        presenter.getUsers();
    }
}
