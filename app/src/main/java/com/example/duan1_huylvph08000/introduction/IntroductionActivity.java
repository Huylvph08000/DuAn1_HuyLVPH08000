package com.example.duan1_huylvph08000.introduction;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.duan1_huylvph08000.home.HomeActivity;
import com.example.duan1_huylvph08000.R;

public class IntroductionActivity extends AppCompatActivity implements IntroductionMVP.View{
    IntroductionMVP.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_introduction);
        setTitle("Introduction about app");
        presenter = new IntroductionPresenter(this);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu1, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.backHome:
                presenter.ClickeBackhome();

        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void backHome() {
        Intent intent = new Intent(IntroductionActivity.this, HomeActivity.class);
        startActivity(intent);

    }
}
