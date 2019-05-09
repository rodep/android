        package com.example.higherorlower;

        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;

        import java.util.Random;


        public class MainActivity extends AppCompatActivity {

            Random rand = new Random();
            Integer randNum = rand.nextInt((20 - 1) + 1) + 1;


            // first issue: use the random number only one time and then guess : FIXED
            // WORK ON THE NUMBER CHECKING LOOP

            public  void guessTheNumber(View view){

                System.out.println(randNum);

                EditText guessedNumberField;
                guessedNumberField = findViewById(R.id.editTextGuessNumber);

                String text = guessedNumberField.getText().toString();
                int guessedNum = new Integer(text).intValue();


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
                @Override
                protected void onCreate(Bundle savedInstanceState) {
                    super.onCreate(savedInstanceState);
                    setContentView(R.layout.activity_main);
                    EditText guessedNumberField;
                }



            }

