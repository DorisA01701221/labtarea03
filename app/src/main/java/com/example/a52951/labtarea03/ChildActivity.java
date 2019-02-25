package com.example.a52951.labtarea03;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ChildActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        Intent targetIntent;
        targetIntent = getIntent();
        String myText;
        myText = targetIntent.getStringExtra("myData");
        TextView myTextView;
        myTextView = (TextView)findViewById(R.id.textView2);
        myTextView.setText(myText);

    }
}