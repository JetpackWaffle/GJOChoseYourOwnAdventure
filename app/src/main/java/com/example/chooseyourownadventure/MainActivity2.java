package com.example.chooseyourownadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    public int scenarioNum = 0;
    public int item = 0;
    // 0 - nothing; 1 - screen; 2 - box; 3 - mints; 4 - bear

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        scenarioNum = Integer.parseInt(intent.getStringExtra(String.valueOf(MainActivity.SCENARIO)));

        TextView textView = findViewById(R.id.textView);
        switch (scenarioNum)
        {
            case 1:

                textView.setText(R.string.SC01);
                break;
            case 10:
                textView.setText(R.string.SC10);
                break;
            case 30:
                textView.setText(R.string.SC30);
                break;
        }
    }
}