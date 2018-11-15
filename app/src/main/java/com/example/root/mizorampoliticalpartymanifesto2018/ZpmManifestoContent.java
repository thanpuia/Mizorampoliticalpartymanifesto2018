package com.example.root.mizorampoliticalpartymanifesto2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ZpmManifestoContent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zpm_manifesto_content);
    }

    public void oneClick(View view) {
        Intent intent = new Intent(this,ZpmManifestoPage.class);
        intent.putExtra("click",1);
        startActivity(intent);
    }
    public void twoClick(View view) {
        Intent intent = new Intent(this,ZpmManifestoPage.class);
        intent.putExtra("click",2);
        startActivity(intent);
    }
    public void threeClick(View view) {
        Intent intent = new Intent(this,ZpmManifestoPage.class);
        intent.putExtra("click",3);
        startActivity(intent);
    }
    public void fourClick(View view) {
        Intent intent = new Intent(this,ZpmManifestoPage.class);
        intent.putExtra("click",4);
        startActivity(intent);
    }
    public void fiveClick(View view) {
        Intent intent = new Intent(this,ZpmManifestoPage.class);
        intent.putExtra("click",5);
        startActivity(intent);
    }
    public void sixClick(View view) {
        Intent intent = new Intent(this,ZpmManifestoPage.class);
        intent.putExtra("click",6);
        startActivity(intent);
    }
    public void sevenClick(View view) {
        Intent intent = new Intent(this,ZpmManifestoPage.class);
        intent.putExtra("click",7);
        startActivity(intent);
    }
    public void eightClick(View view) {
        Intent intent = new Intent(this,ZpmManifestoPage.class);
        intent.putExtra("click",8);
        startActivity(intent);
    }
    public void nineClick(View view) {
        Intent intent = new Intent(this,ZpmManifestoPage.class);
        intent.putExtra("click",9);
        startActivity(intent);
    }


}
