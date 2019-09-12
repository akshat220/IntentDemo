package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class HelloYou extends AppCompatActivity {

    TextView txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_you);
        txt = (TextView) findViewById(R.id.textView);
        handleIntent();
    }

    public void handleIntent(){
        Intent j = getIntent();
        String s = j.getStringExtra("key").toString();
        txt.setText(s);
    }
}
