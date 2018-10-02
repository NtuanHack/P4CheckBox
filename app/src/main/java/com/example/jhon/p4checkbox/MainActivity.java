package com.example.jhon.p4checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox cbWindows,cbMac,cbLinux;
    private Button btSubmit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCheckBoxListener();
        setButtonListener();
    }

    private void setButtonListener() {
        cbMac = (CheckBox) findViewById(R.id.cb_mac);
        cbLinux = (CheckBox) findViewById(R.id.cb_linux);

        btSubmit = (Button) findViewById(R.id.bt_submit);
        btSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String status = "Windows check " + cbWindows.isChecked() +"\n MacOs check " + cbMac.isChecked() +"\n Lunux check "+ cbLinux.isChecked();
                Toast.makeText(MainActivity.this, status, Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void setCheckBoxListener() {
        cbWindows = findViewById(R.id.cb_windows);
        cbWindows.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(((CheckBox) v).isChecked()){
                    Toast.makeText(MainActivity.this, "Nggak Pingin pake Mac bro ? :)", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
