package com.example.achal;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.TextView;

public class Seekbar extends AppCompatActivity {
    TextView mobvolobj,txvobj;
    SeekBar skbrobj;
    AudioManager a;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seekbar);
        mobvolobj=findViewById(R.id.mobvol);
        txvobj=findViewById(R.id.txv);
        skbrobj=findViewById(R.id.skbr);

        a=(AudioManager) getSystemService(AUDIO_SERVICE);
        int maxvolume=a.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int curvolume=a.getStreamVolume(AudioManager.STREAM_MUSIC);

        skbrobj.setMax(maxvolume);
        skbrobj.setProgress(curvolume);
        skbrobj.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                txvobj.setText("Volume is :" +String.valueOf(i));

                a.setStreamVolume(AudioManager.STREAM_MUSIC,i,0);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}