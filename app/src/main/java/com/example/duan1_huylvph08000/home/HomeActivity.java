package com.example.duan1_huylvph08000.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.duan1_huylvph08000.dictonary.DictonaryActivity;
import com.example.duan1_huylvph08000.introduction.IntroductionActivity;
import com.example.duan1_huylvph08000.R;
import com.example.duan1_huylvph08000.grammar.StructActivity;
import com.example.duan1_huylvph08000.vocabulary.Main2Activity;

public class HomeActivity extends AppCompatActivity implements HomeMVP.View, View.OnClickListener{
Intent intent;
CardView grammar, dictonary, vocabulary, introduction;
HomeMVP.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        setTitle("English Learning");
        findViewById();
        presenter = new HomePresenter(this);

    }

    private void findViewById() {
        grammar = findViewById(R.id.Grammar);
        dictonary = findViewById(R.id.dictonary);
        vocabulary = findViewById(R.id.Vocabulary);
        introduction = findViewById(R.id.introduction);

        grammar.setOnClickListener(this);
        dictonary.setOnClickListener(this);
        vocabulary.setOnClickListener(this);
        introduction.setOnClickListener(this);
    }


//    public void Voca(View view){
//        intent = new Intent(HomeActivity.this, ListSubjectWordActivity.class);
//        startActivity(intent);
//    }
//    public void dictonary(View view){
//        intent = new Intent(HomeActivity.this, DictonaryActivity.class);
//        startActivity(intent);
//    }
//    public void introduction(View view){
//        intent = new Intent(HomeActivity.this, IntroductionActivity.class);
//        startActivity(intent);
//    }
//    public void Struct(View view){
//        intent = new Intent(this, StructActivity.class);
//        startActivity(intent);
//    }

    @Override
    public void goGrammar() {
        intent = new Intent(HomeActivity.this, StructActivity.class);
        startActivity(intent);
    }

    @Override
    public void goVocabulary() {
        intent = new Intent(HomeActivity.this, Main2Activity.class);
        startActivity(intent);
    }

    @Override
    public void goDictonary() {
        intent = new Intent(HomeActivity.this, DictonaryActivity.class);
        startActivity(intent);
    }

    @Override
    public void goIntroduction() {
        intent = new Intent(HomeActivity.this, IntroductionActivity.class);
        startActivity(intent);
    }

    @Override
    public void exit() {
      finish();
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.Grammar:
             presenter.clickedGrammar();
             break;
            case R.id.dictonary:
             presenter.clickedDictonary();
             break;
            case R.id.Vocabulary:
             presenter.clickedVocabulary();
             break;
            case R.id.introduction:
             presenter.clickedIntroduction();
             break;
             default:
                 break;
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.thoat, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_Grammar:
                presenter.clickedGrammar();
                break;
            case R.id.menu_Dictionary:
                presenter.clickedDictonary();
                break;
            case R.id.menu_Vocabulary:
                presenter.clickedVocabulary();
                break;
            case R.id.menu_Infomation:
                presenter.clickedIntroduction();
                break;
            case R.id.Exist:
            presenter.clickedExist();
            default:


        }
        return super.onOptionsItemSelected(item);
    }
}
