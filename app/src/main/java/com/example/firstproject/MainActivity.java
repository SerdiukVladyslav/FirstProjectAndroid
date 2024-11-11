package com.example.firstproject;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewResult;
    private Button buttonGenerate;
    private Random random;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewResult = findViewById(R.id.textViewResult);
        buttonGenerate = findViewById(R.id.buttonGenerate);
        random = new Random();

        buttonGenerate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomNumber = random.nextInt(11);  // Генеруємо число від 0 до 10
                textViewResult.setText(String.valueOf(randomNumber));
            }
        });
    }
}
