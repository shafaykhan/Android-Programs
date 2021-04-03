package com.shafay.hp.learn_android.programs.display_execute;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import com.shafay.hp.learn_android.R;

public class Web_View extends AppCompatActivity {
    LinearLayout linearlay;
    EditText Link;
    Button Search;
    WebView Browser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        getSupportActionBar().setTitle("Web View");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        linearlay = (LinearLayout) findViewById(R.id.linearlay);
        Link = (EditText) findViewById(R.id.link);
        Search = (Button) findViewById(R.id.Search);
        Browser = new WebView(Web_View.this);
        linearlay.addView(Browser);
        Browser.setWebViewClient(new WebClient());

        Browser.loadUrl("https://basicandroidprogram.blogspot.com/?m=1");

        Search.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                Browser.setWebViewClient(new WebClient());
                Browser.loadUrl("http://" + Link.getText().toString());
            }
        });
    }

    private class WebClient extends WebViewClient {
        @Override
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            // TODO Auto-generated method stub
            view.loadUrl(url);
            return true;
        }
    }

}

