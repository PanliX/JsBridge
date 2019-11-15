package com.github.panlix.jsbridge;

import android.content.Context;

/**
 * WebView功能接口.
 */
public interface IWebView {

    Context getContext();

    void loadUrl(String url);
}
