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


        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                listOfSubjects
        );
        listView.setAdapter(adapter);

        String ewm = "        Элементы\nвысшей математики";
        String rmp = "         Разработка\n мобильных приложений";
        String fzk = "Физическая культура";
        String arc = "        Архитектура\n аппаратных средств";
        String rpm = "        Разработка \nпрограммных модулей";
        String dmt = "Дискретная математика";
        String eco = "Экономика отрасли";
        String chm = "Численные методы";
        String eng = "Иностранный язык";
        String ssp = "Системное программирование";
        String std = "Стандартизация, сертификация,\n техническое документирование";
        String tst = "Поддержка и тестирование";

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, ActivityEWM.class);

                switch (i){
                    case 0:
                        intent.putExtra("Key", rmp);
                        break;
                    case 1:
                        intent.putExtra("Key", ewm);
                        break;
                    case 2:
                        intent.putExtra("Key", fzk);
                        break;
                    case 3:
                        intent.putExtra("Key", arc);
                        break;
                    case 4:
                        intent.putExtra("Key", rpm);
                        break;
                    case 5:
                        intent.putExtra("Key", dmt);
                        break;
                    case 6:
                        intent.putExtra("Key", eco);
                        break;
                    case 7:
                        intent.putExtra("Key", chm);
                        break;
                    case 8:
                        intent.putExtra("Key", eng);
                        break;
                    case 9:
                        intent.putExtra("Key", ssp);
                        break;
                    case 10:
                        intent.putExtra("Key", std);
                        break;
                    case 11:
                        intent.putExtra("Key", tst);
                        break;

                }
                startActivity(intent);
            }
        });
    }
}