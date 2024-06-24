package com.example.achal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class radioActivity extends AppCompatActivity {

    RadioGroup rdggenderobj;
    RadioButton rdbgenderobj;
    TextView txvgenderobj;
    Button btnverifyobj;
    int selectedid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radio);

        rdggenderobj=findViewById(R.id.rdggender);
       txvgenderobj=findViewById(R.id.txvgender);
        btnverifyobj=findViewById(R.id.btnverify);

        btnverifyobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                selectedid=rdggenderobj.getCheckedRadioButtonId();
                rdbgenderobj=findViewById(selectedid);
                txvgenderobj.setText("You hava selected : "+rdbgenderobj.getText().toString());
            }
        });
    }
}