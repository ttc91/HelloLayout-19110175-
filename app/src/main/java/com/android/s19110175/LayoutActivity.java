package com.android.s19110175;

import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class LayoutActivity extends AppCompatActivity {

    private Button btnPort;
    private Button btnLand;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLand = findViewById(R.id.btn_landscape);
        btnPort = findViewById(R.id.btn_portrait);



        btnLand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutActivity.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
            }
        });

        btnPort.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LayoutActivity.this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
            }
        });

    }
}