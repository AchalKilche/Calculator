package com.example.achal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class CalculatorActivity extends AppCompatActivity {
    Button btnacobj, btncobj, btnperobj, btndivobj;
    Button btnsevenobj, btneightobj, btnnineobj, btnmulobj;
    Button btnfourobj, btnfiveobj, btnsixobj, btnsubobj;
    Button btnoneobj, btntwoobj, btnthreeobj, btnaddobj;
    Button btnzeroobj, btndotobj, btnequalobj;
    EditText txtnum1obj;
    Double a, b, c;
    int choice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);
        btncobj = findViewById(R.id.btnc);
        btnacobj = findViewById(R.id.btnac);
        btnperobj = findViewById(R.id.btnper);
        btndivobj = findViewById(R.id.btndiv);

        btnsevenobj = findViewById(R.id.btnseven);
        btneightobj = findViewById(R.id.btneight);
        btnnineobj = findViewById(R.id.btnnine);
        btnmulobj = findViewById(R.id.btnmul);

        btnfourobj = findViewById(R.id.btnfour);
        btnfiveobj = findViewById(R.id.btnfive);
        btnsixobj = findViewById(R.id.btnsix);
        btnsubobj = findViewById(R.id.btnsub);

        btnoneobj = findViewById(R.id.btnone);
        btntwoobj = findViewById(R.id.btntwo);
        btnthreeobj = findViewById(R.id.btnthree);
        btnaddobj = findViewById(R.id.btnadd);


        btnzeroobj = findViewById(R.id.btnzero);
        btndotobj = findViewById(R.id.btndot);
        btnequalobj = findViewById(R.id.btnequal);
        txtnum1obj = findViewById(R.id.txtnum1);


        btnacobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtnum1obj.setText("");

            }
        });


        btnoneobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                txtnum1obj.setText(s + "1");
            }
        });

        btntwoobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                txtnum1obj.setText(s + "2");
            }
        });

        btnthreeobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                txtnum1obj.setText(s + "3");
            }
        });

        btnfourobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                txtnum1obj.setText(s + "4");
            }
        });

        btnfiveobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                txtnum1obj.setText(s + "5");
            }
        });

        btnsixobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                txtnum1obj.setText(s + "6");
            }
        });

        btnsevenobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                txtnum1obj.setText(s + "7");
            }
        });

        btneightobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                txtnum1obj.setText(s + "8");
            }
        });

        btnnineobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                txtnum1obj.setText(s + "9");
            }
        });

        btnzeroobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                if (!(s.isEmpty()))
                    txtnum1obj.setText(s + "0");
            }
        });
        btndotobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                int n = s.indexOf(".");
                if (s.isEmpty())
                    txtnum1obj.setText("0.");
                else if (n < 0)
                    txtnum1obj.setText(s + ".");
            }
        });

        btnaddobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                a = Double.parseDouble(s);
                choice = 1;
                txtnum1obj.setText("");

            }
        });

        btnsubobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                a = Double.parseDouble(s);
                choice = 2;
                txtnum1obj.setText("");

            }
        });

        btnmulobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                a = Double.parseDouble(s);
                choice = 3;
                txtnum1obj.setText("");

            }
        });

        btndivobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                a = Double.parseDouble(s);
                choice = 4;
                txtnum1obj.setText("");

            }
        });

        btnperobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                a = Double.parseDouble(s);
                choice = 5;
                txtnum1obj.setText("");

            }
        });

        btncobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String clear=txtnum1obj.getText().toString();
                if(clear.length()>0)
                {
                    clear=clear.substring(0,clear.length()-1);
                    txtnum1obj.setText(clear);
                }
            }
        });


        btnequalobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = txtnum1obj.getText().toString();
                b = Double.parseDouble(s);
                if (txtnum1obj.getText().length() == 0)
                {
                    txtnum1obj.setError("Please enter valid number");
                }

                else
                    switch (choice) {
                        case 1:
                            c = a += b;
                            break;
                        case 2:
                            c = a -= b;
                            break;
                        case 3:
                            c = a *= b;
                            break;
                        case 4:
                            c = a /= b;
                            break;
                        case 5:
                            c = a %= b;

                    }
                txtnum1obj.setText(Double.toString(c));
            }
        });
    }
}














