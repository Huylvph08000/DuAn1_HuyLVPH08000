package com.example.duan1_huylvph08000.grammar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
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
        webView = (WebView) findViewById(R.id.simpleWebView);
        extras = getIntent().getExtras();
        extras = getIntent().getExtras();
        if (!extras.equals(null)) {
            String data = extras.getString("titles");
            Log.d(TAG, "onCreate: the coming data is " + data);
            String url = "file:///android_asset/" + data + ".html";
            webView.loadUrl(url);
            WebSettings webSettings = webView.getSettings();
            webSettings.setBuiltInZoomControls(true);
            webSettings.setDisplayZoomControls(true);
            webSettings.setJavaScriptEnabled(true);
        }
    }
}
