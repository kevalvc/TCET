package com.example.keval.tcet;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.Toast;

import uk.co.senab.photoview.PhotoViewAttacher;

import static android.R.attr.width;
import static com.example.keval.tcet.R.attr.height;
import static com.example.keval.tcet.R.layout.cmpntt;

/**
 * Created by keval on 7/26/2017.
 */

public class Cmpntt extends AppCompatActivity {

    ImageView imageViewcmpn;
    String childClicked;
    PhotoViewAttacher photoAttacher1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(cmpntt);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent z = getIntent();
        String[] division = new String[]{"Div A", "Div B"};

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, division);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        imageViewcmpn = (ImageView) findViewById(R.id.imageViewcmpn);

        childClicked = z.getStringExtra("year");
        Log.i("BBBBBBBBBB", childClicked);

        switch (childClicked) {
            case "FE":

//                Toast.makeText(getApplicationContext(), "TimeTable Unavailable", Toast.LENGTH_LONG).show();
//                Log.i("hey", "FE");

                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        if (adapterView.getItemAtPosition(i).equals("Div A")) {

                            imageViewcmpn.setImageResource(R.drawable.cmpntt_fe_a);
                            imageViewcmpn.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewcmpn);
                            photoAttacher1.update();
                        }
                        else {

                            imageViewcmpn.setImageResource(R.drawable.cmpntt_fe_b);
                            imageViewcmpn.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewcmpn);
                            photoAttacher1.update();

                        }
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {
                        Toast.makeText(getApplicationContext(), "Choose the Division", Toast.LENGTH_SHORT).show();
                    }
                });

                break;
            case "SE":
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        if (adapterView.getItemAtPosition(i).equals("Div A")) {

                            imageViewcmpn.setImageResource(R.drawable.cmpntt_se_a);
                            imageViewcmpn.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewcmpn);
                            photoAttacher1.update();
                        }
                        else {

                            imageViewcmpn.setImageResource(R.drawable.cmpntt_se_b);
                            imageViewcmpn.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewcmpn);
                            photoAttacher1.update();

                        }
                    }
                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {
                        Toast.makeText(getApplicationContext(), "Choose the Division", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
            case "TE":

                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    if (adapterView.getItemAtPosition(i).equals("Div A")) {

                        imageViewcmpn.setImageResource(R.drawable.cmpntt_te_a);
                        imageViewcmpn.setAdjustViewBounds(true);
                        photoAttacher1 = new PhotoViewAttacher(imageViewcmpn);
                        photoAttacher1.update();
                    }
                    else {

                        imageViewcmpn.setImageResource(R.drawable.cmpntt_te_b);
                        imageViewcmpn.setAdjustViewBounds(true);
                        photoAttacher1 = new PhotoViewAttacher(imageViewcmpn);
                        photoAttacher1.update();

                    }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {
                        Toast.makeText(getApplicationContext(), "Choose the Division", Toast.LENGTH_SHORT).show();
                    }
                });
                break;

            case "BE":
                spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
                    @Override
                    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                        if (adapterView.getItemAtPosition(i).equals("Div A")) {

                            imageViewcmpn.setImageResource(R.drawable.cmpntt_be_a);
                            imageViewcmpn.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewcmpn);
                            photoAttacher1.update();
                        }
                        else {

                            imageViewcmpn.setImageResource(R.drawable.cmpntt_be_b);
                            imageViewcmpn.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewcmpn);
                            photoAttacher1.update();

                        }
                    }

                    @Override
                    public void onNothingSelected(AdapterView<?> adapterView) {
                        Toast.makeText(getApplicationContext(), "Choose the Division", Toast.LENGTH_SHORT).show();
                    }
                });
                break;
        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}