package com.Infinity.numberguessinggame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int random;
    int count =1;
    boolean flag = false;

    public void getrandom()
    {
        Random rand= new Random();
        random=rand.nextInt(11);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getrandom();
    }

    public  void  guess (View view)
    {
        EditText number = findViewById(R.id.numberEditText);
        int num = Integer.parseInt( number.getText().toString());
       // Toast.makeText(this, random, Toast.LENGTH_SHORT).show();
        if (num>random)
        {
            Toast.makeText(this, "A little less", Toast.LENGTH_SHORT).show();
        }
        else if(num<random)
        {
            Toast.makeText(this, "A little higher", Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "Great Job! you guessed it", Toast.LENGTH_SHORT).show();
            getrandom();
        }
        count++;
        if (count>3 && flag==false)
        {
            Toast.makeText(this, " you lost!", Toast.LENGTH_SHORT).show();
            getrandom();
        }



    }
}
