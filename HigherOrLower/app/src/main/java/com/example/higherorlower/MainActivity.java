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

            // first issue: use the random number only one time and then guess
            // check why log is repeating the prints: smaller, smaller.
            public  void guessTheNumber(View view){

                EditText guessedNumberField;
                guessedNumberField = findViewById(R.id.editTextGuessNumber);

                String text = guessedNumberField.getText().toString();
                int guessedNum = new Integer(text).intValue();

                int randNum = generateRandomNumber();

                for(int i=0; i<= 20; i++){

                    if(randNum == guessedNum){
                        System.out.println("guessed right!");
                    }

                    if(randNum > guessedNum) {
                         System.out.println("bigger");
                    }

                    if(randNum < guessedNum) {
                        System.out.println("smaller");
                    }
                }

                System.out.println("end of for loop");

            }

            public int generateRandomNumber(){

                Random rand = new Random();
                Integer  randomNum = rand.nextInt((20 - 1) + 1) + 1;
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

