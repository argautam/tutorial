package com.example.tutorial;
import android.view.View;
import android.widget.Button;
import android.content.Intent;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private Button Tutorial;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Tutorial = (Button) findViewById(R.id.btnadd);
        Tutorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                openTutorial();
            }
        });
    }

        public void openTutorial()
        {
            Intent intent = new Intent(this, tutorial.class);
            startActivity(intent);
        }
    }








