package com.example.fe_no1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ListView listView = (ListView)findViewById(R.id.list_view);

        List<String> listInput = new ArrayList<>();
        listInput.add("Item1");
        listInput.add("Item2");
        listInput.add("Item3");
        listInput.add("Item4");


        ArrayAdapter<String> arrayAdapter
                = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1 , listInput);

        listView.setAdapter(arrayAdapter);
    }
}
