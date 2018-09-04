package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create an arrayList of words
        ArrayList<String> words = new ArrayList<String>();

        words.add("one");
        words.add("two");
        words.add("three");
        words.add("four");
        words.add("five");
        words.add("six");
        words.add("seven");
        words.add("eight");
        words.add("nine");
        words.add("ten");

        Log.v("NumbersActivity", "word index 0: " + words.get(0));
        Log.v("NumbersActivity", "word index 1: " + words.get(1));
        Log.v("NumbersActivity", "word index 2: " + words.get(2));
        Log.v("NumbersActivity", "word index 3: " + words.get(3));
        Log.v("NumbersActivity", "word index 4: " + words.get(4));
        Log.v("NumbersActivity", "word index 5: " + words.get(5));
        Log.v("NumbersActivity", "word index 6: " + words.get(6));
        Log.v("NumbersActivity", "word index 7: " + words.get(7));
        Log.v("NumbersActivity", "word index 8: " + words.get(8));
        Log.v("NumbersActivity", "word index 9: " + words.get(9));


//        // Create an array of words
//        String[] words = new String[10];
//
//        words[0] = "one";
//        words[1] = "two";
//        words[2] = "three";
//        words[3] = "four";
//        words[4] = "five";
//        words[5] = "six";
//        words[6] = "seven";
//        words[7] = "eight";
//        words[8] = "nine";
//        words[9] = "ten";
    }
}