package com.example.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import java.util.Random;


public class MainActivity extends AppCompatActivity {



    public  void onClick(View view){


        int randomNum = generateRandomNumber();

        EditText guessedNumberField;
        guessedNumberField = findViewById(R.id.editTextGuessNumber);
        


    }


    public int generateRandomNumber(){

        Random rand = new Random();
        int randomNum = rand.nextInt((20 - 1) + 1) + 1;
        System.out.println(randomNum);

        return randomNum;
    }


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            EditText guessedNumberField;
        }



    }

