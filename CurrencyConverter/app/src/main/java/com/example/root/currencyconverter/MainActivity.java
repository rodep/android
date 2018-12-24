package com.example.root.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void onClick(View view){

        TextView content = findViewById(R.id.editTextCurrencyInput);


        Toast.makeText(this, String.valueOf(content),Toast.LENGTH_LONG).show();

        Log.i("info","testing");


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




}


