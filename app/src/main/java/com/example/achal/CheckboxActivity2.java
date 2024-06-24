package com.example.achal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckboxActivity2 extends AppCompatActivity {
    CheckBox chkcobj,chkcppobj,chkmobobj;
    TextView txvfeeobj;
    Button btngetfeeobj;
    int fee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox2);
        chkcobj=findViewById(R.id.chkc);
        chkcppobj=findViewById(R.id.chkcpp);
        chkmobobj=findViewById(R.id.chkmob);
        txvfeeobj=findViewById(R.id.txvfees);

        chkcobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fee=0;
                if(chkcobj.isChecked()){
                    fee +=2000;
                }
                if (chkcppobj.isChecked()) {
                    fee += 2500;
                }
                if(chkmobobj.isChecked()) {
                    fee += 50000;
                }

                txvfeeobj.setText("Your fee is="+fee);
            }
        });
        chkcppobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fee=0;
                if(chkcobj.isChecked()){
                    fee +=2000;
                }
                if (chkcppobj.isChecked()) {
                    fee += 2500;
                }
                if(chkmobobj.isChecked()) {
                    fee += 50000;
                }

                txvfeeobj.setText("Your fee is=" + fee);
            }
        });
        chkmobobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fee=0;
                if(chkcobj.isChecked()){
                    fee +=2000;
                }
                if (chkcppobj.isChecked()) {
                    fee += 2500;
                }
                if(chkmobobj.isChecked()) {
                    fee += 50000;
                }
                txvfeeobj.setText("Your fee is=" + fee);
            }
        });
    }
}