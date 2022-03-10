package ru.mirea.lebedeva.practice1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cringe);
        TextView myTextView = (TextView) findViewById(R.id.textView);
        Button button = findViewById(R.id.button13);
        CheckBox checkBox = findViewById(R.id.checkBox);
        myTextView.setText("New text in MIREA");
        button.setText("MireaButton");
        checkBox.setChecked(true);
    }
}