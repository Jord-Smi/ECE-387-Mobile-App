package com.example.smith367_ece387lab;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // How many times the button has been pressed
    int presses = 0;

    // Increment value and display
    public void updatePress(View view) {
        presses = presses + 1;
        display(presses);
    }
    // Reset press value and display
    public void resetPress(View view) {
        presses = 0;
        display(presses);
    }
    // Display the slowly incrementing value
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.button_receive);
        quantityTextView.setText("Pressed " + number + " times");
    }
}