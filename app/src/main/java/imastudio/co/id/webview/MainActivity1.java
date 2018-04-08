package imastudio.co.id.webview;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;


public class MainActivity1 extends AppCompatActivity {

    @BindView(R.id.ytb)
    Button ytb;
    @BindView(R.id.fb)
    Button fb;
    @BindView(R.id.blg)
    Button blg;
    @BindView(R.id.btnEksternal)
    Button btnEksternal;
    @BindView(R.id.webBrowser)
    Button webBrowser;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        ButterKnife.bind(this);

    }


    @OnClick(R.id.ytb)
    public void onYtbClicked() {
        startActivity(new Intent(MainActivity1.this, YoutubeActivity.class));
    }

    @OnClick(R.id.fb)
    public void onFbClicked() {

        startActivity(new Intent(MainActivity1.this, FacebookActivity.class));
    }

    @OnClick(R.id.blg)
    public void onBlgClicked() {

        startActivity(new Intent(MainActivity1.this, BlogActivity.class));
    }

    @OnClick(R.id.btnEksternal)
    public void onbtnEksternal() {

        startActivity(new Intent(MainActivity1.this, WebEksternalActivity.class));

    }

    @OnClick(R.id.webBrowser)
    public void onViewClicked() {

        startActivity(new Intent(MainActivity1.this, BrowserWebActivity.class));
    }

    public void spinner1(View view) {

        startActivity(new Intent(MainActivity1.this, SpinnerActivity.class));
    }
}
