package com.example.keval.tcet;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by keval on 7/20/2017.
 */

public class Tab2 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab2, container, false);

        TextView t2 = (TextView) view.findViewById(R.id.textView2);

        t2.setText("\n\nThakur College of Engineering & Technology (TCET) was established in the Academic year 2001-02 with a clear objective of providing quality technical education in tune with international standards and contemporary global requirements. \n\n" +
                "The College is recognized by All India Council for Technical Education (AICTE) & Govt. of Maharashtra and is affiliated to the University of Mumbai (UOM). All the courses at the U.G. level, eligible for accreditation in 2011 i.e. Electronics & Telecommunication (EXTC), Information Technology, IT and Computer Engineering CMPN) were accredited by NBA for three years w.e.f. 16.9.2011. Moreover, these programmes are also given permanent affiliation w.e.f. A.Y. 2015-16 onwards.\n");

        return view;
    }
}
