package com.example.android.miwok;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // find the view that show numbers category
        TextView numbers = (TextView)findViewById(R.id.numbers);
        // Set a clickListener on that view

        numbers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // creat new intent for open (( numbeersActivity
                Intent numbersIntent = new Intent(MainActivity.this,NumbersActivity.class);
                // Start to new Activity
                startActivity(numbersIntent);
            }
        });

    }
}