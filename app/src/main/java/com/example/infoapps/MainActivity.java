package com.example.infoapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void ochospital(View view) {
        Intent i = new Intent(this, hospital.class);
        startActivity(i);
    }

    public void ocpolice(View view) {
    }

    public void ocshop(View view) {
    }

    public void ocschool(View view) {
    }
}