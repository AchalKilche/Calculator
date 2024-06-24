package com.example.achal;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class imageView extends AppCompatActivity {
 ImageView imgplayobj,imgpauseobj;
 boolean imgdisplay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_view);
        imgplayobj=findViewById(R.id.imgplay);
        imgpauseobj=findViewById(R.id.imgpause);

        imgplayobj.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              if(imgdisplay) {
                  imgplayobj.setImageResource(R.drawable.pause);
                  imgdisplay = false;
              }
              else{
                  imgplayobj.setImageResource(R.drawable.pause);
                  imgdisplay=true;
              }
            }
        });
    }
}