package com.example.buttonwidget;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity{
    Switch switchme = null;
    private Button btn_msg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        switchme = (Switch) findViewById(R.id.switch1);
        btn_msg = findViewById(R.id.btn);
        switchme.setOnCheckedChangeListener(new OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    btn_msg.setVisibility(View.VISIBLE);
                    btn_msg.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View view) {
                            Toast.makeText(MainActivity.this, "Hello me", Toast.LENGTH_SHORT).show();
                        }
                    });
                }
                else{
                    btn_msg.setVisibility(View.GONE);
                }
            }
        });
    }
}
