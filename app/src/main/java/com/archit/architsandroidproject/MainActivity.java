package com.archit.architsandroidproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView list=findViewById(R.id.recycler_view_project);

        Project[] projects={
                new Project("Getting Started App","My very first project, the default 'Hello World' App!",R.drawable.getting_started),
                new Project("Motivational Quote","Making a simple change to the layout, with my own personal motivational quote for software developers",R.drawable.quote),
                new Project("BMI Calculator","A real life working BMI Calculator teaching me variable, methods and conditional logic",R.drawable.calculator),
                new Project("Inches Convertor","A basic convertor to convert inches to meters",R.drawable.tape),
                new Project("Tasteful Tides","A menu app for a fictional restaurant learning about Activities, Intents, Classes & Objects, Arrays, Intents and ListViews",R.drawable.tasty_tides)
        };
        ProjectAdapter adapter=new ProjectAdapter(projects);
        list.setAdapter(adapter);




    }
}