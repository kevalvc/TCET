package com.example.keval.tcet;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.customtabs.CustomTabsIntent;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by keval on 7/27/2017.
 */

public class Events extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.events);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent x = getIntent();

        final Intent z = new Intent(getApplicationContext(), Webview.class);

        //Custom Tabs Builder
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(Color.argb(1, 30, 52, 101));
        final CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.intent.setPackage("com.android.chrome");

        ListView l1 = (ListView) findViewById(R.id.listview1);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter<String> acadlist = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, arrayList);
        arrayList.add("Zephyr");
        arrayList.add("T-Spark");
        arrayList.add("Enertia");
        arrayList.add("Sojourn");
        arrayList.add("Multicon");


        l1.setAdapter(acadlist);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        z.putExtra("Url", "https://tcetmumbai.in/zypher16.1.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Events.this, Uri.parse("https://tcetmumbai.in/zypher16.1.html"));

                        break;
                    case 1:
                        z.putExtra("Url", "https://tcetmumbai.in/Tspark17.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Events.this, Uri.parse("https://tcetmumbai.in/Tspark17.html"));

                        break;
                    case 2:
                        z.putExtra("Url", "https://tcetmumbai.in/Enertia17.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Events.this, Uri.parse("https://tcetmumbai.in/Enertia17.html"));

                        break;
                    case 3:
                        z.putExtra("Url", "https://tcetmumbai.in/Sojourn17.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Events.this, Uri.parse("https://tcetmumbai.in/Sojourn17.html"));

                        break;
                    case 4:
                        z.putExtra("Url", "http://www.multiconw.co.in/");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Events.this, Uri.parse("http://www.multiconw.co.in/"));

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
