package imastudio.co.id.webview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class FacebookActivity extends AppCompatActivity {

    @BindView(R.id.webviewFacebook)
    WebView webviewFacebook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook);
        //fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
        WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ButterKnife.bind(this);
        webviewFacebook.setWebViewClient(new WebViewClient());
        webviewFacebook.getSettings().setJavaScriptEnabled(true);
        webviewFacebook.getSettings().getBuiltInZoomControls();
        webviewFacebook.loadUrl("http://facebook.com");
    }

    //agar bisa di back ke halaman sebelumnya
    public void onBackPressed(){
        if(webviewFacebook.canGoBack()){
            webviewFacebook.goBack();
        }else {
            super.onBackPressed();
        }
    }

    @OnClick(R.id.webviewFacebook)
    public void onViewClicked() {
    }
}
