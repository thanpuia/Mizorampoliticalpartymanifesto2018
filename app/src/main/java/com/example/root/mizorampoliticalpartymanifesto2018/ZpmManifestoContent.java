package com.example.root.mizorampoliticalpartymanifesto2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import spencerstudios.com.bungeelib.Bungee;

public class ZpmManifestoContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zpm_manifesto_content);
    }

    public void oneClick(View view) {
        startActivity(new Intent(this,ZpmManifestoPage.class).putExtra("click",1));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ZpmManifestoPage.class);
//        intent.putExtra("click",1);
//        startActivity(intent);
    }
    public void twoClick(View view) {
        startActivity(new Intent(this,ZpmManifestoPage.class).putExtra("click",2));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ZpmManifestoPage.class);
//        intent.putExtra("click",2);
//        startActivity(intent);
    }
    public void threeClick(View view) {
        startActivity(new Intent(this,ZpmManifestoPage.class).putExtra("click",3));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ZpmManifestoPage.class);
//        intent.putExtra("click",3);
//        startActivity(intent);
    }
    public void fourClick(View view) {
        startActivity(new Intent(this,ZpmManifestoPage.class).putExtra("click",4));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ZpmManifestoPage.class);
//        intent.putExtra("click",4);
//        startActivity(intent);
    }
    public void fiveClick(View view) {
        startActivity(new Intent(this,ZpmManifestoPage.class).putExtra("click",5));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ZpmManifestoPage.class);
//        intent.putExtra("click",5);
//        startActivity(intent);
    }
    public void sixClick(View view) {
        startActivity(new Intent(this,ZpmManifestoPage.class).putExtra("click",6));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ZpmManifestoPage.class);
//        intent.putExtra("click",6);
//        startActivity(intent);
    }
    public void sevenClick(View view) {
        startActivity(new Intent(this,ZpmManifestoPage.class).putExtra("click",7));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ZpmManifestoPage.class);
//        intent.putExtra("click",7);
//        startActivity(intent);
    }
    public void eightClick(View view) {
        startActivity(new Intent(this,ZpmManifestoPage.class).putExtra("click",8));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ZpmManifestoPage.class);
//        intent.putExtra("click",8);
//        startActivity(intent);
    }
    public void nineClick(View view) {
        startActivity(new Intent(this,ZpmManifestoPage.class).putExtra("click",9));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ZpmManifestoPage.class);
//        intent.putExtra("click",9);
//        startActivity(intent);
    }


}
