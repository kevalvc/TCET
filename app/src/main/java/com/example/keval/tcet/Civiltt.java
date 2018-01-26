package com.example.keval.tcet;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.Toast;

import uk.co.senab.photoview.PhotoViewAttacher;

/**
 * Created by keval on 7/26/2017.
 */

public class Civiltt extends AppCompatActivity {

    ImageView imageViewcivil;
    String childClicked;
    PhotoViewAttacher photoAttacher1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.civiltt);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent z = getIntent();
        String[] division = new String[]{"Div A", "Div B"};

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, division);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        imageViewcivil = (ImageView) findViewById(R.id.imageViewcivil);

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

                            imageViewcivil.setImageResource(R.drawable.civiltt_fe_a);
                            imageViewcivil.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewcivil);
                            photoAttacher1.update();
                        }
                        else {

                            imageViewcivil.setImageResource(R.drawable.cmpntt_fe_b);
                            imageViewcivil.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewcivil);
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

                            imageViewcivil.setImageResource(R.drawable.civiltt_se_a);
                            imageViewcivil.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewcivil);
                            photoAttacher1.update();
                        }
                        else {

                            imageViewcivil.setImageResource(R.drawable.cmpntt_se_b);
                            imageViewcivil.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewcivil);
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

                        imageViewcivil.setImageResource(R.drawable.civiltt_te_a);
                        imageViewcivil.setAdjustViewBounds(true);
                        photoAttacher1 = new PhotoViewAttacher(imageViewcivil);
                        photoAttacher1.update();
                    }
                    else {

                        imageViewcivil.setImageResource(R.drawable.civiltt_te_b);
                        imageViewcivil.setAdjustViewBounds(true);
                        photoAttacher1 = new PhotoViewAttacher(imageViewcivil);
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

                            imageViewcivil.setImageResource(R.drawable.civiltt_be_a);
                            imageViewcivil.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewcivil);
                            photoAttacher1.update();
                        }
                        else {
                            imageViewcivil.setImageResource(R.drawable.civiltt_be_b);
                            imageViewcivil.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewcivil);
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
