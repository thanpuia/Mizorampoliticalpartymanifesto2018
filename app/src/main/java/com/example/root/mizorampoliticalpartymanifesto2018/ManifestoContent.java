package com.example.root.mizorampoliticalpartymanifesto2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import spencerstudios.com.bungeelib.Bungee;

public class ManifestoContent extends AppCompatActivity {

    String[] zpmContent;
    String[] mnfContent;
    String[] prismContent;


    ListView listView;
    ArrayAdapter arrayAdapter;
    Bundle bundle;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zpm_manifesto_content);

        bundle = getIntent().getExtras();
        message = bundle.getString("partyName");

        listView = findViewById(R.id.listView);

       /* zpmContent = new String[] {String.valueOf(R.string.zpm_content1), String.valueOf(R.string.zpm_content2),R.string.zpm_content3,
                R.string.zpm_content4,R.string.zpm_content5, String.valueOf(R.string.zpm_content6),
                R.string.zpm_content7,R.string.zpm_content8,R.string.zpm_content9};
*/
        zpmContent= new String[]{"I. Inawpna lama hmalakna","II. Politiks lam","III. Ram hmasawnna ruangam lian","IV. Vantlang nun siamthatna lam",
                "V. Thil tharchhuah leh siamchhuaha intodelhna","VI. Hnathawh dan thar","VII. Inawpna lam siamthat",
                "VIII. Thalaite pual","IX. Khuanu thilpek humhalh"};

        mnfContent = new String[]{"I. POLITICAL","II. ADMINISTRATION",
                "III. ECONOMIC DEVELOPMENT PROGRAMMES", "IV. INFRASTRUTURE DEVELOPMENT",
                "V. SOCIAL DEVELOPMENT AND SOCIAL SECURITY","VI. EDUCATION and YOUTH AFFAIRS"};

        prismContent = new String[]{"I. PRISM ADMINISTRATION POLICY","II. PRISM LAND REFORM POLICY",
                "III. PRISM FINANCIAL POLICY","IV. PRISM MLA ELECTION MANIFESTO, 2018(English Version)"};

        switch (message){
            case "zpm":
                arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,zpmContent);
                listView.setAdapter(arrayAdapter); break;

            case "mnf":
                arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,mnfContent);
                listView.setAdapter(arrayAdapter); break;

            case "prism":
                arrayAdapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,prismContent);
                listView.setAdapter(arrayAdapter); break;



        }


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                int realPosition = position+1;
                startActivity(new Intent(view.getContext(),ManifestoPage.class).putExtra("click",realPosition).putExtra("partyName",message));
                Bungee.zoom(view.getContext());

            }
        });
    }
}

   /* public void oneClick(View view) {
        startActivity(new Intent(this,ManifestoPage.class).putExtra("click",1));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ManifestoPage.class);
//        intent.putExtra("click",1);
//        startActivity(intent);
    }
    public void twoClick(View view) {
        startActivity(new Intent(this,ManifestoPage.class).putExtra("click",2));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ManifestoPage.class);
//        intent.putExtra("click",2);
//        startActivity(intent);
    }
    public void threeClick(View view) {
        startActivity(new Intent(this,ManifestoPage.class).putExtra("click",3));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ManifestoPage.class);
//        intent.putExtra("click",3);
//        startActivity(intent);
    }
    public void fourClick(View view) {
        startActivity(new Intent(this,ManifestoPage.class).putExtra("click",4));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ManifestoPage.class);
//        intent.putExtra("click",4);
//        startActivity(intent);
    }
    public void fiveClick(View view) {
        startActivity(new Intent(this,ManifestoPage.class).putExtra("click",5));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ManifestoPage.class);
//        intent.putExtra("click",5);
//        startActivity(intent);
    }
    public void sixClick(View view) {
        startActivity(new Intent(this,ManifestoPage.class).putExtra("click",6));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ManifestoPage.class);
//        intent.putExtra("click",6);
//        startActivity(intent);
    }
    public void sevenClick(View view) {
        startActivity(new Intent(this,ManifestoPage.class).putExtra("click",7));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ManifestoPage.class);
//        intent.putExtra("click",7);
//        startActivity(intent);
    }
    public void eightClick(View view) {
        startActivity(new Intent(this,ManifestoPage.class).putExtra("click",8));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ManifestoPage.class);
//        intent.putExtra("click",8);
//        startActivity(intent);
    }
    public void nineClick(View view) {
        startActivity(new Intent(this,ManifestoPage.class).putExtra("click",9));
        Bungee.zoom(this);
//        Intent intent = new Intent(this,ManifestoPage.class);
//        intent.putExtra("click",9);
//        startActivity(intent);
    }*/