package com.example.root.mizorampoliticalpartymanifesto2018;

import android.content.Intent;
import android.graphics.Point;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

public class Manifestos extends AppCompatActivity {

    TextView manifestosTv,partyNameTv;
    public int TEXT_SIZE = 16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manifestos);

        //scrollView.setMinimumHeight();

        manifestosTv = findViewById(R.id.manifestos);

        partyNameTv = findViewById(R.id.partyName);

        manifestosTv.setTextSize(TEXT_SIZE);


        int[] partyName = new int[] {R.string.zpm,R.string.prism,R.string.mnf,R.string.congress};
        int[] manifestos = new int[]{1,2,3, R.string.congressManifestos};
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("partyName");
        // manifestosTv.setText(manifestos[0]);
        //textSize = (int) manifestosTv.getTextSize();

//        if(message.equals("zpm")){ ;
////            partyNameTv.setText(partyName[0]);
////            manifestosTv.setText(manifestos[0]);
//
//           /// Intent intent = new Intent(this,ManifestoContent.class);
//            //intent.putExtra("click",1);
//           // startActivity(intent);
//        }

        if(message.equals("prism")){
            partyNameTv.setText(partyName[1]);
            manifestosTv.setText(manifestos[1]);
        }

        if(message.equals("mnf")){
            partyNameTv.setText(partyName[2]);
            manifestosTv.setText(manifestos[2]);
        }

        if(message.equals("congress")){
            partyNameTv.setText(partyName[3]);
            manifestosTv.setText(manifestos[3]);
        }
    }

    public void increaseFontSize(View view) {
        //Toast.makeText(this,"incre",Toast.LENGTH_SHORT).show();
        TEXT_SIZE = TEXT_SIZE + 1;
        manifestosTv.setTextSize(TEXT_SIZE);
    }

    public void decreaseFontSize(View view) {

        TEXT_SIZE = TEXT_SIZE - 1;
        manifestosTv.setTextSize(TEXT_SIZE);
        //Toast.makeText(this,"decrease",Toast.LENGTH_SHORT).show();
    }
}
