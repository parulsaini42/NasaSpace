package com.example.parul.mapwithfloat;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Helpline extends AppCompatActivity {

    RecyclerView recyclerView;
    List<HelplineClass> hList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpline);

        recyclerView = findViewById(R.id.help);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        hList = new ArrayList<>();

        hList.add(new HelplineClass("Algeria", " :14", " :14"," :18",R.drawable.alg));

        hList.add(new HelplineClass("Angola", " :69", " :69", " :69",R.drawable.angola));

        hList.add(new HelplineClass("Benin"," :117", " :112"," :118",R.drawable.benin));


        hList.add(new HelplineClass("Burundi"," :117", " :112"," :118",R.drawable.bur));
        hList.add(new HelplineClass("Botswana", " :911", " :911"," :911",R.drawable.bot));

        hList.add(new HelplineClass("Cape Verde", " :132", " :130", " :131",R.drawable.cape));

        hList.add(new HelplineClass("Chad"," :17", " :2251"," :18",R.drawable.chad));


        hList.add(new HelplineClass("Comoros"," :17", " :772-03-73"," :18",R.drawable.download));

        hList.add(new HelplineClass("Egypt", " :132", " :130", " :131",R.drawable.egypt));

        hList.add(new HelplineClass("Ethopia"," :17", " :2251"," :18",R.drawable.etho));


        hList.add(new HelplineClass("Ghana"," :17", " :772-03-73"," :18",R.drawable.ghana));

        HelplineClassAdapter foodAdapter = new HelplineClassAdapter(hList, this);
        recyclerView.setAdapter(foodAdapter);

    }
}