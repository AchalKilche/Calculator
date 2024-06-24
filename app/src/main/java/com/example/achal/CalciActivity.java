package com.example.achal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CalciActivity extends AppCompatActivity {
    Button btnaddobj,btnclearobj;
    EditText edtnum1obj,edtnum2obj,edtnum3obj;
    int num1,num2,add;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calci);

        btnaddobj=findViewById(R.id.btnadd);
        btnclearobj=findViewById(R.id.btnclear);

        edtnum1obj=findViewById(R.id.edtnum1);
        edtnum2obj=findViewById(R.id.edtnum2);
        edtnum3obj=findViewById(R.id.edtnum3);


        btnaddobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edtnum1obj.getText().length()==0)
                {
                  edtnum1obj.setError("please enter first number");
                }
                else if(edtnum2obj.getText().length()==0)
                {
                    edtnum2obj.setError("please enter second number");
                }
                else
                //addition
                num1=Integer.parseInt(edtnum1obj.getText().toString());
                num2=Integer.parseInt(edtnum2obj.getText().toString());
                add=num1+num2;
                edtnum3obj.setText(String.valueOf(add));
            }
        });
        btnclearobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnum1obj.setText("");
                edtnum2obj.setText("");
                edtnum3obj.setText("");
            }
        });
    }
}