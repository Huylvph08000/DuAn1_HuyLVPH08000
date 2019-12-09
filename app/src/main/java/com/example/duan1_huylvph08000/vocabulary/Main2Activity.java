package com.example.duan1_huylvph08000.vocabulary;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.duan1_huylvph08000.R;


import java.util.ArrayList;

public class Main2Activity extends AppCompatActivity {
    private static final String TAG = "Main2Activity";
    private Context mcontext;
    ArrayList<String> titleArrayList;
    private RecyclerView mrecyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mcontext = Main2Activity.this;
        titleArrayList = new ArrayList<String>();
        titleArrayList.add(Constants.EDUCATION_VOCABULARY);
        titleArrayList.add(Constants.CRIME);
        titleArrayList.add(Constants.SCIENCE);
        titleArrayList.add(Constants.DIET);
        titleArrayList.add(Constants.ENVIRONMENT);
        titleArrayList.add(Constants.CHILDREN_AND_THE_FAMILY);
        titleArrayList.add(Constants.INFORMATION_TECHNOLOGY);
        titleArrayList.add(Constants.THE_ARTS);
        titleArrayList.add(Constants.WORK);




        mrecyclerView = findViewById(R.id.title_layout_recycleview);
        mrecyclerView.setHasFixedSize(true);
        mrecyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        TitleAdapter adapter = new TitleAdapter(mcontext, titleArrayList, new CustomItemClickListener() {
            @Override
            public void onItemClick(View v, int position) {
                Intent desIntent = new Intent(mcontext, Description1Activity.class);
                desIntent.putExtra("titles", titleArrayList.get(position));
                startActivity(desIntent);
            }
        });
        mrecyclerView.setAdapter(adapter);
    }
}
