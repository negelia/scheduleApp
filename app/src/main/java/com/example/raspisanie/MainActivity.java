package com.example.raspisanie;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Model> names = new ArrayList<Model>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setData();
        RecyclerView recyclerView = findViewById(R.id.recycleView);
        RecyclerAdapter adapter = new RecyclerAdapter(this, names);
        recyclerView.setAdapter(adapter);
    }

    private void setData(){
        names.add(new Model ("Понедельник",
                "1", "2", "3", "", "",
                "Физическая культура","Программирование / Английский язык","Разработка ПО","","",
                "А.В.Андрюков","А.Д.Нилов / А.Д.Завьялова","Ю.В.Севастьянов","",""));

        names.add(new Model ("Вторник",
                "1", "2", "3", "4", "5",
                "Физическая культура","Программирование","Английский язык","Разработка ПО","Мобильные приложения",
                "А.В.Андрюков","А.Д.Нилов","А.Д.Завьялова","Ю.В.Севастьянов","А.О.Лясников"));

        names.add(new Model ("Среда",
                "1", "2", "3", "", "",
                "Мобильные приложения / Программирование","Программные модули","Разработка ПО","","",
                "А.О.Лясников / А.Д.Нилов","А.Ю.Бушин","Ю.В.Севастьянов","",""));

        names.add(new Model ("Четверг",
                "2", "3", "4", "", "",
                "Разработка модулей ПО","Технология разработки ПО","Защита баз данных","","",
                "А.А.Шимбирев","Л.А.Соколова","А.Д. Горбунов","",""));

        names.add(new Model ("Пятница",
                "1", "2", "3", "", "",
                "Физическая культура / Английский язык","Программирование","Разработка ПО","","",
                "А.В.Андрюков / А.Д.Завьялова","А.Д.Нилов","Ю.В.Севастьянов","",""));
    }
}