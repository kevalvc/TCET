package com.example.keval.tcet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by keval on 8/11/2017.
 */

public class FinalPointer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.finalpointer);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        TextView t9 = (TextView) findViewById(R.id.textView18);
        TextView t10 = (TextView) findViewById(R.id.textView17);


        Intent z = getIntent();

        boolean isPassed = z.getBooleanExtra("isPassed", false);
        String abc = z.getStringExtra("pointer");

        if (isPassed == true) {
            if (abc != null) {
                t9.setText(abc.toString());
            } else {
                t9.setText("Not Available");
            }
        } else if (isPassed == false) {
            t10.setText("SORRY");
            t9.setText("Not Passed :(");
        }

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
