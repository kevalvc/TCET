package com.example.keval.tcet;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;

import static com.example.keval.tcet.R.color.colorPrimary;

/**
 * Created by keval on 7/27/2017.
 */

public class Academics extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.academics);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent x = getIntent();

        final Intent z = new Intent(getApplicationContext(), Webview.class);

        //Custom Tabs Builder
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(Color.argb(1, 30, 52, 101));
        final CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.intent.setPackage("com.android.chrome");

        ListView l1 = (ListView) findViewById(R.id.listview);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter<String> acadlist = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, arrayList);
        arrayList.add("About Academics");
        arrayList.add("Exam Notifications");
        arrayList.add("Syllabus");
        arrayList.add("Public Holidays");
        arrayList.add("Faculty Book Publications");
        arrayList.add("Faculty Paper Publications");
        arrayList.add("Grad Attributes");

        l1.setAdapter(acadlist);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        z.putExtra("Url", "https://tcetmumbai.in/aboutacademics1.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Academics.this, Uri.parse("https://tcetmumbai.in/aboutacademics1.html"));

                        break;
                    case 1:
                        z.putExtra("Url", "https://tcetmumbai.in/examnotification.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Academics.this, Uri.parse("https://tcetmumbai.in/examnotification.html"));

                        break;
                    case 2:
                        z.putExtra("Url", "https://tcetmumbai.in/downloads.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Academics.this, Uri.parse("https://tcetmumbai.in/downloads.html"));

                        break;
                    case 3:
                        z.putExtra("Pdf", "https://tcetmumbai.in/Notice/Holiday%20lsit%202016.pdf");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Academics.this, Uri.parse("https://tcetmumbai.in/Notice/Holiday%20lsit%202016.pdf"));

                        break;
                    case 4:
                        z.putExtra("Pdf", "https://tcetmumbai.in/publications/TCET%20Book%20Publication%202012%20to%202014.pdf");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Academics.this, Uri.parse("https://tcetmumbai.in/publications/TCET%20Book%20Publication%202012%20to%202014.pdf"));

                        break;
                    case 5:
                        z.putExtra("Pdf", "https://tcetmumbai.in/publications/TCET%20Paper%20Publication%202012%20to%202014.pdf");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Academics.this, Uri.parse("https://tcetmumbai.in/publications/TCET%20Paper%20Publication%202012%20to%202014.pdf"));

                        break;
                    case 6:
                        z.putExtra("Url", "https://tcetmumbai.in/ega.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Academics.this, Uri.parse("https://tcetmumbai.in/ega.html"));

                        break;
                }
            }
        });
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
}
