package com.example.root.mizorampoliticalpartymanifesto2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ZpmManifestoPage extends AppCompatActivity {

    TextView headingTV,contentTV;
    int[] chapters;
    public int TEXT_SIZE = 16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zpm_manifesto_page);

        Bundle bundle = getIntent().getExtras();
        int click = bundle.getInt("click");

        chapters = new int[]{R.string.zpmManifestos_bung1,R.string.zpmManifestos_bung2,R.string.zpmManifestos_bung3,R.string.zpmManifestos_bung4,R.string.zpmManifestos_bung5,
                R.string.zpmManifestos_bung6,R.string.zpmManifestos_bung7,R.string.zpmManifestos_bung8,R.string.zpmManifestos_bung9};

      //  headingTV = findViewById(R.id.heading);
        contentTV = findViewById(R.id.content);

        switch (click) {
            case 1:contentTV.setText(chapters[click])  ;break;
            case 2:contentTV.setText(chapters[click])  ;break;
            case 3:contentTV.setText(chapters[click])  ;break;
            case 4:contentTV.setText(chapters[click])  ;break;
            case 5:contentTV.setText(chapters[click])  ;break;
            case 6:contentTV.setText(chapters[click])  ;break;
            case 7:contentTV.setText(chapters[click])  ;break;
            case 8:contentTV.setText(chapters[click])  ;break;
            case 9:contentTV.setText(chapters[click])  ;break;

            default:break;
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
