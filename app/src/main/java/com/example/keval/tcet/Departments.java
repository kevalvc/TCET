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

public class Departments extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.department);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent x = getIntent();

        //Custom Tabs Builder
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(Color.argb(1, 30, 52, 101));
        final CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.intent.setPackage("com.android.chrome");

        final Intent z = new Intent(getApplicationContext(), Webview.class);

        ListView l1 = (ListView) findViewById(R.id.listview1);
        ArrayList<String> arrayList = new ArrayList<>();
        ArrayAdapter<String> acadlist = new ArrayAdapter<String>(getBaseContext(), android.R.layout.simple_list_item_1, arrayList);
        arrayList.add("CMPN");
        arrayList.add("IT");
        arrayList.add("EXTC");
        arrayList.add("ETRX");
        arrayList.add("MECH");
        arrayList.add("CIVIL");
        arrayList.add("H&S");

        l1.setAdapter(acadlist);
        l1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i) {
                    case 0:
                        Intent x = new Intent(getApplicationContext(), CmpnDept.class);
//                        x.putExtra("Url", "https://tcetmumbai.in/deptCompEngineering_deomhome.html");
                        startActivity(x);

                        break;
                    case 1:
                        z.putExtra("Url", "https://tcetmumbai.in/deptInformationTechnology.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Departments.this, Uri.parse("https://tcetmumbai.in/deptInformationTechnology.html"));

                        break;
                    case 2:
                        z.putExtra("Url", "https://tcetmumbai.in/deptExTc.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Departments.this, Uri.parse("https://tcetmumbai.in/deptExTc.html"));

                        break;
                    case 3:
                        z.putExtra("Url", "https://tcetmumbai.in/deptElectronicEngg.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Departments.this, Uri.parse("https://tcetmumbai.in/deptElectronicEngg.html"));

                        break;
                    case 4:
                        z.putExtra("Url", "https://tcetmumbai.in/deptmechanical.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Departments.this, Uri.parse("https://tcetmumbai.in/deptmechanical.html"));

                        break;
                    case 5:
                        z.putExtra("Url", "https://tcetmumbai.in/deptcivilengg.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Departments.this, Uri.parse("https://tcetmumbai.in/deptcivilengg.html"));

                        break;
                    case 6:
                        z.putExtra("Url", "https://tcetmumbai.in/deptHumanitiesSci.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(Departments.this, Uri.parse("https://tcetmumbai.in/deptHumanitiesSci.html"));
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
