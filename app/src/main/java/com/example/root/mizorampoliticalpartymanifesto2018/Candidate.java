package com.example.root.mizorampoliticalpartymanifesto2018;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class Candidate extends AppCompatActivity {

    public Bundle bundle;
    public String message;

    ListView listView;
    int[] candidateImg;
    public int[] code;

    int[] zpmCandidate;
    int[] mnfCandidate;
    int[] prismCandidate;
    int[] congressCandidate;
    int[] ncpCandidate;

    int[] zpmCandidate_bial;
    int[] mnfCandidate_bial;
    int[] prismCandidate_bial;
    int[] congressCandidate_bial;
    int[] ncpCandidate_bial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate);

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

        code = new int[2];

        listView = findViewById(R.id.candidateListView);

        candidateImg = new int[]{R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};

        zpmCandidate = new int[]{R.string.zpmCandidate1,R.string.zpmCandidate2,R.string.zpmCandidate3,R.string.zpmCandidate4,R.string.zpmCandidate5,
                R.string.zpmCandidate6,R.string.zpmCandidate7,R.string.zpmCandidate8,R.string.zpmCandidate9,R.string.zpmCandidate10,
                R.string.zpmCandidate11,R.string.zpmCandidate12,R.string.zpmCandidate13,R.string.zpmCandidate14,R.string.zpmCandidate15,
                R.string.zpmCandidate16,R.string.zpmCandidate17,R.string.zpmCandidate18,R.string.zpmCandidate19,R.string.zpmCandidate20,
                R.string.zpmCandidate21,R.string.zpmCandidate22,R.string.zpmCandidate23,R.string.zpmCandidate24,R.string.zpmCandidate25,
                R.string.zpmCandidate26,R.string.zpmCandidate27,R.string.zpmCandidate28,R.string.zpmCandidate29,R.string.zpmCandidate30,
                R.string.zpmCandidate31,R.string.zpmCandidate32,R.string.zpmCandidate33,R.string.zpmCandidate34,R.string.zpmCandidate35,
                R.string.zpmCandidate36,R.string.zpmCandidate37,R.string.zpmCandidate38};

        prismCandidate = new int[]{R.string.prismCandidate1,R.string.prismCandidate2,R.string.prismCandidate3,R.string.prismCandidate4,
                R.string.prismCandidate5,R.string.prismCandidate6, R.string.prismCandidate7,R.string.prismCandidate8,
                R.string.prismCandidate9,R.string.prismCandidate10,R.string.prismCandidate11,R.string.prismCandidate12,
                R.string.prismCandidate13};

        mnfCandidate = new int[]{R.string.mnfCandidate1,R.string.mnfCandidate2,R.string.mnfCandidate3,R.string.mnfCandidate4,R.string.mnfCandidate5,
                R.string.mnfCandidate6,R.string.mnfCandidate7,R.string.mnfCandidate8,R.string.mnfCandidate9,R.string.mnfCandidate10,
                R.string.mnfCandidate11,R.string.mnfCandidate12,R.string.mnfCandidate13,R.string.mnfCandidate14,R.string.mnfCandidate15,
                R.string.mnfCandidate16,R.string.mnfCandidate17,R.string.mnfCandidate18,R.string.mnfCandidate19,R.string.mnfCandidate20,
                R.string.mnfCandidate21,R.string.mnfCandidate22,R.string.mnfCandidate23,R.string.mnfCandidate24,R.string.mnfCandidate25,
                R.string.mnfCandidate26,R.string.mnfCandidate27,R.string.mnfCandidate28,R.string.mnfCandidate29,R.string.mnfCandidate30,
                R.string.mnfCandidate31,R.string.mnfCandidate32,R.string.mnfCandidate33,R.string.mnfCandidate34,R.string.mnfCandidate35,
                R.string.mnfCandidate36,R.string.mnfCandidate37,R.string.mnfCandidate38,R.string.mnfCandidate39,R.string.mnfCandidate40};

        congressCandidate = new int[]{R.string.congressCandidate1,R.string.congressCandidate2,R.string.congressCandidate3,R.string.congressCandidate4,R.string.congressCandidate5,
                R.string.congressCandidate6,R.string.congressCandidate7,R.string.congressCandidate8,R.string.congressCandidate9,R.string.congressCandidate10,
                R.string.congressCandidate11,R.string.congressCandidate12,R.string.congressCandidate13,R.string.congressCandidate14,R.string.congressCandidate15,
                R.string.congressCandidate16,R.string.congressCandidate17,R.string.congressCandidate18,R.string.congressCandidate19,R.string.congressCandidate20,
                R.string.congressCandidate21,R.string.congressCandidate22,R.string.congressCandidate23,R.string.congressCandidate24,R.string.congressCandidate25,
                R.string.congressCandidate26,R.string.congressCandidate27,R.string.congressCandidate28,R.string.congressCandidate29,R.string.congressCandidate30,
                R.string.congressCandidate31,R.string.congressCandidate32,R.string.congressCandidate33,R.string.congressCandidate34,R.string.congressCandidate35,
                R.string.congressCandidate36,R.string.congressCandidate37,R.string.congressCandidate38,R.string.congressCandidate39,R.string.congressCandidate40};

        ncpCandidate = new int[]{R.string.ncpCandidate1,R.string.ncpCandidate2,R.string.ncpCandidate3,R.string.ncpCandidate4,R.string.ncpCandidate5,
                R.string.ncpCandidate6,R.string.ncpCandidate7};

        prismCandidate_bial = new int[]{R.string.prismCandidate1_bial,R.string.prismCandidate2_bial,R.string.prismCandidate3_bial,R.string.prismCandidate4_bial,
                R.string.prismCandidate5_bial,R.string.prismCandidate6_bial, R.string.prismCandidate7_bial,R.string.prismCandidate8_bial,
                R.string.prismCandidate9_bial,R.string.prismCandidate10_bial,R.string.prismCandidate11_bial,R.string.prismCandidate12_bial,
                R.string.prismCandidate13_bial};

        mnfCandidate_bial = new int[]{R.string.mnfCandidate1_bial,R.string.mnfCandidate2_bial,R.string.mnfCandidate3_bial,R.string.mnfCandidate4_bial,R.string.mnfCandidate5_bial,
                R.string.mnfCandidate6_bial,R.string.mnfCandidate7_bial,R.string.mnfCandidate8_bial,R.string.mnfCandidate9_bial,R.string.mnfCandidate10_bial,
                R.string.mnfCandidate11_bial,R.string.mnfCandidate12_bial,R.string.mnfCandidate13_bial,R.string.mnfCandidate14_bial,R.string.mnfCandidate15_bial,
                R.string.mnfCandidate16_bial,R.string.mnfCandidate17_bial,R.string.mnfCandidate18_bial,R.string.mnfCandidate19_bial,R.string.mnfCandidate20_bial,
                R.string.mnfCandidate21_bial,R.string.mnfCandidate22_bial,R.string.mnfCandidate23_bial,R.string.mnfCandidate24_bial,R.string.mnfCandidate25_bial,
                R.string.mnfCandidate26_bial,R.string.mnfCandidate27_bial,R.string.mnfCandidate28_bial,R.string.mnfCandidate29_bial,R.string.mnfCandidate30_bial,
                R.string.mnfCandidate31_bial,R.string.mnfCandidate32_bial,R.string.mnfCandidate33_bial,R.string.mnfCandidate34_bial,R.string.mnfCandidate35_bial,
                R.string.mnfCandidate36_bial,R.string.mnfCandidate37_bial,R.string.mnfCandidate38_bial,R.string.mnfCandidate39_bial,R.string.mnfCandidate40_bial};

        congressCandidate_bial = new int[]{R.string.congressCandidate1_bial,R.string.congressCandidate2_bial,R.string.congressCandidate3_bial,R.string.congressCandidate4_bial,R.string.congressCandidate5_bial,
                R.string.congressCandidate6_bial,R.string.congressCandidate7_bial,R.string.congressCandidate8_bial,R.string.congressCandidate9_bial,R.string.congressCandidate10_bial,
                R.string.congressCandidate11_bial,R.string.congressCandidate12_bial,R.string.congressCandidate13_bial,R.string.congressCandidate14_bial,R.string.congressCandidate15_bial,
                R.string.congressCandidate16_bial,R.string.congressCandidate17_bial,R.string.congressCandidate18_bial,R.string.congressCandidate19_bial,R.string.congressCandidate20_bial,
                R.string.congressCandidate21_bial,R.string.congressCandidate22_bial,R.string.congressCandidate23_bial,R.string.congressCandidate24_bial,R.string.congressCandidate25_bial,
                R.string.congressCandidate26_bial,R.string.congressCandidate27_bial,R.string.congressCandidate28_bial,R.string.congressCandidate29_bial,R.string.congressCandidate30_bial,
                R.string.congressCandidate31_bial,R.string.congressCandidate32_bial,R.string.congressCandidate33_bial,R.string.congressCandidate34_bial,R.string.congressCandidate35_bial,
                R.string.congressCandidate36_bial,R.string.congressCandidate37_bial,R.string.congressCandidate38_bial,R.string.congressCandidate39_bial,R.string.congressCandidate40_bial};

        zpmCandidate_bial = new int[]{R.string.zpmCandidate1_bial,R.string.zpmCandidate2_bial,R.string.zpmCandidate3_bial,R.string.zpmCandidate4_bial,R.string.zpmCandidate5_bial,
                R.string.zpmCandidate6_bial,R.string.zpmCandidate7_bial,R.string.zpmCandidate8_bial,R.string.zpmCandidate9_bial,R.string.zpmCandidate10_bial,
                R.string.zpmCandidate11_bial,R.string.zpmCandidate12_bial,R.string.zpmCandidate13_bial,R.string.zpmCandidate14_bial,R.string.zpmCandidate15_bial,
                R.string.zpmCandidate16_bial,R.string.zpmCandidate17_bial,R.string.zpmCandidate18_bial,R.string.zpmCandidate19_bial,R.string.zpmCandidate20_bial,
                R.string.zpmCandidate21_bial,R.string.zpmCandidate22_bial,R.string.zpmCandidate23_bial,R.string.zpmCandidate24_bial,R.string.zpmCandidate25_bial,
                R.string.zpmCandidate26_bial,R.string.zpmCandidate27_bial,R.string.zpmCandidate28_bial,R.string.zpmCandidate29_bial,R.string.zpmCandidate30_bial,
                R.string.zpmCandidate31_bial,R.string.zpmCandidate32_bial,R.string.zpmCandidate33_bial,R.string.zpmCandidate34_bial,R.string.zpmCandidate35_bial,
                R.string.zpmCandidate36_bial,R.string.zpmCandidate37_bial,R.string.zpmCandidate38_bial};

        ncpCandidate_bial = new int[]{R.string.ncpCandidate1_bial,R.string.ncpCandidate2_bial,R.string.ncpCandidate3_bial,R.string.ncpCandidate4_bial,R.string.ncpCandidate5_bial,
                R.string.ncpCandidate6_bial,R.string.ncpCandidate7_bial};



        CustomAdapter adapter = new CustomAdapter();
        listView.setAdapter(adapter);

    }

    class CustomAdapter extends android.widget.BaseAdapter {
        @Override
        public int getCount() {

            if(message.equals("zpm"))
                return zpmCandidate.length;
            if(message.equals("prism"))
                return prismCandidate.length;
            if(message.equals("mnf"))
                return mnfCandidate.length;
            if(message.equals("congress"))
                return congressCandidate.length;

            return 0;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            convertView = getLayoutInflater().inflate(R.layout.candidatedetails, null);

            //  ImageView imageView = findViewById(R.id.candidateImageView);
            // imageView.setVisibility(View.GONE );
            // TextView candidateName = findViewById(R.id.candidateName);
            // TextView candidateBial = findViewById(R.id.candidateBial);
            android.widget.TextView candidateName= (android.widget.TextView)convertView.findViewById(R.id.candidateName);
            android.widget.TextView candidateBial= (android.widget.TextView)convertView.findViewById(R.id.candidateBial);

            if(message.equals("zpm")){

//                Intent intent = new Intent(getApplicationContext(),ManifestoContent.class);
//                startActivity(intent);
                candidateName.setText(zpmCandidate[position]);
                candidateBial.setText(zpmCandidate_bial[position]);
            }
            if(message.equals("prism")){

                candidateName.setText(prismCandidate[position]);
                candidateBial.setText(prismCandidate_bial[position]);
            }
            if(message.equals("mnf")){

                candidateName.setText(mnfCandidate[position]);
                candidateBial.setText(mnfCandidate_bial[position]);
            }
            if(message.equals("congress")){

                candidateName.setText(congressCandidate[position]);
                candidateBial.setText(congressCandidate_bial[position]);
            }

//            candidateName.setText(code[position]);
            return convertView;
        }
    }
}
