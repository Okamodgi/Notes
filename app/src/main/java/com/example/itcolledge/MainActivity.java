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
                "Численные методы", "Ин. яз.", "Системное программирование", "Стандартизация", "Тестирование"};

        ListView listView = findViewById(R.id.list);


        ArrayAdapter<String> adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                listOfSubjects
        );
        listView.setAdapter(adapter);

        String ewm = "        Элементы\nвысшей математики";
        String ewm2 = "Преподаватель: Матвеева \nОльга Юрьевна \n\nКабинет: 215 \n\nРасписание: \n\nНеделя 1-\n  Пятница 3 пара \n\nНеделя 2-\n  Пятница 3 пара";

        String rmp = "         Разработка\n мобильных приложений";
        String rmp2 = "Преподаватель: Лисова \nАнастасия Геннадьевна \n\nКабинет: 14 \n\nРасписание: \n\nНеделя 1-\n  Суббота 2 пара \n\nНеделя 2-\n  Суббота 2 пара";

        String fzk = "Физическая культура";
        String fzk2 = "Преподаватель: Лобкова \nЕлена Константиновна \n\nКабинет: Спорт-й зал \n\nРасписание: \n\nНеделя 1-\n  Понедельник 4 пара\n  Пятница 2 пара \n\nНеделя 2- \n  Пятница 2 пара";

        String arc = "        Архитектура\n аппаратных средств";
        String arc2 = "Преподаватель: Ташкинов \nВладислав Васильевич \n\nКабинет: 309 \n\nРасписание: \n\nНеделя 1- \n  Понедельник 4 пара\n\nНеделя 2- \n  Понедельник 2 пара";

        String rpm = "        Разработка \nпрограммных модулей";
        String rpm2 = "Преподаватель: Пузренков \nАлександр Николаевич\n\nКабинет: 12\n\nРасписание: \n\nНеделя 1- \n  Понедельник 3 пара\n  Четверг 3, 4 пара\n  Пятница 1 пара\n  Суббота 4 пара\n\n  Неделя 2- \n  Понедельник 3 пара\n  Четверг 3, 4 пара\n  Пятница 1 пара\n  Суббота 4 пара";

        String dmt = "Дискретная математика";
        String dmt2 = "Преподаватель: Ташкинов \nВладислав Васильевич \n\nКабинет: 211\n\nРасписание: \n\nНеделя 1- \n  Вторник 2 пара\n\nНеделя 2- \n  Вторник 2 пара";

        String eco = "Экономика отрасли";
        String eco2 = "Преподаватель: Сазонова \nИнна Петровна \n\nКабинет: 309\n\nРасписание: \n\nНеделя 1- \n  Вторник 3 пара\n  Четверг 2 пара\n\nНеделя 2- \n  Вторник 3 пара\n  Четверг 2 пара";

        String chm = "Численные методы";
        String chm2 = "Преподаватель: Николаева \nНадежда Сергеевна \n\nКабинет: 19\n\nРасписание: \n\nНеделя 1- \n  Вторник 4 пара\n  Среда 1 пара \n\nНеделя 2- \n  Среда 1 пара";

        String eng = "Иностранный язык";
        String eng2 = "Преподаватель1: Стадник \nВиктория Дмитриевна \n\nКабинет: 315\n\nПреподаватель2: Зиновьева \nОксана Валерьевна\n\nКабинет: 103\n\nРасписание: \n\nНеделя 1- \n  Среда 2 пара\n\nНеделя 2- \n  Среда 2 пара\n  Вторник 1 пара\n  Среда 2 пара";

        String ssp = "Системное программирование";
        String ssp2 = "Преподаватель: Фролова \nЖанна Евгеньевна \n\nКабинет: 23\n\nРасписание: \n\nНеделя 1- \n  Среда 3 пара\n\nНеделя 2- \n  Среда 2 пара\n  Суббота 1 пара";

        String std = "Стандартизация, сертификация,\n техническое документирование";
        String std2 = "Преподаватель: Тарасова \nЛариса Ивановна \n\nКабинет: 309\n\nРасписание: \n\nНеделя 1- \n  Суббота 3 пара\n\nНеделя 2- \n  Суббота 3 пара";

        String tst = "Поддержка и тестирование";
        String tst2 = "Преподаватель: Лукьянова \nГалина Степановна\n\nКабинет: 213\n\nРасписание: \n\nНеделя 2- \n  Понедельник 4 пара";


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(MainActivity.this, ActivityEWM.class);

                switch (i){
                    case 0:
                        intent.putExtra("Key", rmp);
                        intent.putExtra("Key2", rmp2);
                        break;
                    case 1:
                        intent.putExtra("Key", ewm);
                        intent.putExtra("Key2", ewm2);
                        break;
                    case 2:
                        intent.putExtra("Key", fzk);
                        intent.putExtra("Key2", fzk2);
                        break;
                    case 3:
                        intent.putExtra("Key", arc);
                        intent.putExtra("Key2", arc2);
                        break;
                    case 4:
                        intent.putExtra("Key", rpm);
                        intent.putExtra("Key2", rpm2);
                        break;
                    case 5:
                        intent.putExtra("Key", dmt);
                        intent.putExtra("Key2", dmt2);
                        break;
                    case 6:
                        intent.putExtra("Key", eco);
                        intent.putExtra("Key2", eco2);
                        break;
                    case 7:
                        intent.putExtra("Key", chm);
                        intent.putExtra("Key2", chm2);
                        break;
                    case 8:
                        intent.putExtra("Key", eng);
                        intent.putExtra("Key2", eng2);
                        break;
                    case 9:
                        intent.putExtra("Key", ssp);
                        intent.putExtra("Key2", ssp2);
                        break;
                    case 10:
                        intent.putExtra("Key", std);
                        intent.putExtra("Key2", std2);
                        break;
                    case 11:
                        intent.putExtra("Key", tst);
                        intent.putExtra("Key2", tst2);
                        break;

                }
                startActivity(intent);
            }
        });
    }
}