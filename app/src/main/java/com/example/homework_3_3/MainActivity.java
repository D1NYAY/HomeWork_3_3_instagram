package com.example.homework_3_3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView postRecyclerView;
private RecyclerView recyclerView;
private ArrayList<String> postList = new ArrayList<>();
private ArrayList<String> peopleList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
    peopleList.add("Liam");
    peopleList.add("Lucas");
    peopleList.add("Olivia");
    peopleList.add("Mark");
    peopleList.add("Elon");
    peopleList.add("Sofia");
    peopleList.add("Max");
    peopleList.add("Omurbek");
    peopleList.add("Jane");
    peopleList.add("Henry");
    peopleList.add("Emma");
    peopleList.add("Mia");
    peopleList.add("Harper");
    peopleList.add("Elizabeth");
    peopleList.add("JemmieJemmie");
    peopleList.add("AchaAcha");
        PeopleAdapter adapter = new PeopleAdapter(peopleList);
        recyclerView.setAdapter(adapter);

postRecyclerView =findViewById(R.id.postRecycler);
postList.add("News#1");
postList.add("News#2");
postList.add("News#3");
postList.add("News#4");
postList.add("News#5");
postList.add("News#6");
postList.add("News#7");
postList.add("News#8");
postList.add("News#9");
postList.add("News#10");
postList.add("News#11");
postList.add("News#12");
postList.add("News#13");
postList.add("News#14");







    }

}