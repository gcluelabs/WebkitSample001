package com.example.webkit;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebkitSample extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		// Webの表示
		WebView webView = new WebView(this);
		webView.loadUrl("http://www.gclue.com");
		setContentView(webView);
	}
}
