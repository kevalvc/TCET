package com.example.keval.tcet;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.customtabs.CustomTabsIntent;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import static java.security.AccessController.getContext;

/**
 * Created by keval on 7/20/2017.
 */

public class CmpnDept extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cmpndept);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //Custom Tabs Builder
        CustomTabsIntent.Builder builder = new CustomTabsIntent.Builder();
        builder.setToolbarColor(Color.argb(1, 30, 52, 101));
        final CustomTabsIntent customTabsIntent = builder.build();
        customTabsIntent.intent.setPackage("com.android.chrome");

        final ExpandableListView exp2 = (ExpandableListView) findViewById(R.id.expListView);
        final LinkedHashMap<String, List<String>> expandableListDetail2 = ExpList2Data.getData();
        final List<String> expandableListTitle2 = new ArrayList<String>(expandableListDetail2.keySet());
        ExpandableListAdapter expandableListAdapter2 = new MyAdapter(getBaseContext(), expandableListTitle2, expandableListDetail2);

        exp2.setAdapter(expandableListAdapter2);

        exp2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String groupClicked2 = expandableListTitle2.get(i);
                Toast.makeText(getApplicationContext(), String.valueOf(i), Toast.LENGTH_SHORT);
            }
        });

        exp2.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {
//                Toast.makeText(getContext(),
//                        expandableListTitle.get(i) + " List Expanded.",
//                        Toast.LENGTH_SHORT).show();

                String groupClicked2 = expandableListTitle2.get(i);
//                Toast.makeText(getApplicationContext(), groupClicked2, Toast.LENGTH_LONG).show();

//                Log.i("AAAAAA", String.valueOf(i));

                if (groupClicked2.equals("Home")) {

                    Intent z = new Intent(getApplicationContext(), Webview.class);

                    z.putExtra("Url", "https://tcetmumbai.in/deptCompEngineering_deomhome.html"); //sends the data for CMPN
                    Log.i("BBBBBBBBBB", "https://tcetmumbai.in/deptCompEngineering_deomhome.html");
//                    startActivity(z);
                    customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/deptCompEngineering_deomhome.html"));

                    exp2.collapseGroup(0);

                }

            }
        });

        exp2.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText(getContext(),
//                        expandableListTitle.get(groupPosition) + " List Collapsed.",
//                        Toast.LENGTH_SHORT).show();

            }
        });

        exp2.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                String groupClicked2 = expandableListTitle2.get(groupPosition);
                String childClicked2 = expandableListDetail2.get(
                        expandableListTitle2.get(groupPosition)).get(
                        childPosition);

