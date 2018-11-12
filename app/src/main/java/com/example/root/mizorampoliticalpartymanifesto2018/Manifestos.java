package com.example.root.mizorampoliticalpartymanifesto2018;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Manifestos extends AppCompatActivity {

    TextView manifestosTv,partyNameTv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manifestos);

        manifestosTv = findViewById(R.id.manifestos);
        partyNameTv = findViewById(R.id.partyName);

        int[] partyName = new int[] {R.string.zpm,R.string.prism,R.string.mnf,R.string.congress};
        int[] manifestos = new int[]{R.string.zpmManifestos, R.string.prismManifestos,R.string.mnfManifestos, R.string.congressManifestos};
        Bundle bundle = getIntent().getExtras();
        String message = bundle.getString("partyName");
       // manifestosTv.setText(manifestos[0]);

        if(message.equals("zpm")){ ;
            partyNameTv.setText(partyName[0]);
            manifestosTv.setText(manifestos[0]);
        }

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
}
