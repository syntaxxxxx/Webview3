package imastudio.co.id.webview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BrowserWebActivity extends AppCompatActivity {

    @BindView(R.id.edturl)
    EditText edturl;
    @BindView(R.id.btnCari)
    Button btnCari;
    @BindView(R.id.webBrowser)
    WebView webBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browser_web);
        ButterKnife.bind(this);
        webBrowser.setWebViewClient(new WebViewClient());
        webBrowser.getSettings().setJavaScriptEnabled(true);

        //editor
        edturl.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                String url = edturl.getText().toString();
                webBrowser.loadUrl("http://"+ url +".com");
                return false;
            }
        });
    }

    @OnClick(R.id.btnCari)
    public void onViewClicked() {
        edturl.requestFocus();
        String url = edturl.getText().toString();

        webBrowser.loadUrl("http://" + url + ".com");
    }
}
