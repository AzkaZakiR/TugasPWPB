package com.example.intentparcelable;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Activity_move_with_data extends AppCompatActivity {

    public static String EXTRA_AGE = "extra age";
    public static String EXTRA_NAME = "extra name";
    private TextView tvDataReceived;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);
        tvDataReceived = (TextView)findViewById(R.id.tv_data_received);
        String name = getIntent().getStringExtra(EXTRA_NAME);
        String age = getIntent().getStringExtra(EXTRA_AGE);
        String text = "Name : "+name+"\n"+", Your Age : "+age;
        tvDataReceived.setText(text);
    }
}