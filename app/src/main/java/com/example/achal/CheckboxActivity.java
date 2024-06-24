package com.example.achal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class CheckboxActivity extends AppCompatActivity {

    CheckBox chkcobj,chkcppobj,chkmobobj;
    Button btnfeeobj;
    TextView txvfeeobj;
    int fee;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);

        chkcobj=findViewById(R.id.chkc);
        chkcppobj=findViewById(R.id.chkcpp);
        chkmobobj=findViewById(R.id.chkmob);
        btnfeeobj=findViewById(R.id.btnfees);
        txvfeeobj=findViewById(R.id.txvfees);

        btnfeeobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fee=0;
                if(chkcobj.isChecked())
                {
                    fee+=2000;
                }
                if (chkcppobj.isChecked())
                {
                    fee+=2500; //fee=fee+2500;
                }
                if(chkmobobj.isChecked())
                {
                    fee+=50000;
                }
                txvfeeobj.setText("Your fee is : "+fee);
            }
        });
    }
}