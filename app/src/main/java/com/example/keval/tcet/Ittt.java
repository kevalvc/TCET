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

import static com.example.keval.tcet.R.layout.cmpntt;
import static com.example.keval.tcet.R.layout.ittt;

/**
 * Created by keval on 7/26/2017.
 */

public class Ittt extends AppCompatActivity {

    ImageView imageViewit;
    String childClicked;
    PhotoViewAttacher photoAttacher1;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ittt);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent z = getIntent();
        String[] division = new String[]{"Div A", "Div B"};

        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, division);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        imageViewit = (ImageView) findViewById(R.id.imageViewit);

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

                            imageViewit.setImageResource(R.drawable.ittt_fe_a);
                            imageViewit.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewit);
                            photoAttacher1.update();
                        }
                        else {

                            imageViewit.setImageResource(R.drawable.ittt_fe_b);
                            imageViewit.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewit);
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

                            imageViewit.setImageResource(R.drawable.ittt_se_a);
                            imageViewit.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewit);
                            photoAttacher1.update();
                        }
                        else {

                            imageViewit.setImageResource(R.drawable.ittt_se_b);
                            imageViewit.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewit);
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

                        imageViewit.setImageResource(R.drawable.ittt_te_a);
                        imageViewit.setAdjustViewBounds(true);
                        photoAttacher1 = new PhotoViewAttacher(imageViewit);
                        photoAttacher1.update();
                    }
                    else {

                        imageViewit.setImageResource(R.drawable.ittt_te_b);
                        imageViewit.setAdjustViewBounds(true);
                        photoAttacher1 = new PhotoViewAttacher(imageViewit);
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

                            imageViewit.setImageResource(R.drawable.ittt_be_a);
                            imageViewit.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewit);
                            photoAttacher1.update();
                        }
                        else {
                            imageViewit.setImageResource(R.drawable.ittt_be_b);
                            imageViewit.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewit);
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
