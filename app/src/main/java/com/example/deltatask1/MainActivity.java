package com.example.deltatask1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import java.util.*;
import java.io.*;
import android.widget.Button;
import android.content.DialogInterface;
import android.widget.TextView;
import android.content.Intent;
import android.os.Vibrator;

public class MainActivity<array, intArray> extends AppCompatActivity {
    private TextView num1;
    private TextView num2;
    private TextView num3;
    private TextView num4;
    private TextView num5;
    private TextView num6;
    private TextView num7;
    private TextView num8;
    private TextView num9;
    private TextView num10;
    private TextView taddresult;
    private TextView tsubresult;
    private TextView tmultiresult;
    private TextView tdivresult;
    private TextView taddresult1;
    private TextView maintile1;
    private TextView maintile2;
    private TextView maintile3;
    private TextView maintile4;
    private TextView maintile5;
    private TextView maintile6;
    private TextView maintile7;
    private TextView maintile8;
    private TextView maintile9;
    private TextView maintile10;
    public static int var;
    private int a_;
    private int a1;
    private int a2;
    private int a3;
    private int a4;
    private int a5;
    private int a6;
    private int a7;
    private int a8;
    private int a9;
    private int flag;
    private int addresult_checker;
    private int addresult;
    private int subresult_checker;
    private int multiresult_checker;
    private int divresult_checker;
    private int addresult1_checker;
    public int lives=3;
    public int score=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generate_equations();

    }


    public void generate_equations(){

        int min=0;
        int max=100;
        addresult=(int)Math.floor(Math.random()*(max-min+1)+min);
        int max1=addresult;
        int add1=(int)Math.floor(Math.random()*(max1-min+1)+min);
        int add2=addresult-add1;
        int subresult=(int)Math.floor(Math.random()*(max-min+1)+min);
        int min2=subresult;
        int max2=100;
        int sub1=(int)Math.floor(Math.random()*(max2-min2+1)+min2);
        int sub2=sub1-subresult;
        int multi1=(int)Math.floor(Math.random()*(max-min+1)+min);
        int multi2=(int)Math.floor(Math.random()*(max-min+1)+min);
        int multiresult=multi1*multi2;
        int div2=(int)Math.floor(Math.random()*(max-min+1)+min);
        int divresult=(int)Math.floor(Math.random()*(max-min+1)+min);
        int div1=div2*divresult;
        int add3=(int)Math.floor(Math.random()*(max-min+1)+min);
        int add4=(int)Math.floor(Math.random()*(max-min+1)+min);
        int addresult1=add3+add4;

        Integer[] array = new Integer[10];
        array[0] = add1;
        array[1] = add2;
        array[2] = sub1;
        array[3] = sub2;
        array[4] =multi1;
        array[5] =multi2;
        array[6] =div1;
        array[7] =div2;
        array[8] =add3;
        array[9] =add4;

        List<Integer> list =Arrays.asList(array);
        Collections.shuffle(list);
        list.toArray(array);

        taddresult=findViewById(R.id.taddresult);
        tsubresult=findViewById(R.id.tsubresult);
        tmultiresult=findViewById(R.id.tmultiresult);
        tdivresult=findViewById(R.id.tdivresult);
        taddresult1=findViewById(R.id.taddresult1);
        num1=findViewById(R.id.num1);
        num2=findViewById(R.id.num2);
        num3=findViewById(R.id.num3);
        num4=findViewById(R.id.num4);
        num5=findViewById(R.id.num5);
        num6= findViewById(R.id.num6);
        num7=findViewById(R.id.num7);
        num8=findViewById(R.id.num8);
        num9=findViewById(R.id.num9);
        num10=findViewById(R.id.num10);
        maintile1=findViewById(R.id.maintile1);
        maintile2=findViewById(R.id.maintile2);
        maintile3=findViewById(R.id.maintile3);
        maintile4=findViewById(R.id.maintile4);
        maintile5=findViewById(R.id.maintile5);
        maintile6=findViewById(R.id.maintile6);
        maintile7=findViewById(R.id.maintile7);
        maintile8=findViewById(R.id.maintile8);
        maintile9=findViewById(R.id.maintile9);
        maintile10=findViewById(R.id.maintile10);
        maintile1.setText("?");
        maintile2.setText("?");
        maintile3.setText("?");
        maintile4.setText("?");
        maintile5.setText("?");
        maintile6.setText("?");
        maintile7.setText("?");
        maintile8.setText("?");
        maintile9.setText("?");
        maintile10.setText("?");

        num1.setText(String.valueOf(array[0]));
        num2.setText(String.valueOf(array[1]));
        num3.setText(String.valueOf(array[2]));
        num4.setText(String.valueOf(array[3]));
        num5.setText(String.valueOf(array[4]));
        num6.setText(String.valueOf(array[5]));
        num7.setText(String.valueOf(array[6]));
        num8.setText(String.valueOf(array[7]));
        num9.setText(String.valueOf(array[8]));
        num10.setText(String.valueOf(array[9]));
        a_=array[0];
        a1=array[1];
        a2=array[2];
        a3=array[3];
        a4=array[4];
        a5=array[5];
        a6=array[6];
        a7=array[7];
        a8=array[8];
        a9=array[9];


        taddresult.setText(String.valueOf(addresult));
        tsubresult.setText(String.valueOf(subresult));
        tmultiresult.setText(String.valueOf(multiresult));
        tdivresult.setText(String.valueOf(divresult));
        taddresult1.setText(String.valueOf(addresult1));
        addresult_checker=addresult;
        subresult_checker=subresult;
        multiresult_checker=multiresult;
        divresult_checker=divresult;
        addresult1_checker=addresult1;
    }
    public void set_tile1(View v) {
        var = a_;
        v.setSelected(true);
    }
    public void set_tile2(View v) {
        var = a1;
        v.setSelected(true);
    }
    public void set_tile3(View v) {
        var = a2;
        v.setSelected(true);
    }
    public void set_tile4(View v) {
        var = a3;
        v.setSelected(true);
    }
    public void set_tile5(View v) {
        var = a4;
        v.setSelected(true);
    }
    public void set_tile6(View v) {
        var = a5;
        v.setSelected(true);
    }
    public void set_tile7(View v) {
        var = a6;
        v.setSelected(true);
    }
    public void set_tile8(View v) {
        var = a7;
        v.setSelected(true);
    }
    public void set_tile9(View v) {
        var = a8;
        v.setSelected(true);
    }
    public void set_tile10(View v) {
        var = a9;
        v.setSelected(true);
    }


    public void set_maintile1(View v) {
        maintile1.setText(String.valueOf(var));
        var = 0;
    }
    public void set_maintile2(View v) {
        maintile2.setText(String.valueOf(var));
        var = 0;
    }
    public void set_maintile3(View v) {
        maintile3.setText(String.valueOf(var));
        var=0;
    }
    public void set_maintile4(View v) {
        maintile4.setText(String.valueOf(var));
        var=0;
    }
    public void set_maintile5(View v) {
        maintile5.setText(String.valueOf(var));
        var=0;
    }
    public void set_maintile6(View v) {
        maintile6.setText(String.valueOf(var));
        var=0;
    }
    public void set_maintile7(View v) {
        maintile7.setText(String.valueOf(var));
        var=0;
    }
    public void set_maintile8(View v) {
        maintile8.setText(String.valueOf(var));
        var=0;
    }
    public void set_maintile9(View v) {
        maintile9.setText(String.valueOf(var));
        var=0;
    }
    public void set_maintile10(View v) {
        maintile10.setText(String.valueOf(var));
        var=0;
    }
    @RequiresApi(api = Build.VERSION_CODES.O)
    public void check_eqns(View v){
        flag=0;
        //String x1= (String) maintile1.getText();
        //if(maintile1_value||maintile2_value||maintile3_value||maintile4_value||maintile5_value||maintile6_value||maintile7_value||maintile8_value||maintile9_value||maintile10_value)
        if(maintile1.getText() != "?" && maintile2.getText() != "?" && maintile3.getText() != "?" &&
                maintile4.getText() != "?" && maintile5.getText() != "?" && maintile6.getText() != "?" &&
                maintile7.getText() != "?" && maintile8.getText() != "?" && maintile9.getText() != "?" &&
                maintile10.getText() != "?") {
            int maintile1_value = Integer.parseInt((String) maintile1.getText());
            int maintile2_value = Integer.parseInt((String) maintile2.getText());
            int maintile3_value = Integer.parseInt((String) maintile3.getText());
            int maintile4_value = Integer.parseInt((String) maintile4.getText());
            int maintile5_value = Integer.parseInt((String) maintile5.getText());
            int maintile6_value = Integer.parseInt((String) maintile6.getText());
            int maintile7_value = Integer.parseInt((String) maintile7.getText());
            int maintile8_value = Integer.parseInt((String) maintile8.getText());
            int maintile9_value = Integer.parseInt((String) maintile9.getText());
            int maintile10_value = Integer.parseInt((String) maintile10.getText());


            if ((maintile1_value + maintile2_value == addresult_checker) &&
                    (maintile3_value - maintile4_value == subresult_checker) &&
                    (maintile5_value * maintile6_value == multiresult_checker) &&
                    ((maintile7_value % maintile8_value == 0) && (maintile7_value / maintile8_value == divresult_checker)) &&
                    (maintile9_value + maintile10_value == addresult1_checker)) {
                flag = 0;
            } else {
                flag = 1;
            }

            if (flag == 1) {
                lives = lives-1;
                if(lives >0) {
                    OnFalse1();
                }
                else{
                    OnFalse2();

                }
            } else {
                score=score+5;
                generate_equations();
            }
        }
        else
        {
            lives=lives-1;
            if(lives >=1)
                OnFalse1();
            else
                OnFalse2();
        }
    }

    public void OnFalse1(){
        AlertDialog.Builder builder
                = new AlertDialog
                .Builder(MainActivity.this);
        builder.setMessage("Mistake:You have "+ lives+" more lives");
        builder.setTitle("Alert !");
        builder.setCancelable(false);
        builder
                .setNegativeButton(
                        "OK",
                        new DialogInterface
                                .OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which)
                            {
                                dialog.cancel();
                            }
                        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
    public void OnFalse2(){
        AlertDialog.Builder builder
                = new AlertDialog
                .Builder(MainActivity.this);
        builder.setMessage("Completed, your score is"+" "+score);
        builder.setTitle("Alert !");
        builder.setCancelable(false);
        builder
                .setNegativeButton(
                        "OK",
                        new DialogInterface
                                .OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog,
                                                int which)
                            { Intent sender_intent=new Intent((MainActivity.this),MainActivity2.class);
                                sender_intent.putExtra("KEY",Integer.toString(score));
                                startActivity(sender_intent);
                                dialog.cancel();
                            }
                        });

        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

}