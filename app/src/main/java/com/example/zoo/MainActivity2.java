package com.example.zoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {


    private ListView listView;
    private ArrayList<String> info = new ArrayList<>();
    private ArrayList<String> country = new ArrayList<>();
    private ArrayList<Integer> flags = new ArrayList<>();
    private ArrayAdapter<String> sdk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.listView);
        country.add("Italy");
        country.add("Iran");
        country.add("Switzerland");
        country.add("France");
        country.add("Yemen");
        country.add("Israel");
        country.add("Brazil");
        country.add("china");
        country.add("chile");
        country.add("Argentina");
        country.add("Russia");
        country.add("United Kingdom");
        country.add("Libya");
        country.add("Estonia");
        country.add("japan");
        flags.add(R.drawable.italy);
        flags.add(R.drawable.iran);
        flags.add(R.drawable.swiss);
        flags.add(R.drawable.france);
        flags.add(R.drawable.yemen);
        flags.add(R.drawable.israel);
        flags.add(R.drawable.brazil);
        flags.add(R.drawable.china);
        flags.add(R.drawable.chile);
        flags.add(R.drawable.argentina);
        flags.add(R.drawable.russia);
        flags.add(R.drawable.uk);
        flags.add(R.drawable.libya);
        flags.add(R.drawable.ESTONIA);
        flags.add(R.drawable.);
    }
}