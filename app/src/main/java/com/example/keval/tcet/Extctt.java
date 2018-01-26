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
import android.widget.SpinnerAdapter;
import android.widget.Toast;

import uk.co.senab.photoview.PhotoViewAttacher;

import static com.example.keval.tcet.R.layout.cmpntt;

/**
 * Created by keval on 7/26/2017.
 */

public class Extctt extends AppCompatActivity {

    ImageView imageViewextc;
    String childClicked;
    PhotoViewAttacher photoAttacher1;
    Spinner spinner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.extctt);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent z = getIntent();
        String[] division = new String[]{"Div A",   "Div B"};

        spinner = (Spinner) findViewById(R.id.spinner);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_spinner_item, division);
        arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(arrayAdapter);

        imageViewextc = (ImageView) findViewById(R.id.imageViewextc);

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

                            imageViewextc.setImageResource(R.drawable.extctt_fe_a);
                            imageViewextc.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewextc);
                            photoAttacher1.update();
                        }
                        else {

                            imageViewextc.setImageResource(R.drawable.extctt_fe_b);
                            imageViewextc.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewextc);
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

                            imageViewextc.setImageResource(R.drawable.extctt_se_a);
                            imageViewextc.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewextc);
                            photoAttacher1.update();
                        }
                        else {

                            imageViewextc.setImageResource(R.drawable.extctt_se_b);
                            imageViewextc.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewextc);
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

                        imageViewextc.setImageResource(R.drawable.extctt_te_a);
                        imageViewextc.setAdjustViewBounds(true);
                        photoAttacher1 = new PhotoViewAttacher(imageViewextc);
                        photoAttacher1.update();
                    }
                    else {

                        imageViewextc.setImageResource(R.drawable.extctt_te_b);
                        imageViewextc.setAdjustViewBounds(true);
                        photoAttacher1 = new PhotoViewAttacher(imageViewextc);
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

                            imageViewextc.setImageResource(R.drawable.extctt_be_a);
                            imageViewextc.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewextc);
                            photoAttacher1.update();
                        }
                        else {

                            imageViewextc.setImageResource(R.drawable.extctt_be_b);
                            imageViewextc.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewextc);
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
