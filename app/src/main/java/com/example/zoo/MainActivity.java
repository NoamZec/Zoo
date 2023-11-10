package com.example.zoo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.app.WindowDecorActionBar;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView count;
    private Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new CountDownTimer(100000, 1000) {//Start the countdown
            public void onTick(long millisUntilFinished) {//start the onTick function
                count.setText("second remainder: " + millisUntilFinished / 1000);
            }
            @Override
            public void onFinish() {//when finished the countdown this says the timer is over
                count.setText("The timer is over");
            }
        }.start();
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,MainActivity2.class);//move from one page to  2 page...
                startActivity(i);
            }
        });

    }
}