package com.example.duan1_huylvph08000.home;

public interface HomeMVP {
    interface View{
        void goGrammar();
        void goVocabulary();
        void goDictonary();
        void goIntroduction();
        void exit();
    }
    interface Presenter{
        void clickedGrammar();
        void clickedVocabulary();
        void clickedDictonary();
        void clickedIntroduction();
        void clickedExist();
    }
}
