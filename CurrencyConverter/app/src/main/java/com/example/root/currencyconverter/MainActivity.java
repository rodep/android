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
       double valueToConvert = Double.valueOf(content.getText().toString());
       double convertedValueInUSD = 1.15 * valueToConvert;

       Toast.makeText(this, Double.toString(convertedValueInUSD),Toast.LENGTH_LONG).show();

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }




}


