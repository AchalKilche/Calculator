package com.example.achal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.RelativeLayout;

public class menuActivity extends AppCompatActivity {
    RelativeLayout rloutobj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        rloutobj = (RelativeLayout) findViewById(R.id.rlout);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.mymenu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mired:
                rloutobj.setBackgroundColor(Color.RED);
                return true;
            case R.id.migreen:
                rloutobj.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.miblue:
                rloutobj.setBackgroundColor(Color.BLUE);
                return true;
            default:
                return true;
        }
    }
}