package com.example.intentdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText edt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt = (EditText) findViewById(R.id.name);
    }
    public void passingInfo(View view){
        Intent i = new Intent(this, HelloYou.class);
        String s = edt.getText().toString();
        i.putExtra("key", s);
        startActivity(i);
    }

    public void showWebPage(View v){
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lnmiit.ac.in/"));
        startActivity(i);

    }
}
