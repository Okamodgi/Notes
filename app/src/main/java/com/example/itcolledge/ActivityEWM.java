package com.example.itcolledge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;

public class ActivityEWM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ewm);
        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        TextView text = findViewById(R.id.txt);
        TextView text2 = findViewById(R.id.txt2);
        text.setText(bundle.getString("Key"));
        text2.setText(bundle.getString("Key2"));
    }
    protected void RES (){
        Intent intent = new Intent(ActivityEWM.this, MainActivity.class);
        startActivity(intent);
    }

}