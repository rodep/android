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


/* edit field created for manipulation, random number created. Test if random number works. */

    public  void onClick(View view){

        Random rand = new Random();
        int randomNum = rand.nextInt((20 - 1) + 1) + 1;

        EditText guessedNumberField = (EditText) findViewById(R.id.editTextGuessNumber);
        System.out.println(randomNum); // random number generating successfully
        

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
