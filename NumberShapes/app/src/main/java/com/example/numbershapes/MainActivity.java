package com.example.numbershapes;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    class Number {

        int number;

        public boolean isTriangular() {

            int x = 1;
            int triangular = 1;

            while (triangular < number) {
                x++;
                triangular = triangular + x;
            }

            if (triangular == number) {
                return true;
            } else {
                return false;
            }
        }

        public boolean isSquare() {

            double squareRoot = Math.sqrt(number);

            if (squareRoot == Math.floor(squareRoot)) {

                return true;
            } else {

                return false;
            }
        }

    }

    public void testNumber(View view) {

        String message = "";
        EditText usersNumber = (EditText) findViewById(R.id.usersNumber);

        if (usersNumber.getText().toString().isEmpty()) {
            message = "Please enter a number!";

        } else {


            Number myNumber = new Number();
            myNumber.number = Integer.parseInt(usersNumber.getText().toString());

            if (myNumber.isSquare()) {
                if (myNumber.isTriangular()) {

                    message = myNumber.number + " is both triangular and square!";
                } else {

                    message = myNumber.number + "is square but not tringular.";
                }
            } else {

                if (myNumber.isTriangular()) {

                    message = myNumber.number + " is triangular but not square!";
                } else {

                    message = myNumber.number + "is neither square nor tringular.";
                }

            }

        }
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
