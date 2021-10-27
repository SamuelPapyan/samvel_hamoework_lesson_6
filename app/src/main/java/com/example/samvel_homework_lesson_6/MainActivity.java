package com.example.samvel_homework_lesson_6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import androidx.appcompat.widget.AppCompatTextView;

import android.os.Bundle;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    private AppCompatRadioButton spicy;
    private AppCompatRadioButton original;
    private AppCompatCheckBox cheese1;
    private AppCompatCheckBox cheese2;
    private AppCompatCheckBox cheese3;
    private AppCompatTextView comment_box;
    private AppCompatButton add_to_cart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.twister);
        spicy = findViewById(R.id.type_spicy);
        original = findViewById(R.id.type_original);
        cheese1 = findViewById(R.id.cheese1);
        cheese2 = findViewById(R.id.cheese2);
        cheese3 = findViewById(R.id.cheese3);
        comment_box = findViewById(R.id.comment_box);
        add_to_cart = findViewById(R.id.add_to_cart);
    }

}