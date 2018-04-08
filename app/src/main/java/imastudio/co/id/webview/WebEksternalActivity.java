package imastudio.co.id.webview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class WebEksternalActivity extends AppCompatActivity {

    @BindView(R.id.webEksternal)
    WebView webEksternal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_eksternal);
        ButterKnife.bind(this);

        webEksternal.getSettings().setJavaScriptEnabled(true);
        webEksternal.setWebViewClient(new WebViewClient());
        webEksternal.loadUrl("file:///android_asset/blog.html");
    }

    @OnClick(R.id.webEksternal)
    public void onViewClicked() {
    }
}
