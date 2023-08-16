package sg.edu.rp.c346.id22022096.webbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnloadurl;
    WebView wvmypage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind the variables to respective ui elements
        btnloadurl = findViewById(R.id.btnloadurl);
        wvmypage = findViewById(R.id.wvmypage);

        //create webview client obj and set to webview
        wvmypage.setWebViewClient(new WebViewClient());

        btnloadurl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.rp.edu.sg/soi/home";
                wvmypage.loadUrl(url);
            }
        });

    }
}