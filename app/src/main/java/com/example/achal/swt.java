package com.example.achal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Switch;

public class swt extends AppCompatActivity {
   Switch swtchobj;
   EditText edtonoffobj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swt);
        swtchobj=findViewById(R.id.swtch);
        edtonoffobj=findViewById(R.id.edtonoff);
        swtchobj.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    edtonoffobj.setText("ON");
                } else {
                    edtonoffobj.setText("OFF");
                }
            }
        });
    }
}