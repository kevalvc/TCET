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

public class Mechtt extends AppCompatActivity {

    ImageView imageViewmech;
    String childClicked;
    PhotoViewAttacher photoAttacher1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mechtt);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent z = getIntent();
        String[] division = new String[]{"Div A", "Div B"};

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, division);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        imageViewmech = (ImageView) findViewById(R.id.imageViewmech);

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

                            imageViewmech.setImageResource(R.drawable.mechtt_fe_a);
                            imageViewmech.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewmech);
                            photoAttacher1.update();
                        }
                        else {

                            imageViewmech.setImageResource(R.drawable.mechtt_fe_b);
                            imageViewmech.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewmech);
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

                            imageViewmech.setImageResource(R.drawable.mechtt_se_a);
                            imageViewmech.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewmech);
                            photoAttacher1.update();
                        }
                        else {

                            imageViewmech.setImageResource(R.drawable.mechtt_se_b);
                            imageViewmech.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewmech);
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

                        imageViewmech.setImageResource(R.drawable.mechtt_te_a);
                        imageViewmech.setAdjustViewBounds(true);
                        photoAttacher1 = new PhotoViewAttacher(imageViewmech);
                        photoAttacher1.update();
                    }
                    else {

                        imageViewmech.setImageResource(R.drawable.mechtt_te_b);
                        imageViewmech.setAdjustViewBounds(true);
                        photoAttacher1 = new PhotoViewAttacher(imageViewmech);
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

                            imageViewmech.setImageResource(R.drawable.mechtt_be_a);
                            imageViewmech.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewmech);
                            photoAttacher1.update();
                        }
                        else {
                            imageViewmech.setImageResource(R.drawable.mechtt_be_b);
                            imageViewmech.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewmech);
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
