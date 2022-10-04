package com.example.chooseyourownadventure;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    public static final int SCENARIO = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void option1(View view)
    {
        Intent intent = new Intent(this, MainActivity2.class);
        int scenarioNum = 10;
        intent.putExtra(String.valueOf(SCENARIO), scenarioNum);
        startActivity(intent);
    }

    public void option2(View view)
    {
        Intent intent = new Intent(this, MainActivity2.class);
        int scenarioNum = 30;
        intent.putExtra(String.valueOf(SCENARIO), scenarioNum);
        startActivity(intent);
    }

    public void option3(View view)
    {
        Intent intent = new Intent(this, MainActivity2.class);
        int scenarioNum = 1;
        intent.putExtra(String.valueOf(SCENARIO), scenarioNum);
        startActivity(intent);
    }

}