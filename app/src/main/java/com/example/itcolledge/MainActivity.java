package com.example.itcolledge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.itcolledge.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] listOfSubjects = {"1", "2", "3"};

        ListView listView = findViewById(R.id.list);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                listOfSubjects
        );
        listView.setAdapter(adapter);

        String one = " ";

        String two = " ";

        String three = " ";

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, ActivityEWM.class);

                switch (i){
                    case 0:
                        intent.putExtra("Key", one);

                        break;
                    case 1:
                        intent.putExtra("Key", two);

                        break;
                    case 2:
                        intent.putExtra("Key", three);
                        break;

                }
                startActivity(intent);
            }
        });
    }
}