package com.example.achal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class SwitchActivity extends AppCompatActivity {
    WifiManager wifiManager;
    TextView wifiStatusTextView;
    Switch wifiSwitch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch);

        wifiManager=(WifiManager) getApplicationContext().getSystemService(Context.WIFI_SERVICE);
        wifiStatusTextView=(TextView) findViewById(R.id.txv);
        wifiSwitch=(Switch)findViewById(R.id.swt);

        if (wifiManager.isWifiEnabled())
        {
            wifiStatusTextView.setText("wifi is currently ON");
            wifiSwitch.setChecked(true);
        }
        else
        {
            wifiStatusTextView.setText("wifi is currrently OFF");
            wifiSwitch.setChecked(false);
        }
            wifiSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {
                    wifiManager.setWifiEnabled(true);
                    wifiStatusTextView.setText("wifi is currently ON");
                    Toast.makeText(SwitchActivity.this, "wifi may take a moment to turn on", Toast.LENGTH_LONG).show();
                }
                else {
                    wifiManager.setWifiEnabled(false);
                    wifiStatusTextView.setText("wifi is currently OFF");
                }

            }

        });

    }
}