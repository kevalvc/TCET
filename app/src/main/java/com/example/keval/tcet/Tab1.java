package com.example.keval.tcet;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ExpandableListAdapter;
import android.widget.ExpandableListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;

/**
 * Created by keval on 7/20/2017.
 */

public class Tab1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.tab1, container, false);

        ExpandableListView exp = (ExpandableListView) view.findViewById(R.id.expListView);
        final LinkedHashMap<String, List<String>> expandableListDetail = ExpandableListDataPump.getData();
        final List<String> expandableListTitle = new ArrayList<String>(expandableListDetail.keySet());
        ExpandableListAdapter expandableListAdapter = new MyAdapter(getContext(), expandableListTitle, expandableListDetail);

        exp.setAdapter(expandableListAdapter);
        exp.setOnGroupExpandListener(new ExpandableListView.OnGroupExpandListener() {
            @Override
            public void onGroupExpand(int i) {
//                Toast.makeText(getContext(),
//                        expandableListTitle.get(i) + " List Expanded.",
//                        Toast.LENGTH_SHORT).show();
            }
        });

        exp.setOnGroupCollapseListener(new ExpandableListView.OnGroupCollapseListener() {

            @Override
            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText(getContext(),
//                        expandableListTitle.get(groupPosition) + " List Collapsed.",
//                        Toast.LENGTH_SHORT).show();

            }
        });

        exp.setOnChildClickListener(new ExpandableListView.OnChildClickListener() {
            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {

                String groupClicked = expandableListTitle.get(groupPosition);
                String childClicked = expandableListDetail.get(
                        expandableListTitle.get(groupPosition)).get(
                        childPosition);

                if (groupClicked.equals("CMPN")) {

                    Intent z = new Intent(getActivity(), Cmpntt.class);

                    Toast.makeText(getContext(),expandableListTitle.get(groupPosition)+ " -> "
                            + expandableListDetail.get(expandableListTitle.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT
                    ).show();

                    z.putExtra("year", childClicked); //sends the data i.e. SE, TE, BE for CMPN
                    Log.i("BBBBBBBBBB", childClicked);
                    startActivity(z);

                } else if (groupClicked.equals("IT")) {

                    Intent z = new Intent(getActivity(), Ittt.class);

                    Toast.makeText(getContext(),expandableListTitle.get(groupPosition)+ " -> "
                            + expandableListDetail.get(expandableListTitle.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT
                    ).show();

                    z.putExtra("year", childClicked); //sends the data i.e. SE, TE, BE for IT
                    Log.i("BBBBBBBBBB", childClicked);
                    startActivity(z);

                } else if (groupClicked.equals("EXTC")) {

                    Intent z = new Intent(getActivity(), Extctt.class);

                    Toast.makeText(getContext(),expandableListTitle.get(groupPosition)+ " -> "
                            + expandableListDetail.get(expandableListTitle.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT
                    ).show();

                    z.putExtra("year", childClicked); //sends the data i.e. SE, TE, BE for EXTC
                    Log.i("BBBBBBBBBB", childClicked);
                    startActivity(z);

                } else if (groupClicked.equals("ETRX")) {

                    Intent z = new Intent(getActivity(), Etrxtt.class);

                    Toast.makeText(getContext(),expandableListTitle.get(groupPosition)+ " -> "
                            + expandableListDetail.get(expandableListTitle.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT
                    ).show();

                    z.putExtra("year", childClicked); //sends the data i.e. SE, TE, BE for ETRX
                    Log.i("BBBBBBBBBB", childClicked);
                    startActivity(z);

                } else if (groupClicked.equals("MECH")) {

                    Intent z = new Intent(getActivity(), Mechtt.class);

                    Toast.makeText(getContext(),expandableListTitle.get(groupPosition)+ " -> "
                            + expandableListDetail.get(expandableListTitle.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT
                    ).show();

                    z.putExtra("year", childClicked); //sends the data i.e. SE, TE, BE for Mech
                    Log.i("BBBBBBBBBB", childClicked);
                    startActivity(z);

                } else if (groupClicked.equals("CIVIL")) {

                    Intent z = new Intent(getActivity(), Civiltt.class);

                    Toast.makeText(getContext(),expandableListTitle.get(groupPosition)+ " -> "
                            + expandableListDetail.get(expandableListTitle.get(groupPosition)).get(childPosition), Toast.LENGTH_SHORT
                    ).show();

                    z.putExtra("year", childClicked); //sends the data i.e. SE, TE, BE for Civil
                    Log.i("BBBBBBBBBB", childClicked);
                    startActivity(z);

                }
                return false;
            }
        });

        return view;
    }


}
