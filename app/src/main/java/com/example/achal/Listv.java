package com.example.achal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class Listv extends AppCompatActivity {
    ListView lstv;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listv);
        lstv=findViewById(R.id.lst);
        lstv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long l) {
                if (i == 0) {
                    Toast.makeText(getApplicationContext(), "Apple selected", Toast.LENGTH_SHORT).show();
                } else if (i == 1) {
                    Toast.makeText(getApplicationContext(), "Grapes selected", Toast.LENGTH_SHORT).show();
                } else if (i == 2) {
                    Toast.makeText(getApplicationContext(), "Banana selected", Toast.LENGTH_SHORT).show();
                } else if (i == 3) {
                    Toast.makeText(getApplicationContext(), "Orange selected", Toast.LENGTH_SHORT).show();
                } else if (i == 4) {
                    Toast.makeText(getApplicationContext(), "Kiwi selected", Toast.LENGTH_SHORT).show();
                } else if (i == 5) {
                    Toast.makeText(getApplicationContext(), "Mango selected", Toast.LENGTH_SHORT).show();
                } else if (i == 6) {
                    Toast.makeText(getApplicationContext(), "Cheery selected", Toast.LENGTH_SHORT).show();
                } else if (i == 7) {
                    Toast.makeText(getApplicationContext(), "Watermelon selected", Toast.LENGTH_SHORT).show();
                }
               }

            });
        }

}