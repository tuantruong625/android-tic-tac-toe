package com.example.ttassignment01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button aButtons[][] = new Button[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        aButtons[0][0] = findViewById(R.id.btnCell00);
        aButtons[0][1] = findViewById(R.id.btnCell01);
        aButtons[0][2] = findViewById(R.id.btnCell02);
        aButtons[1][0] = findViewById(R.id.btnCell10);
        aButtons[1][1] = findViewById(R.id.btnCell11);
        aButtons[1][2] = findViewById(R.id.btnCell12);
        aButtons[2][0] = findViewById(R.id.btnCell20);
        aButtons[2][1] = findViewById(R.id.btnCell21);
        aButtons[2][2] = findViewById(R.id.btnCell23);
    }
}
