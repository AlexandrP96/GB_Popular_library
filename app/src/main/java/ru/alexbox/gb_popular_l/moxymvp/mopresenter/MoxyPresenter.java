package ru.alexbox.gb_popular_l.moxymvp.mopresenter;

import moxy.InjectViewState;
import moxy.MvpPresenter;
import ru.alexbox.gb_popular_l.moxymvp.momodel.MoxyModel;
import ru.alexbox.gb_popular_l.moxymvp.moview.MoxyView;

@InjectViewState
public class MoxyPresenter extends MvpPresenter<MoxyView> {

    private MoxyModel moxy;

    public MoxyPresenter() {
        this.moxy = new MoxyModel();
    }

    @Override
    protected void onFirstViewAttach() {
        super.onFirstViewAttach();
    }

    public void onButtonClick() {
        String word = "Сольнце";

        if (moxy != null) {
            moxy.setWord(word);
            getViewState().AppendText(word);
        }
    }
}
