package com.example.itcolledge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ActivityEWM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ewm);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        TextView text = findViewById(R.id.txt);
        text.setText(bundle.getString("Key"));
    }
}