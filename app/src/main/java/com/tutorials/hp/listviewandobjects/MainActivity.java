package com.tutorials.hp.listviewandobjects;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<String> people=new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //LISTVIEW
        ListView lv= (ListView) findViewById(R.id.lv);

        //FILL LIST
        fillPeople();

        //ADAPTER
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,people);
        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Toast.makeText(MainActivity.this, people.get(i), Toast.LENGTH_SHORT).show();

            }
        });
    }

    private void fillPeople()
    {
        people.clear();
        Person p=new Person();
        p.setName("Mike");
        people.add(p.getName());

        p=new Person();
        p.setName("John");
        people.add(p.getName());

        p=new Person();
        p.setName("Lucy");
        people.add(p.getName());

        p=new Person();
        p.setName("Rebecca");
        people.add(p.getName());

        p=new Person();
        p.setName("Kris");
        people.add(p.getName());

        p=new Person();
        p.setName("Kurt");
        people.add(p.getName());

        p=new Person();
        p.setName("Vin");
        people.add(p.getName());
    }
}
