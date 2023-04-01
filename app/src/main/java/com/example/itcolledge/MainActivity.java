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

        String [] listOfSubjects = {"РМП", "ЭВМ", "Физкультура", "Архитектура аппаратных средств",
                "Разработка программных модулей", "Дискретная математика", "Экономика",
                "Численные методы", "Ин. яз.", "Системной программирование", "Стандартизация", "Тестирование"};

        ListView listView = findViewById(R.id.list);
        TextView textView = findViewById(R.id.text);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                listOfSubjects
        );
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, ActivityEWM.class);
                startActivity(intent);
            }
        });
    }
}