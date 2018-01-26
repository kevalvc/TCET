package com.example.keval.tcet;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by keval on 7/22/2017.
 */

public class Creditspage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.credits);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent i = getIntent();

        TextView textView = (TextView) findViewById(R.id.textView3);
//        textView.setText("Developed By: \nKeval Chavda \nAdwait Arayakandy\nUnder the guidance of Mr. Anand Khandare \n\nWe are open for all kinds of suggestions for improvement.\n\nCMPN Batch of 2019\n");
        textView.setText("Developed By: \nKeval Chavda \nAdwait Arayakandy \n\nWe are open for all kinds of suggestions for improvement.\n\nCMPN Batch of 2019\n");

//        return view;
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}

