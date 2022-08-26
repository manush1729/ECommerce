package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Offline extends AppCompatActivity {
    Button b1;
    EditText et1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_offline);
        ActivityCompat.requestPermissions(Offline.this,new String[]{Manifest.permission.READ_SMS,Manifest.permission.SEND_SMS}, PackageManager.PERMISSION_GRANTED);
        b1=findViewById(R.id.m);
        et1=findViewById(R.id.mn);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mo=et1.getText().toString();
                String s1="Name:Iphone 12\nInternal Storage: 128GB\nRAM: 8GB\nPrice: ₹ 1,20,000";
                SmsManager sm=SmsManager.getDefault();
                sm.sendTextMessage(mo,null,s1,null,null);
            }
        });
    }
}