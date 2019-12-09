package com.example.duan1_huylvph08000.grammar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.example.duan1_huylvph08000.R;

public class DescriptionActivity extends AppCompatActivity {
    private Bundle extras;
    private static final String TAG = "DescriptionActivity";
    private Context mContext;
    private WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_description);
        mContext = DescriptionActivity.this;
        setTitle("English Vocabulary");
        webView = (WebView) findViewById(R.id.simpleWebView);
        extras = getIntent().getExtras();
        extras = getIntent().getExtras();
        if (!extras.equals(null)) {
            String data = extras.getString("titles");
       //     Log.d(TAG, "onCreate: the coming data is " + data);
            String url = "file:///android_asset/" + data + ".html";
            webView.loadUrl(url);
            WebSettings webSettings = webView.getSettings();
            webSettings.setBuiltInZoomControls(true);
            webSettings.setDisplayZoomControls(true);
            webSettings.setJavaScriptEnabled(true);
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.menu_back_tenses, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.backTenses :
                Intent intent = new Intent(DescriptionActivity.this, StructActivity.class);
                startActivity(intent);
                default:
                    return super.onOptionsItemSelected(item);
        }

    }
}
