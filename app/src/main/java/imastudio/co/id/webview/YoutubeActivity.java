package imastudio.co.id.webview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class YoutubeActivity extends AppCompatActivity {

    @BindView(R.id.webviewYoutube)
    WebView webviewYoutube;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);

        //fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ButterKnife.bind(this);

        webviewYoutube.setWebViewClient(new WebViewClient());
        webviewYoutube.getSettings().setJavaScriptEnabled(true);
        webviewYoutube.getSettings().getBuiltInZoomControls();
        webviewYoutube.loadUrl("http://youtube.com");
    }

    @OnClick(R.id.webviewYoutube)
    public void onViewClicked() {
    }
}
