package com.example.root.mizorampoliticalpartymanifesto2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class menu extends AppCompatActivity {

    public String message;
    public Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bundle = getIntent().getExtras();
        message = bundle.getString("partyName");

    }

    public void manifestClick(View view) {

        Intent intent = new Intent(this,Manifestos.class);
        intent.putExtra("partyName", message);
        startActivity(intent);

    }

    public void candidateClick(View view) {
        /*Toast.makeText(this,message,Toast.LENGTH_SHORT).show();*/
        Intent intent = new Intent(this,Candidate.class);
        intent.putExtra("partyName", message);
        startActivity(intent);
    }

}
