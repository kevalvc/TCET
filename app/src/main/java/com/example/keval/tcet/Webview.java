package com.example.keval.tcet;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/**
 * Created by keval on 7/27/2017.
 */

public class Webview extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.webview);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        WebView webView = (WebView) findViewById(R.id.webview1);
        Intent z = getIntent();

        String url = z.getStringExtra("Url");
        String pdf = z.getStringExtra("Pdf");
        String maps = z.getStringExtra("Maps");

/*        if (pdf == null && maps == null) {

            Log.i("BBBBBBB", "PDF URL : " + url);
        /*    webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(url);

            webView.setWebViewClient(new WebViewClient() {
  /*              @Override
                public boolean shouldOverrideUrlLoading(WebView view, String url) {
                    if ((url != null && url.startsWith("http://")) ||  (url != null && url.startsWith("https://"))) {
                        view.getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(url)));
                        return true;
                    } else {
                        return false;
                    }
//                return super.shouldOverrideUrlLoading(view, url);
                }
//END INNER COMMENT
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                    if ((request.getUrl().toString() != null && request.getUrl().toString().startsWith("http://")) ||  (request.getUrl().toString()!= null && request.getUrl().toString().startsWith("https://"))) {
                        view.getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(request.getUrl().toString())));
                        return true;
                    } else {
                        return false;
                    }
//                    return super.shouldOverrideUrlLoading(view, request);
                }
            });



        } else */if (pdf == null && url == null) {

            Log.i("BBBBBBB", "Maps URL : " + maps);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(maps);

            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                    if ((request.getUrl().toString() != null && request.getUrl().toString().startsWith("http://")) ||  (request.getUrl().toString()!= null && request.getUrl().toString().startsWith("https://"))) {
                        view.getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(request.getUrl().toString())));
                        return true;
                    } else {
                        return false;
                    }
//                    return super.shouldOverrideUrlLoading(view, request);
                }
            });


        } else {

            String Link = "http://docs.google.com/gview?embedded=true&url=" + pdf;
            Log.i("BBBBBBB", "PDF URL : " + Link);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(Link);

            webView.setWebViewClient(new WebViewClient() {
                @Override
                public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
                    if ((request.getUrl().toString() != null && request.getUrl().toString().startsWith("http://")) ||  (request.getUrl().toString()!= null && request.getUrl().toString().startsWith("https://"))) {
                        view.getContext().startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(request.getUrl().toString())));
                        return true;
                    } else {
                        return false;
                    }
//                    return super.shouldOverrideUrlLoading(view, request);
                }
            });


        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
