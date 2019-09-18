package com.ac.achan.birthdaycard;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

/**
 * Birthday Card Created by Albert Chan
 */

public class MainActivity extends AppCompatActivity {
    private TextView upperTitle;
    private TextView lowerTitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        upperTitle = (TextView) findViewById(R.id.upperTitle);
        lowerTitle = (TextView) findViewById(R.id.lowerTitle);

        upperTitle.setText("Happy Birthday, Taissa");
        lowerTitle.setText("From, Albert");
    }
}
