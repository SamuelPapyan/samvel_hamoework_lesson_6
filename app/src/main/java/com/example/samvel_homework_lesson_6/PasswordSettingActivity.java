package com.example.samvel_homework_lesson_6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;

public class PasswordSettingActivity extends AppCompatActivity {
    private AppCompatTextView change_pass;
    private SwitchCompat set_pin_switch;
    private SwitchCompat close_block_switch;
    private AppCompatTextView change_lang;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settings);
        change_pass = findViewById(R.id.change_pass);
        set_pin_switch = findViewById(R.id.set_pin_switch);
        close_block_switch = findViewById(R.id.close_block_switch);
        change_lang = findViewById(R.id.change_lang);
    }
}
