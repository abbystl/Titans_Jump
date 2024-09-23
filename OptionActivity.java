package com.example.titans_jump;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageButton;
import androidx.activity.ComponentActivity;

public class OptionActivity {
    public class MainActivity extends ComponentActivity {
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.character_selection);
        }
    }
}