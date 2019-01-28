package com.example.zalwe.restapiasynctask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity{


    Button fiveDaysButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        fiveDaysButton = findViewById(R.id.buttonFiveDays);

        fiveDaysButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fiveDaysActivity();
            }
        });
    }

    private void fiveDaysActivity() {

        Intent intent = new Intent(MainActivity.this,FiveDaysActivity.class);
        startActivity(intent);
    }
}