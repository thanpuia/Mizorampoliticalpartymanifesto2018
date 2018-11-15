package com.example.root.mizorampoliticalpartymanifesto2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //008577
    //START THE MENU WITH "zpm" EXTRA
    public void zpmClick(View view) {
        startActivity(new Intent(this,menu.class).putExtra("partyName","zpm"));
        Bungee.zoom(this);
        //   Intent intent = new Intent(this,menu.class);
        //  intent.putExtra("partyName","zpm");
        //  startActivity(intent);
    }

    //START THE MENU WITH "prism" EXTRA
    public void prismClick(View view) {
        startActivity(new Intent(this,menu.class).putExtra("partyName","prism"));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,menu.class);int
//        intent.putExtra("partyName","prism");
        //startActivity(intent);
    }

    //START THE MENU WITH "mnf" EXTRA
    public void mnfClick(View view) {
        startActivity(new Intent(this,menu.class).putExtra("partyName","mnf"));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,menu.class);
//        intent.putExtra("partyName","mnf");
//        startActivity(intent);
    }
    //START THE MENU WITH "congress" EXTRA
    public void congressClick(View view) {
        startActivity(new Intent(this,menu.class).putExtra("partyName","congress"));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,menu.class);
//        intent.putExtra("partyName","congress");
//        startActivity(intent);
    }
}
