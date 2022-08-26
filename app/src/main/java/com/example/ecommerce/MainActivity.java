package com.example.ecommerce;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2;
    Button reg, lo,om;
    private FirebaseAuth mAuth;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mAuth = FirebaseAuth.getInstance();
        reg = findViewById(R.id.reg);
        lo = findViewById(R.id.bt1);
        et1 = findViewById(R.id.edtxt1);
        et2 = findViewById(R.id.edtxt2);
        String str1 = et1.getText().toString();
        String str2 = et2.getText().toString();
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i1 = new Intent(MainActivity.this, Register.class);
                startActivity(i1);
            }
        });
        lo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent(MainActivity.this,Pro.class);
                startActivity(i2);
            }
        });
        om=findViewById(R.id.om);
        om.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,Offline.class);
                startActivity(i);
            }
        });




    }
}