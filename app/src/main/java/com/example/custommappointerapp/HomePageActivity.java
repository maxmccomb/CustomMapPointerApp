package com.example.custommappointerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HomePageActivity extends AppCompatActivity {

    EditText lat;
    EditText log;
    Button submitButton;

    double latValue;
    double logValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        lat = findViewById(R.id.latTextEdit);
        log = findViewById((R.id.longTextEdit));
        submitButton = findViewById((R.id.submitButton));

        configureSubmitButton();
    }

    public void configureSubmitButton(){
        submitButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent i = new Intent(HomePageActivity.this, MapsActivity.class);
                latValue = Double.parseDouble(lat.getText().toString());
                logValue = Double.parseDouble(log.getText().toString());

                i.putExtra("Lat", latValue);
                i.putExtra("Log", logValue);

                startActivity(i);
            }
        });


    }
}
