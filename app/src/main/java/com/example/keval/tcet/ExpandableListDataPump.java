package com.example.keval.tcet;

/**
 * Created by keval on 7/22/2017.
 */
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static LinkedHashMap<String, List<String>> getData() {
        LinkedHashMap<String, List<String>> expandableListDetail = new LinkedHashMap<>();

        List<String> CMPN = new ArrayList<String>();
        CMPN.add("FE");
        CMPN.add("SE");
        CMPN.add("TE");
        CMPN.add("BE");

        List<String> IT = new ArrayList<String>();
        IT.add("FE");
        IT.add("SE");
        IT.add("TE");
        IT.add("BE");

        List<String> EXTC = new ArrayList<String>();
        EXTC.add("FE");
        EXTC.add("SE");
        EXTC.add("TE");
        EXTC.add("BE");

        List<String> ETRX = new ArrayList<String>();
        ETRX.add("FE");
        ETRX.add("SE");
        ETRX.add("TE");
        ETRX.add("BE");

        List<String> MECH = new ArrayList<String>();
        MECH.add("FE");
        MECH.add("SE");
        MECH.add("TE");
        MECH.add("BE");

        List<String> CIVIL = new ArrayList<String>();
        CIVIL.add("FE");
        CIVIL.add("SE");
        CIVIL.add("TE");
        CIVIL.add("BE");

        List<String> HS = new ArrayList<String>();

        expandableListDetail.put("CMPN", CMPN);
        expandableListDetail.put("IT", IT);
        expandableListDetail.put("EXTC", EXTC);
        expandableListDetail.put("ETRX", ETRX);
        expandableListDetail.put("MECH", MECH);
        expandableListDetail.put("CIVIL", CIVIL);
        
        return expandableListDetail;
    }
}