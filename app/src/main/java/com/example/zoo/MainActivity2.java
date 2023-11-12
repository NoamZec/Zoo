package com.example.zoo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity2 extends AppCompatActivity {


    private ListView listView;
    private TextView count;
    private ArrayList<String> info = new ArrayList<>();
    private ArrayList<String> country = new ArrayList<>();
    private ArrayList<Integer> flags = new ArrayList<>();
    private ImageView img;// to show the images of the flags
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        listView = findViewById(R.id.listView);
        count =  findViewById(R.id.counter);
        img =  findViewById(R.id.img);
        new CountDownTimer(10000, 1000) {//Start the countdown
            public void onTick(long millisUntilFinished) {//start the onTick function
                count.setText("second remainder: " + millisUntilFinished / 1000);
            }
            @Override
            public void onFinish() {//when finished the countdown this says the timer is over
                count.setText("The timer is over");
            }//when finished this msg will appear
        }.start();
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
        info.add("italy's population is: 59.11 M, The continent is: Europe");
        info.add("Iran's population is: 87.92  M, The continent is: Asia");
        info.add("Switzerland's population is: 8.703 M, The continent is: Europe");
        info.add("France's population is:  67.75 M, The continent is: Europe");
        info.add("Yemen's population is:  32.98 M, The continent is: Asia");
        info.add("Israel's population is:  9.364 M, The continent is: Asia");
        info.add("Brazil's population is:  214.3 M, The continent is: America");
        info.add("china's population is: 1.412 B, The continent is: Asia");
        info.add("chile's population is: 19.49 M, The continent is: America");
        info.add("Argentina's population is: 45.81 M, The continent is: America");
        info.add("Russia's population is:  143.4  M, The continent is: Europe");
        info.add("United Kingdom's population is:  67.33 M, The continent is: Europe");
        info.add("Libya's population is: 6.735 M, The continent is: Africa");
        info.add("Estonia's population is:  1.331 M, The continent is: Europe");
        info.add("japan's population is:  125.7 M, The continent is: Asia");
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
        flags.add(R.drawable.estonia);
        flags.add(R.drawable.japan);
        // connecting ArrayList(country) to the listView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getApplicationContext(),
                android.R.layout.simple_list_item_1, country);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long id) {

                    showToast(String.valueOf(info.get(i)));//get the Toast msg information about the country
                    img.setImageResource(flags.get(i));// show the images of the flags
            }
        });
    }

    private void showToast(String message) {//show the Toast msg
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}