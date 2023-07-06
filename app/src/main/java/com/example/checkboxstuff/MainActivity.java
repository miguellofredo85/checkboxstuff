package com.example.checkboxstuff;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox ch1, ch2;
        Button button;
        RadioGroup radioGroup;
        ch1        = findViewById(R.id.checkBox);
        ch2        = findViewById(R.id.checkBox2);
        button     = findViewById(R.id.button);
        radioGroup = findViewById(R.id.radioGroup);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ch1.isChecked() && ch2.isChecked()){
                    Toast.makeText(MainActivity.this, ch1.getText() + " " +ch2.getText(), Toast.LENGTH_LONG).show();
                } else if (ch2.isChecked()) {
                    Toast.makeText(MainActivity.this, ch2.getText(), Toast.LENGTH_SHORT).show();
                } else if (ch1.isChecked()) {
                    Toast.makeText(MainActivity.this, ch1.getText(), Toast.LENGTH_LONG).show();

                } else{
                    Toast.makeText(MainActivity.this, "Nothing selected", Toast.LENGTH_LONG).show();
                }

            radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
                @Override
                public void onCheckedChanged(RadioGroup radioGroup, int checked) {
                    RadioButton radioButton = findViewById(checked);
                    Toast.makeText(MainActivity.this, radioButton.getText(), Toast.LENGTH_LONG).show();
                }
            });
            }

        });
    }

}