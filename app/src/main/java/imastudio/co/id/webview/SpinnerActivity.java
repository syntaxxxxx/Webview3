package imastudio.co.id.webview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SpinnerActivity extends AppCompatActivity {

    @BindView(R.id.idSpinner)
    Spinner idSpinner;
    @BindView(R.id.imgSpinner)
    ImageView imgSpinner;
    @BindView(R.id.tvSpinner)
    TextView tvSpinner;
    //array
    String nama [] = {"abi", "manyu", "nugroho"};
    String status [] = {"sma", "kuliah", "kerja"};
    int gambar [] = {R.drawable.ic_launcher_foreground,
                    R.drawable.ic_launcher_foreground,
                    R.drawable.ic_launcher_foreground};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        ButterKnife.bind(this);
        //adapter= kalo kita mau memunculkan data ke layout
        ArrayAdapter adapter = new ArrayAdapter(SpinnerActivity.this, android.R.layout.simple_spinner_item, nama);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        idSpinner.setAdapter(adapter);
        idSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                tvSpinner.setText(status[i]);
                imgSpinner.setImageResource(gambar[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
