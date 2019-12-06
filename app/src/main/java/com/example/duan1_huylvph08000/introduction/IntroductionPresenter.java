package com.example.duan1_huylvph08000.introduction;

public class IntroductionPresenter implements IntroductionMVP.Presenter {
    IntroductionMVP.View view;

    public IntroductionPresenter(IntroductionMVP.View view) {
        this.view = view;
    }

    @Override
    public void ClickeBackhome() {
        view.backHome();
    }
}
