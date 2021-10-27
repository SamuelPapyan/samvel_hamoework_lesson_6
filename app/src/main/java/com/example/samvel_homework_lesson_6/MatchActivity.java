package com.example.samvel_homework_lesson_6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.SwitchCompat;

public class MatchActivity extends AppCompatActivity {
    private SwitchCompat match_alerts_switch;
    private SwitchCompat fav_match_switch;
    private SwitchCompat fav_league_switch;
    private AppCompatTextView preferences;
    private AppCompatTextView football;
    private AppCompatTextView tennis;
    private AppCompatTextView basketball;
    private AppCompatTextView hockey;
    private AppCompatTextView cricket;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notifications);
        match_alerts_switch = findViewById(R.id.match_alerts_switch);
        fav_match_switch = findViewById(R.id.fav_match_switch);
        fav_league_switch = findViewById(R.id.fav_league_switch);
        preferences = findViewById(R.id.preferences);
        football = findViewById(R.id.football);
        tennis = findViewById(R.id.tennis);
        basketball = findViewById(R.id.basketball);
        hockey = findViewById(R.id.hockey);
        cricket = findViewById(R.id.cricket);
    }
}
