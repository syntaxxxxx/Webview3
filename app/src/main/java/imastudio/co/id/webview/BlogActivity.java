package imastudio.co.id.webview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

import com.vstechlab.easyfonts.EasyFonts;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BlogActivity extends AppCompatActivity {

    @BindView(R.id.webviewBlog)
    WebView webviewBlog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blog);

        //fullscreen
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ButterKnife.bind(this);

        webviewBlog.setWebViewClient(new WebViewClient());
        webviewBlog.getSettings().setJavaScriptEnabled(true);
        webviewBlog.getSettings().getBuiltInZoomControls();
        webviewBlog.loadUrl("http://blogbasbas.info");

    }

    @OnClick(R.id.webviewBlog)
    public void onViewClicked() {
        TextView tv_hello = (TextView) findViewById(R.id.tv_hello);
        tv_hello.setTypeface(EasyFonts.robotoThin(this));

    }}

