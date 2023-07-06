package com.example.checkboxstuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox ch1, ch2;
        Button button;
        ch1 = findViewById(R.id.checkBox);
        ch2 = findViewById(R.id.checkBox2);
        button = findViewById(R.id.button);
        String textCh1 = ch1.getText().toString();
        String textCh2 = ch2.getText().toString();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ch1.isChecked() && ch2.isChecked()){
                    Toast.makeText(MainActivity.this, textCh1 + " " +textCh2, Toast.LENGTH_LONG).show();
                } else if (ch2.isChecked()) {
                    Toast.makeText(MainActivity.this, textCh2, Toast.LENGTH_SHORT).show();
                } else if (ch1.isChecked()) {
                    Toast.makeText(MainActivity.this, textCh1, Toast.LENGTH_LONG).show();

                } else{
                    Toast.makeText(MainActivity.this, "Nothing selected", Toast.LENGTH_LONG).show();
                }
            }
        });
    }

}