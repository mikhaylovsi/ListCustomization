package com.marrog.listcustomization;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = (ListView)findViewById(R.id.list_view);

        String[] labels = {"Android", "iOS", "Windsows Phone"};

        MyArrayAdapter arrayAdapter = new MyArrayAdapter(this, R.layout.list_activity,  labels);

        listView.setAdapter(arrayAdapter);

    }
}
