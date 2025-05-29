package com.tarik.youtubeaa;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webview);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://m.youtube.com");

        Button homeButton = findViewById(R.id.homeButton);
        Button playlistButton = findViewById(R.id.playlistButton);
        Button searchButton = findViewById(R.id.searchButton);

        homeButton.setOnClickListener(v -> webView.loadUrl("https://m.youtube.com"));
        playlistButton.setOnClickListener(v -> webView.loadUrl("https://m.youtube.com/feed/library"));
        searchButton.setOnClickListener(v -> webView.loadUrl("https://m.youtube.com/results?search_query=android+auto+youtube"));
    }
}