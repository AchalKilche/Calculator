package com.example.achal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class radioActivity1 extends AppCompatActivity {
    RadioGroup rgb1obj,rgb2obj;
    RadioButton rbtn1obj,rbtn2obj;
    RadioButton rbppobj,rbkkobj,rbnrobj,rbicobj,rbcdobj;
    Button btngtobj;
    TextView txv1obj;
    int selectedid1,selectedid2;
    int amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio1);

        rgb1obj=findViewById(R.id.rgb1);
        rgb2obj=findViewById(R.id.rgb2);
        btngtobj=findViewById(R.id.btngt);
        txv1obj=findViewById(R.id.txv1);
        rbppobj=findViewById(R.id.rbpp);
        rbkkobj=findViewById(R.id.rbkk);
        rbnrobj=findViewById(R.id.rbnr);
        rbicobj=findViewById(R.id.rbic);
        rbcdobj=findViewById(R.id.rbcd);

        btngtobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                amount = 0;
                if (rbppobj.isChecked()) {
                    amount = 200;
                }
                if (rbkkobj.isChecked()) {
                    amount = 300;
                }
                if (rbnrobj.isChecked()) {
                    amount = 1000;
                }
                selectedid1 = rgb1obj.getCheckedRadioButtonId();
                rbtn1obj = findViewById(selectedid1);

                        if(rbicobj.isChecked())
                        {
                    amount+=80;
                }
                else
                    {
                    amount+=30;
                }
                selectedid2=rgb2obj.getCheckedRadioButtonId();
                rbtn2obj=findViewById(selectedid2);
                txv1obj.setText("Total is="+amount);
            }
        });
    }
}