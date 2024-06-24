package com.example.achal;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class PromptsActivity extends AppCompatActivity {
    Context cnt=this;
    EditText edtuserresultobj;
    Button btnpromptobj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_prompts);
        edtuserresultobj=findViewById(R.id.edtUserResult);
        btnpromptobj=findViewById(R.id.btnprompt);
        btnpromptobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutInflater li=LayoutInflater.from(cnt);
                View promptsView=li.inflate(R.layout.prompts,null);
                AlertDialog.Builder b=new AlertDialog.Builder(cnt);
                b.setView(promptsView);
                EditText userInputobj=(EditText) promptsView.findViewById(R.id.edtUserInput);
                b.setCancelable(false).setPositiveButton("ok", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id) {
                     edtuserresultobj.setText(userInputobj.getText());

                    }
                }).setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                });
                AlertDialog alertDialog=b.create();
                alertDialog.show();
            }
        });
    }
}