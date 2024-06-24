package com.example.achal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btncalculatorobj,webobj,swtcobj,btnimageobj,btnloginobj,btnadditionobj,btnsequenceobj,btnradiobuttonobj,btnradiobutton1obj,btnskbrobj,btnanalogobj,btncheckboxobj,btncheckbox1obj;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         btnadditionobj=findViewById(R.id.btnaddition);
        btnradiobuttonobj=findViewById(R.id.btnradiobutton);
        btnradiobutton1obj=findViewById(R.id.btnradiobutton1);
        btncheckboxobj=findViewById(R.id.btncheckbox);
        btncheckbox1obj=findViewById(R.id.btncheckbox1);
        btnanalogobj=findViewById(R.id.btnanalog);
        btnskbrobj=findViewById(R.id.btnskbr);
        btnsequenceobj=findViewById(R.id.btnsequence);
        btnloginobj=findViewById(R.id.btnLogin);
        btnimageobj=findViewById(R.id.btnimage);
        swtcobj=findViewById(R.id.swtc);
        webobj=findViewById(R.id.web);
        btncalculatorobj=findViewById(R.id.btncalculator);

        btnadditionobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,CalciActivity.class);
                startActivity(i);
            }
        });

        btnradiobuttonobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,radioActivity.class);
                startActivity(i);
            }
        });
        btnradiobutton1obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,radioActivity1.class);
                startActivity(i);
            }
        });
        btncheckboxobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i=new Intent(MainActivity.this,CheckboxActivity.class);
                startActivity(i);
            }
        });
        btncheckbox1obj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,CheckboxActivity2.class);
                startActivity(i);
            }
        });
        btnanalogobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,DigitalAnalog.class);
                startActivity(i);
            }
        });
        btnskbrobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Seekbar.class);
                startActivity(i);
            }
        });
        btnsequenceobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,SequenceActivity.class);
                startActivity(i);
            }
        });
        btnloginobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,LoginForm.class);
                startActivity(i);
            }
        });
        btnimageobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,imageView.class);
                startActivity(i);
            }
        });
        swtcobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,SwitchActivity.class);
                startActivity(i);
            }
        });

        btncalculatorobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,CalculatorActivity.class);
                startActivity(i);
            }
        });
        webobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,WebActivity.class);
                startActivity(i);
            }
        });





    }
}