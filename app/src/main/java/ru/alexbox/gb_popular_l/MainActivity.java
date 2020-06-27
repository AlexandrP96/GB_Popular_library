package ru.alexbox.gb_popular_l;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import ru.alexbox.gb_popular_l.MVP.mvview.MVPActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Buttons();
    }

    private void Buttons() {
        Button ButtonMVP = findViewById(R.id.BtnMVP);
        Button ButtonMoxy = findViewById(R.id.BtnMoxy);

        ButtonMVP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentMV = new Intent(getApplicationContext(), MVPActivity.class);
                startActivity(intentMV);
            }
        });

        ButtonMoxy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        });
    }
}