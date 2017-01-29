package com.example.andra.sendinglove;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Set whether a custom view should be displayed, if set.
        getSupportActionBar().setDisplayShowCustomEnabled(true);
        //Set whether an activity title/subtitle should be displayed.
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        TextView v = (TextView) getLayoutInflater().inflate(R.layout.custom_title_view, null);

        getSupportActionBar().setCustomView(v);
    }

}
