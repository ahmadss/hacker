package com.androidlokomedia.hackernews;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ArticleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_article);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        WebView webView = (WebView)findViewById(R.id.wapViews);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());

        Intent intent = getIntent();
        String url = intent.getStringExtra("articleUrl");
        String content = intent.getStringExtra("content");
        Log.i("contentWeb", "onCreate: "+content);
        webView.loadData(content, "text/html", "UTF-8");

//        webView.loadUrl(url);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

}
