package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText login;
    private EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login=findViewById(R.id.editTextText2);
        password=findViewById(R.id.editTextText);




    }


    public void iractividad2(View view){
        Intent myintent= new Intent(this, MainActivity2.class);
        startActivity(myintent);
    }

    public void iractividad3(View view){
        Intent myintent= new Intent(this, MainActivity3.class);

        if(login.getText().toString().isEmpty()&&password.getText().toString().isEmpty())
            Toast.makeText(MainActivity.this, "LOGIN O PASSWORD VACIO", Toast.LENGTH_SHORT).show();
        else
            startActivity(myintent);
    }



}