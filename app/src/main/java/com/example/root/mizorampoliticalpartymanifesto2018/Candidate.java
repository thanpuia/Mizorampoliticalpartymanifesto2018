package com.example.root.mizorampoliticalpartymanifesto2018;

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


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_candidate);

        bundle = getIntent().getExtras();
        message = bundle.getString("partyName");

        code = new int[2];

        listView = findViewById(R.id.candidateListView);

        candidateImg = new int[]{R.mipmap.ic_launcher,R.mipmap.ic_launcher,R.mipmap.ic_launcher};

        zpmCandidate = new int[]{R.string.zpmCandidate1,R.string.zpmCandidate2,R.string.zpmCandidate3};
        prismCandidate = new int[]{R.string.prismCandidate1,R.string.prismCandidate2,R.string.prismCandidate3};
        mnfCandidate = new int[]{R.string.mnfCandidate1,R.string.mnfCandidate2,R.string.mnfCandidate3};
        congressCandidate = new int[]{R.string.congressCandidate1,R.string.congressCandidate2,R.string.congressCandidate3};

        CustomAdapter adapter = new CustomAdapter();
        listView.setAdapter(adapter);

    }

    class CustomAdapter extends android.widget.BaseAdapter {
        @Override
        public int getCount() {
            return candidateImg.length;

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

            ImageView imageView = findViewById(R.id.candidateImageView);
         //   TextView candidateName = findViewById(R.id.candidateName);
            TextView candidateBial = findViewById(R.id.candidateBial);
            TextView candidateNetWorth = findViewById(R.id.candidateNetWorth);
            android.widget.TextView candidateName= (android.widget.TextView)convertView.findViewById(R.id.candidateName);
//            android.widget.TextView textView2= (android.widget.TextView)convertView.findViewById(R.id.textview2_listview);

            if(message.equals("zpm")){

                candidateName.setText(zpmCandidate[position]);
            }
            if(message.equals("prism")){

                candidateName.setText(prismCandidate[position]);
            }
            if(message.equals("mnf")){

                candidateName.setText(mnfCandidate[position]);
            }
            if(message.equals("congress")){

                candidateName.setText(congressCandidate[position]);
            }

//            candidateName.setText(code[position]);
            return convertView;
        }
    }
}
