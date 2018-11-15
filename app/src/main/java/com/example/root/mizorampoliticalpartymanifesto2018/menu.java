package com.example.root.mizorampoliticalpartymanifesto2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class menu extends AppCompatActivity {

    public String message;
    public Bundle bundle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        bundle = getIntent().getExtras();
        message = bundle.getString("partyName");

        if(message.equals("zpm"))
            getSupportActionBar().setTitle("ZPM");

        if(message.equals("prism"))
            getSupportActionBar().setTitle("PRISM");

        if(message.equals("congress"))
            getSupportActionBar().setTitle("Congress");

        if(message.equals("mnf"))
            getSupportActionBar().setTitle("MNF");

    }


    public void manifestClick(View view) {



        if(message.equals("zpm")) {

            startActivity(new Intent(this,ManifestoContent.class).putExtra("partyName",message));
            Bungee.zoom(this);
//
//            Intent intent2 = new Intent(this,ManifestoContent.class);
//         //   intent2.putExtra("partyName", message);
//            startActivity(intent2);
        }else if (message.equals("mnf")) {
            startActivity(new Intent(this,ManifestoContent.class).putExtra("partyName",message));
            Bungee.zoom(this);

        }else if (message.equals("prism")){
            startActivity(new Intent(this,ManifestoContent.class).putExtra("partyName",message));
            Bungee.zoom(this);
        }

        else {

            startActivity(new Intent(this,Manifestos.class).putExtra("partyName",message));
            Bungee.zoom(this);
//            Intent intent = new Intent(this,Manifestos.class);
//            intent.putExtra("partyName", message);
//            startActivity(intent);

        }

    }

    public void candidateClick(View view) {
        /*Toast.makeText(this,message,Toast.LENGTH_SHORT).show();*/
//
        startActivity(new Intent(this,Candidate.class).putExtra("partyName",message));
        Bungee.zoom(this);

//        Intent intent = new Intent(this,Candidate.class);
//        intent.putExtra("partyName", message);
//        startActivity(intent);
    }

}
