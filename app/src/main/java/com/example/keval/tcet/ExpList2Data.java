package com.example.keval.tcet;

/**
 * Created by keval on 7/22/2017.
 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpList2Data {
    public static LinkedHashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<>();

        List<String> Home = new ArrayList<String>();

        List<String> About = new ArrayList<String>();
        About.add("Mentor's Message");
        About.add("HOD's Message");
        About.add("Resources");
        About.add("Committees");
        About.add("Organogram");
        About.add("Achievements");

        List<String> Programs = new ArrayList<String>();
        Programs.add("Academic Planning");
        Programs.add("Bridge Courses");
        Programs.add("Modules");
        Programs.add("Schemes");

        List<String> Students = new ArrayList<String>();
        Students.add("Attendance");
        Students.add("Events");
        Students.add("CSI");
        Students.add("Alumni");

        List<String> Research = new ArrayList<String>();
        Research.add("About Ph.D. Research Center");
        Research.add("Program Specific Research Domains");
        Research.add("Case Studies");
        Research.add("Paper Publications");

        List<String> OBE = new ArrayList<String>();
        OBE.add("Graduate Attribute");
        OBE.add("Program Educational Objectives");
        OBE.add("Program Outcomes");
        OBE.add("Program Specific Outcomes");

        expandableListDetail.put("Home", Home);
        expandableListDetail.put("About", About);
        expandableListDetail.put("Programs", Programs);
        expandableListDetail.put("Students", Students);
        expandableListDetail.put("Research", Research);
        expandableListDetail.put("OBE", OBE);

        return expandableListDetail;
    }
}