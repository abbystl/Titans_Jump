package com.example.titans_jump;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;

public class MainActivity extends ComponentActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton startButton = findViewById(R.id.start_btn);
        startButton.setOnClickListener(v -> startGame());

        ImageButton optionButton = findViewById(R.id.opt_btn);
        optionButton.setOnClickListener(v -> optionGame());

        ImageButton settingButton = findViewById(R.id.setting_icon);
        settingButton.setOnClickListener(v -> settingsGame());
    }

    private void startGame() {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    private void optionGame() {
        Intent intent = new Intent(this, OptionActivity.class);
        startActivity(intent);
    }

    private void settingsGame() {
        Intent intent = new Intent(this, OptionActivity.class);
        startActivity(intent);
    }

    public static class OptionActivity {
    }
}
