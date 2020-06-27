package ru.alexbox.gb_popular_l.moxymvp.moview;

import moxy.MvpView;
import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface MoxyView extends MvpView {

    @StateStrategyType(value = AddToEndStrategy.class)
    void AppendText(String word);
}
