package ru.alexbox.gb_popular_l.MVP.mvpresenter;

import ru.alexbox.gb_popular_l.MVP.mvmodel.mvpModel;
import ru.alexbox.gb_popular_l.MVP.mvview.mvpView;

public class mvpPresenter {

    private mvpModel MVPModel;
    private mvpView MVPView;

    public mvpPresenter(mvpView MVPView) {
        this.MVPView = MVPView;
        MVPModel = new mvpModel();
    }

    public void onButtonClick() {
        String word = "";
        String eWord = MVPView.GetEditText(word);

        if (MVPModel != null) {
            MVPModel.setWord(eWord);
            MVPView.AppendText(eWord);
        }

    }
}
