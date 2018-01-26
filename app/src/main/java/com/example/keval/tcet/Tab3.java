package com.example.keval.tcet;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by keval on 7/20/2017.
 */

public class Tab3 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.tab3, container, false);

//        String wel = "Welcome";
//        String ent = "CET is one of the premier institutions under the umbrella of Thakur Education Group (TEG). The institute’s aim is to nurture young talents in the field of engineering and technology as per global needs. Therefore, apart from teaching the university prescribed syllabus, TCET also works on meeting professional practices and industry requirements by conducting workshops, training and value added courses on technical and life skills.\n";
//        String mid = "The management’s commitment to excellence and relevance in technical education is reflected in the marvelous infrastructure that is comparable to the finest institution of its type in the country. The imposing five-storied building, housing state-of-the-art computer laboratories, spacious classrooms, well equipped laboratories, workshops, computer centre with server room, a well-stocked library, wide and well lit clean corridors and a large canteen, conference hall, seminar halls has set new standards in providing facilities of international level.\n";
//        String end = "Application of modern technology in teaching- learning process and effective day-to-day governance of the college makes TCET unique. Key initiatives like teacherguardian scheme, book bank scheme, induction of resource books, yearly organisation of events (like Multicon-W, technical and cultural festivals etc.) make TCET an institute with a difference. Thus, within just 15 years of its existence, TCET has carved out a niche for itself as one of the leading engineering Colleges under Thakur Education Group and University of Mumbai.";

        ImageView imageView = (ImageView) view.findViewById(R.id.imageView10);
        final Intent z = new Intent(getActivity(), Webview.class);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String pdf = "https://www.google.co.in/maps/place/Thakur+College+of+Engineering+Technology,+Ram+Singh+Rd,+Thakur,+Thakur+Village,+Kandivali+East,+Mumbai,+Maharashtra+400101/@19.2060945,72.872438,17z/data=!3m1!4b1!4m5!3m4!1s0x3be7b747581cc2c3:0xbe5c98d18fa2d5ff!8m2!3d19.2061342!4d72.8745324";
                Intent intent = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse(pdf));
                startActivity(intent);
//                z.putExtra("Maps", "pdf");
//                startActivity(z);

            }
        });
////        t6.setText(wel);
////        t6.setTextSize(27);
////        LayoutParams params1 = (LayoutParams) t6.getLayoutParams();
////        params1.width = LayoutParams.MATCH_PARENT;
////        params1.height = LayoutParams.MATCH_PARENT;
////        t6.setLayoutParams(params1);

        return view;

    }
}