//                Toast.makeText(getApplicationContext(),expandableListTitle2.get(groupPosition)+ " -> "
//                            + expandableListDetail2.get(expandableListTitle2.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT
//                    ).show();


                if (groupClicked2.equals("About")) {

                    Intent z = new Intent(getBaseContext(), Webview.class);

                    Toast.makeText(getApplicationContext(), expandableListTitle2.get(groupPosition) + " -> "
                            + expandableListDetail2.get(expandableListTitle2.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT
                    ).show();

                    if (childClicked2 == "Mentor's Message") {

                        z.putExtra("Url", "https://tcetmumbai.in/Mentor's%20Message.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/Mentor's%20Message.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/Mentor's%20Message.html"));

                    } else if (childClicked2 == "HOD's Message") {

                        z.putExtra("Url", "https://tcetmumbai.in/Hod's%20Message.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/Hod's%20Message.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/Hod's%20Message.html"));

                    } else if (childClicked2 == "Resources") {

                        z.putExtra("Url", "https://tcetmumbai.in/cefacilitiesdemo.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/cefacilitiesdemo.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/cefacilitiesdemo.html"));

                    } else if (childClicked2 == "Committees") {

//                        z.putExtra("Url", "https://tcetmumbai.in/deptCompEngineering_Achivements.html");
//                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/deptCompEngineering_Achivements.html");
//                        startActivity(z);
                        Toast.makeText(getApplicationContext(), "Under Construction", Toast.LENGTH_SHORT).show();

                    } else if (childClicked2 == "Organogram") {

                        z.putExtra("Pdf", "https://tcetmumbai.in/ORGANOGRAM.pdf");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/ORGANOGRAM.pdf");
                        startActivity(z);

                    } else if (childClicked2 == "Achievements") {

                        z.putExtra("Url", "https://tcetmumbai.in/deptCompEngineering_Achivements.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/deptCompEngineering_Achivements.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/deptCompEngineering_Achivements.html"));

                    }

                } else if (groupClicked2.equals("Programs")) {

                    Intent z = new Intent(getApplicationContext(), Webview.class);

                    Toast.makeText(getApplicationContext(), expandableListTitle2.get(groupPosition) + " -> "
                            + expandableListDetail2.get(expandableListTitle2.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT
                    ).show();

                    if (childClicked2 == "Academic Planning") {

                        z.putExtra("Url", "https://tcetmumbai.in/CMPN%20academic%20planning.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/CMPN%20academic%20planning.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/CMPN%20academic%20planning.html"));

                    } else if (childClicked2 == "Bridge Courses") {

                        z.putExtra("Url", "https://tcetmumbai.in/CMPN%20BC.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/CMPN%20BC.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/CMPN%20BC.html"));

                    } else if (childClicked2 == "Modules") {

                        z.putExtra("Url", "https://tcetmumbai.in/CMPN%20modules.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/CMPN%20modules.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/CMPN%20modules.html"));

                    } else if (childClicked2 == "Schemes") {

                        z.putExtra("Url", "https://tcetmumbai.in/CMPN%20syllabus.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/CMPN%20syllabus.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/CMPN%20syllabus.html"));

                    }

                } else if (groupClicked2.equals("Students")) {

                    Intent z = new Intent(getApplicationContext(), Webview.class);

                    Toast.makeText(getApplicationContext(), expandableListTitle2.get(groupPosition) + " -> "
                            + expandableListDetail2.get(expandableListTitle2.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT
                    ).show();

                    if (childClicked2 == "Attendance") {

                        z.putExtra("Url", "https://tcetmumbai.in/CMPN%20attendance.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/CMPN%20attendance.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/CMPN%20attendance.html"));

                    } else if (childClicked2 == "Events") {

                        z.putExtra("Url", "https://tcetmumbai.in/CMPN%20events.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/CMPN%20events.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/CMPN%20events.html"));

                    } else if (childClicked2 == "CSI") {

                        z.putExtra("Url", "https://tcetmumbai.in/csiTCET_cmpn.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/csiTCET_cmpn.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/csiTCET_cmpn.html"));

                    } else if (childClicked2 == "Alumni") {

                        z.putExtra("url", "https://tcetmumbai.in/CMPN%20alumni.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/CMPN%20alumni.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/CMPN%20alumni.html"));

                    }

                } else if (groupClicked2.equals("Research")) {

                    Intent z = new Intent(getApplicationContext(), Webview.class);

                    Toast.makeText(getApplicationContext(), expandableListTitle2.get(groupPosition) + " -> "
                            + expandableListDetail2.get(expandableListTitle2.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT
                    ).show();

                    if (childClicked2 == "About Ph.D. Research Center") {

                        z.putExtra("Url", "https://tcetmumbai.in/phdrcmpn.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/phdrcmpn.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/phdrcmpn.html"));

                    } else if (childClicked2 == "Program Specific Research Domains") {

                        z.putExtra("Pdf", "https://tcetmumbai.in/Notice/CMPN/CMPN_AOS.pdf");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/Notice/CMPN/CMPN_AOS.pdf");
                        startActivity(z);

                    } else if (childClicked2 == "Case Studies") {

//                        z.putExtra("Url", "");
//                        Log.i("BBBBBBBBBB", "");
//                        startActivity(z);
                        Toast.makeText(getApplicationContext(), "Under Construction", Toast.LENGTH_SHORT);

                    } else if (childClicked2 == "Paper Publications") {

                        z.putExtra("Pdf", "https://tcetmumbai.in/publications/CMPN/TCET-CMPN%20Paper%20Publications%202012-15.pdf");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/publications/CMPN/TCET-CMPN%20Paper%20Publications%202012-15.pdf");
                        startActivity(z);

                    }

                } else if (groupClicked2.equals("OBE")) {

                    Intent z = new Intent(getApplicationContext(), Webview.class);

                    Toast.makeText(getApplicationContext(), expandableListTitle2.get(groupPosition) + " -> "
                            + expandableListDetail2.get(expandableListTitle2.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT
                    ).show();

                    if (childClicked2 == "Graduate Attribute") {

                        z.putExtra("Url", "https://tcetmumbai.in/CMPN%20GA.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/CMPN%20GA.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/CMPN%20GA.html"));

                    } else if (childClicked2 == "Program Educational Objectives") {

                        z.putExtra("Url", "https://tcetmumbai.in/CMPN%20PEO.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/CMPN%20PEO.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/CMPN%20PEO.html"));

                    } else if (childClicked2 == "Program Outcomes") {

                        z.putExtra("Url", "https://tcetmumbai.in/CMPN%20PO.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/CMPN%20PO.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/CMPN%20PO.html"));

                    } else if (childClicked2 == "Program Specific Outcomes") {

                        z.putExtra("Url", "https://tcetmumbai.in/CMPN%20PSO.html");
                        Log.i("BBBBBBBBBB", "https://tcetmumbai.in/CMPN%20PSO.html");
//                        startActivity(z);
                        customTabsIntent.launchUrl(CmpnDept.this, Uri.parse("https://tcetmumbai.in/CMPN%20PSO.html"));

                    }

                }
                return false;
            }
        });
    }
//        return view;
        @Override
        public boolean onSupportNavigateUp() {
            onBackPressed();
            return true;
        }


}
