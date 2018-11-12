package com.example.root.mizorampoliticalpartymanifesto2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void zpmClick(View view) {
        Intent intent = new Intent(this,menu.class);
        intent.putExtra("partyName","zpm");
        startActivity(intent);
    }

    public void prismClick(View view) {
        Intent intent = new Intent(this,menu.class);
        intent.putExtra("partyName","prism");
        startActivity(intent);
    }

    public void mnfClick(View view) {
        Intent intent = new Intent(this,menu.class);
        intent.putExtra("partyName","mnf");
        startActivity(intent);
    }

    public void congressClick(View view) {
        Intent intent = new Intent(this,menu.class);
        intent.putExtra("partyName","congress");
        startActivity(intent);
    }
}
