package com.example.keval.tcet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

/**
 * Created by keval on 8/10/2017.
 */

public class PointerCalculator extends AppCompatActivity {


//    boolean pass=true;
//    int total_credits=28;//just for sem 4...we will need to create a function to calculate it after we store everything in database
    int credits_earned=0;
////    int theory[]={92,70,73,57,87,83};//am-4,aoa,coa,dbms,tcs,cg-out of 100
//    int theory[]={Integer.parseInt(t1.getText().toString()),Integer.parseInt(t2.getText().toString()),Integer.parseInt(t3.getText().toString()),Integer.parseInt(t4.getText().toString()),Integer.parseInt(t5.getText().toString()),Integer.parseInt(t6.getText().toString())};
//    int theory_total[]={100,100,100,100,100,100};
////    int pracs[]={22,45,43,47,0,43};//am-4,aoa,coa,dbms,tcs,cg-out of 100
//    int pracs[]={Integer.parseInt(p1.getText().toString()),Integer.parseInt(p2.getText().toString()),Integer.parseInt(p3.getText().toString()),Integer.parseInt(p4.getText().toString()),Integer.parseInt(p5.getText().toString()),Integer.parseInt(p6.getText().toString())};
//    int pracs_total[]={25,50,50,50,0,50};
//    int theory_credits[]={4,4,4,4,4,3};//will be retirving from database afterwards
//    int prac_credits[]={1,1,1,1,0,1};//will be retirving from database afterwards


    public void predictor(View view) {

        Intent z = new Intent(getBaseContext(), FinalPointer.class);

        EditText t1 = (EditText) findViewById(R.id.editText5);
        EditText t2 = (EditText) findViewById(R.id.editText6);
        EditText t3 = (EditText) findViewById(R.id.editText2);
        EditText t4 = (EditText) findViewById(R.id.editText3);
        EditText t5 = (EditText) findViewById(R.id.editText);
        EditText t6 = (EditText) findViewById(R.id.editText4);

        EditText p1 = (EditText) findViewById(R.id.textView8);
        EditText p2 = (EditText) findViewById(R.id.textView11);
        EditText p3 = (EditText) findViewById(R.id.textView22);
        EditText p4 = (EditText) findViewById(R.id.textView23);
        EditText p5 = (EditText) findViewById(R.id.textView14);
        EditText p6 = (EditText) findViewById(R.id.textView15);

        if (t1.getText().toString().equals(""))
            t1.setText("0");
        if (t2.getText().toString().equals(""))
            t2.setText("0");
        if (t3.getText().toString().equals(""))
            t3.setText("0");
        if (t4.getText().toString().equals(""))
            t4.setText("0");
        if (t5.getText().toString().equals(""))
            t5.setText("0");
        if (t6.getText().toString().equals(""))
            t6.setText("0");

        if (p1.getText().toString().equals(""))
            p1.setText("0");
        if (p2.getText().toString().equals(""))
            p2.setText("0");
        if (p3.getText().toString().equals(""))
            p3.setText("0");
        if (p4.getText().toString().equals(""))
            p4.setText("0");
        if (p5.getText().toString().equals(""))
            p5.setText("0");
        if (p6.getText().toString().equals(""))
            p6.setText("0");


        boolean pass=true;
        int total_credits=28;//just for sem 4...we will need to create a function to calculate it after we store everything in database
//    int theory[]={92,70,73,57,87,83};//am-4,aoa,coa,dbms,tcs,cg-out of 100
        int theory[]={Integer.parseInt(t1.getText().toString()),Integer.parseInt(t2.getText().toString()),Integer.parseInt(t3.getText().toString()),Integer.parseInt(t4.getText().toString()),Integer.parseInt(t5.getText().toString()),Integer.parseInt(t6.getText().toString())};
        int theory_total[]={100,100,100,100,100,100};
//    int pracs[]={22,45,43,47,0,43};//am-4,aoa,coa,dbms,tcs,cg-out of 100
        int pracs[]={Integer.parseInt(p1.getText().toString()),Integer.parseInt(p2.getText().toString()),Integer.parseInt(p3.getText().toString()),Integer.parseInt(p4.getText().toString()),Integer.parseInt(p5.getText().toString()),Integer.parseInt(p6.getText().toString())};
        int pracs_total[]={25,50,50,50,0,50};
        int theory_credits[]={4,4,4,4,4,3};//will be retirving from database afterwards
        int prac_credits[]={1,1,1,1,0,1};//will be retirving from database afterwards

        for(int i=0;i<theory.length;i++)
        {
            int sub_credit=getCredits(theory[i],theory_total[i]);
            if(sub_credit==-1)
            {
                pass=false;
                //System.out.println(i);
                break;

            }
            int earned=sub_credit*theory_credits[i];
            credits_earned+=earned;
            int practical=getCredits(pracs[i],pracs_total[i]);
            if(practical==-1)
            {
                pass=false;
                //System.out.println(i);
                break;

            }
            int earned2=practical*prac_credits[i];
            credits_earned+=earned2;
        }

        System.out.println(credits_earned);
        double pointer=(credits_earned*1.0)/total_credits;
        credits_earned=0;
        DecimalFormat df=new DecimalFormat("#.00");
        String point=df.format(pointer);
        if(pass)
            System.out.println(point);
        else
            System.out.println("Fail");

        z.putExtra("isPassed", pass);
        z.putExtra("pointer", point);
        startActivity(z);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pointercalculator);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent z = getIntent();

    }

    public static int getCredits(int marks,int total)
    {
        if(total==0)
            return 0;
        else
        {
            double percentage=(marks*100)/total;
            if(percentage>=80)
                return 10;
            else if(percentage>=75)
                return 9;
            else if(percentage>=70)
                return 8;
            else if(percentage>=60)
                return 7;
            else if(percentage>=50)
                return 6;
            else if(percentage>=45)
                return 5;
            else if(percentage>=40)
                return 4;
            else
                return -1;
        }

    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

}
