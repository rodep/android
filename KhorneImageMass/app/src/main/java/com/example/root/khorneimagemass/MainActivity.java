package com.example.root.khorneimagemass;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {



public void functionBloodSacrifice(View view){

    ImageView image = findViewById(R.id.khorneview);
    image.setImageResource(R.drawable.khornedaemonkin);

       Log.i("test","blood for the blood god");


}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
