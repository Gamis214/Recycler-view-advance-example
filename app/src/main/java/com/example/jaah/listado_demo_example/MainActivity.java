package com.example.jaah.listado_demo_example;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import jp.wasabeef.recyclerview.animators.LandingAnimator;
import jp.wasabeef.recyclerview.animators.SlideInDownAnimator;
import jp.wasabeef.recyclerview.animators.SlideInLeftAnimator;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    Button btn,btn_delete,btn_delete_all,btn_addAll;
    ArrayList<String> lstNumbers = new ArrayList();
    adapter adater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.my_list);
        btn = (Button) findViewById(R.id.btn);
        btn_addAll = (Button) findViewById(R.id.btn_addAll);
        btn_delete = (Button) findViewById(R.id.btn_delete);
        btn_delete_all = (Button) findViewById(R.id.btn_delete_all);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adater.add("NEW ITEM",lstNumbers.size());
            }
        });

        btn_addAll.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lstNumbers.add("H");
                lstNumbers.add("I");
                lstNumbers.add("J");
                lstNumbers.add("K");
                lstNumbers.add("L");
                adater.addAll(lstNumbers);
            }
        });

        btn_delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                adater.remove(lstNumbers.size() - 1);
            }
        });

        btn_delete_all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                /*for(int i = lstNumbers.size() ; i > 0 ; i--)
                    adater.remove(lstNumbers.size() - 1);*/
                adater.removeAll(0,lstNumbers.size());
            }
        });

        lstNumbers.add("A");
        lstNumbers.add("B");
        lstNumbers.add("C");
        lstNumbers.add("D");
        lstNumbers.add("E");


        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adater = new adapter(lstNumbers);
        recyclerView.swapAdapter(adater,true);

        recyclerView.setItemAnimator(new LandingAnimator());

    }
}
