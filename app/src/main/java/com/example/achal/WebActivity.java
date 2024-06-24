package com.example.achal;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {
    WebView wvbobj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        wvbobj=findViewById(R.id.wvb);
        wvbobj.loadUrl("https://www.facebook.com");

    }
}