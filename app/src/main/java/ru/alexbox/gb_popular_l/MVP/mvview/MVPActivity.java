package ru.alexbox.gb_popular_l.MVP.mvview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import ru.alexbox.gb_popular_l.MVP.mvpresenter.mvpPresenter;
import ru.alexbox.gb_popular_l.R;

public class MVPActivity extends AppCompatActivity implements mvpView {

    private EditText editText;
    private TextView textView;
    private mvpPresenter mvp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_m_v_p);

        editText = findViewById(R.id.EditText);
        textView = findViewById(R.id.textView);
        
        mvp = new mvpPresenter(this);
    }

    public void onClick(View v) {
        mvp.onButtonClick();
    }

    @Override
    public void AppendText(String word) {
        textView.append(word);
    }

    @Override
    public String GetEditText(String eWord) {
        eWord = String.valueOf(editText.getText());
        return eWord;
    }
}