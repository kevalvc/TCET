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

/**
 * Created by keval on 7/26/2017.
 */

public class Etrxtt extends AppCompatActivity {

    ImageView imageViewextc;
    String childClicked;
    PhotoViewAttacher photoAttacher1;
    Spinner spinner;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.etrxtt);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent z = getIntent();
        String[] division = new String[]{"Div A", "Div B"};

        imageViewextc = (ImageView) findViewById(R.id.imageViewextc);

        childClicked = z.getStringExtra("year");
        Log.i("BBBBBBBBBB", childClicked);

        switch (childClicked) {
            case "FE":

//                Toast.makeText(getApplicationContext(), "TimeTable Unavailable", Toast.LENGTH_LONG).show();
//                Log.i("hey", "FE");

                imageViewextc.setImageResource(R.drawable.etrxtt_fe);
                imageViewextc.setAdjustViewBounds(true);
                photoAttacher1 = new PhotoViewAttacher(imageViewextc);
                photoAttacher1.update();

                break;
            case "SE":
                            imageViewextc.setImageResource(R.drawable.etrxtt_se);
                            imageViewextc.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewextc);
                            photoAttacher1.update();
                break;
            case "TE":
                            imageViewextc.setImageResource(R.drawable.etrxtt_te);
                            imageViewextc.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewextc);
                            photoAttacher1.update();
                break;
            case "BE":
                            imageViewextc.setImageResource(R.drawable.etrxtt_be);
                            imageViewextc.setAdjustViewBounds(true);
                            photoAttacher1 = new PhotoViewAttacher(imageViewextc);
                            photoAttacher1.update();
                break;
        }

    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
