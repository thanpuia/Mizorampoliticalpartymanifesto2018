package com.example.root.mizorampoliticalpartymanifesto2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ManifestoPage extends AppCompatActivity {

    TextView headingTV,contentTV;
    int[] page_zpm;
    int[] page_mnf;
    int[] page_prism;

    public int TEXT_SIZE = 16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zpm_manifesto_page);

        Bundle bundle = getIntent().getExtras();
        int click = bundle.getInt("click");
        String message = bundle.getString("partyName");

        page_zpm = new int[]{R.string.zpmManifestos_bung1,R.string.zpmManifestos_bung2,R.string.zpmManifestos_bung3,R.string.zpmManifestos_bung4,R.string.zpmManifestos_bung5,
                R.string.zpmManifestos_bung6,R.string.zpmManifestos_bung7,R.string.zpmManifestos_bung8,R.string.zpmManifestos_bung9};

        page_mnf = new int[] {R.string.mnf_bung1,R.string.mnf_bung2,R.string.mnf_bung3,
                R.string.mnf_bung4,R.string.mnf_bung5,R.string.mnf_bung6};

        page_prism = new int[] {R.string.prism_bung1,R.string.prism_bung2,
                R.string.prism_bung3, R.string.prism_bung4};


        //  headingTV = findViewById(R.id.heading);
        contentTV = findViewById(R.id.content);

        if(message.equals("zpm")){
            switch (click) {
                case 1:contentTV.setText(page_zpm[click-1])  ;break;
                case 2:contentTV.setText(page_zpm[click-1])  ;break;
                case 3:contentTV.setText(page_zpm[click-1])  ;break;
                case 4:contentTV.setText(page_zpm[click-1])  ;break;
                case 5:contentTV.setText(page_zpm[click-1])  ;break;
                case 6:contentTV.setText(page_zpm[click-1])  ;break;
                case 7:contentTV.setText(page_zpm[click-1])  ;break;
                case 8:contentTV.setText(page_zpm[click-1])  ;break;
                case 9:contentTV.setText(page_zpm[click-1])  ;break;

                default:break;
            }
        }

        if(message.equals("mnf")) {
            switch (click) {
                case 1:contentTV.setText(page_mnf[click-1])  ;break;
                case 2:contentTV.setText(page_mnf[click-1])  ;break;
                case 3:contentTV.setText(page_mnf[click-1])  ;break;
                case 4:contentTV.setText(page_mnf[click-1])  ;break;
                case 5:contentTV.setText(page_mnf[click-1])  ;break;
                case 6:contentTV.setText(page_mnf[click-1])  ;break;

                default:break;
            }
        }

        if(message.equals("prism")) {
            switch (click) {
                case 1:contentTV.setText(page_prism[click-1])  ;break;
                case 2:contentTV.setText(page_prism[click-1])  ;break;
                case 3:contentTV.setText(page_prism[click-1])  ;break;
                case 4:contentTV.setText(page_prism[click-1])  ;break;

                default:break;
            }
        }

    }

    public void increaseFontSize(View view) {

        TEXT_SIZE = TEXT_SIZE + 1;
        contentTV.setTextSize(TEXT_SIZE);
    }

    public void decreaseFontSize(View view) {

        TEXT_SIZE = TEXT_SIZE - 1;
        contentTV.setTextSize(TEXT_SIZE);
    }
}
