package com.example.simplelistviewapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    // 1- AdapterView
    ListView listView;

    // 2- Data Source
    String[] worldCup22 = {
            "Germany",
            "Spain",
            "Brazil",
            "England",
            "USA",
            "Saudi Arabia",
            "Qatar"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listview);

        // 3- Adapter
        ArrayAdapter adapter = new ArrayAdapter(
                this,
                R.layout.my_list_item,
                R.id.textView,
                worldCup22
        );

        listView.setAdapter(adapter);
    }
}