package com.example.root.mizorampoliticalpartymanifesto2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class ZpmManifestoPage extends AppCompatActivity {

    TextView headingTV,contentTV
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zpm_manifesto_page);

        Bundle bundle = getIntent().getExtras();
        int click = bundle.getInt("click");

        headingTV = findViewById(R.id.heading);
        contentTV = findViewById(R.id.content);

        switch (click) {
            case 1:headingTV.setText(); ;break;
            case 2: ;break;
            case 3: ;break;
            case 4: ;break;
            case 5: ;break;
            case 6: ;break;
            case 7: ;break;
            case 8: ;break;
            case 9: ;break;


            default:break;
        }

    }
}
