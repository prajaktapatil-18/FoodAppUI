package com.example.weather;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button login ,register;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       getSupportActionBar().hide();


       login=findViewById(R.id.btnLogin);

       login.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {

               Intent intent = new Intent(MainActivity.this,SignIn_Activity.class);
               startActivity(intent);

               Toast.makeText(MainActivity.this,"login has been click",Toast.LENGTH_SHORT).show();
           }
       });




        register = findViewById(R.id.register);

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,SignUp_Activity.class);
                startActivity(intent);

                Toast.makeText(MainActivity.this," clicked",Toast.LENGTH_SHORT).show();


            }
        });

    }
}