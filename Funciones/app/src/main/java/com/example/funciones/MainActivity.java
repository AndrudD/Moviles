package com.example.funciones;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import java.lang.Math;

import androidx.annotation.Nullable;

public class MainActivity extends Activity implements View.OnClickListener{
    ImageView a,b,c;
    RadioButton sin,cos,tan,cuarentacinco,noventa,cientoochenta;
    double r;
    String res;
    public TextView txtresult;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        a=(ImageView) findViewById(R.id.a);
        b=(ImageView) findViewById(R.id.b);
        c=(ImageView) findViewById(R.id.c);
        sin = (RadioButton) findViewById(R.id.sin);
        cos = (RadioButton) findViewById(R.id.cos);
        tan = (RadioButton) findViewById(R.id.tan);
        cuarentacinco = (RadioButton) findViewById(R.id.cuarentacinco);
        noventa = (RadioButton) findViewById(R.id.noventa);
        cientoochenta = (RadioButton) findViewById(R.id.cientoochenta);
        txtresult=(TextView) findViewById(R.id.txtresult);


        findViewById(R.id.sin).setOnClickListener(this);
        findViewById(R.id.cos).setOnClickListener(this);
        findViewById(R.id.tan).setOnClickListener(this);
        findViewById(R.id.cuarentacinco).setOnClickListener(this);
        findViewById(R.id.noventa).setOnClickListener(this);
        findViewById(R.id.cientoochenta).setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        onCustomClick(view);

    }
    public void onCustomClick(View view) {
        boolean checked = ((RadioButton) view).isChecked();
        //SENO
        if (sin.isChecked() && cuarentacinco.isChecked()){
            if(a.getVisibility() == View.GONE) {
                a.setVisibility(View.VISIBLE);
                b.setVisibility(View.GONE);
                c.setVisibility(View.GONE);
                r = Math.sin(45);
                txtresult.setText("Resultado: " + r);
            }
        }
        if (sin.isChecked() && noventa.isChecked()){
            if(b.getVisibility() == View.GONE) {
                b.setVisibility(View.VISIBLE);
                a.setVisibility(View.GONE);
                c.setVisibility(View.GONE);
                r = Math.sin(90);
                txtresult.setText("Resultado: " + r);
            }
        }
        if (sin.isChecked() && cientoochenta.isChecked()){
            if(c.getVisibility() == View.GONE) {
                c.setVisibility(View.VISIBLE);
                a.setVisibility(View.GONE);
                b.setVisibility(View.GONE);
                r = Math.sin(180);
                txtresult.setText("Resultado: " + r);
            }
        }
        //COSENO
        if (cos.isChecked() && cuarentacinco.isChecked()){
            if(a.getVisibility() == View.GONE) {
                a.setVisibility(View.VISIBLE);
                b.setVisibility(View.GONE);
                c.setVisibility(View.GONE);
                r = Math.cos(45);
                txtresult.setText("Resultado: " + r);
            }
        }
        if (cos.isChecked() && noventa.isChecked()){
            if(b.getVisibility() == View.GONE) {
                b.setVisibility(View.VISIBLE);
                a.setVisibility(View.GONE);
                c.setVisibility(View.GONE);
                r = Math.cos(90);
                txtresult.setText("Resultado: " + r);
            }
        }
        if (cos.isChecked() && cientoochenta.isChecked()){
            if(c.getVisibility() == View.GONE) {
                c.setVisibility(View.VISIBLE);
                a.setVisibility(View.GONE);
                b.setVisibility(View.GONE);
                r = Math.cos(180);
                txtresult.setText("Resultado: " + r);
            }
        }
        //TANGENTE
        if (tan.isChecked() && cuarentacinco.isChecked()){
            if(a.getVisibility() == View.GONE) {
                a.setVisibility(View.VISIBLE);
                b.setVisibility(View.GONE);
                c.setVisibility(View.GONE);
                r = Math.tan(45);
                txtresult.setText("Resultado: " + r);
            }
        }
        if (tan.isChecked() && noventa.isChecked()){
            if(b.getVisibility() == View.GONE) {
                b.setVisibility(View.VISIBLE);
                a.setVisibility(View.GONE);
                c.setVisibility(View.GONE);
                r = Math.tan(90);
                txtresult.setText("Resultado: " + r);
            }
        }
        if (tan.isChecked() && cientoochenta.isChecked()){
            if(c.getVisibility() == View.GONE) {
                c.setVisibility(View.VISIBLE);
                a.setVisibility(View.GONE);
                b.setVisibility(View.GONE);
                r = Math.tan(180);
                txtresult.setText("Resultado: " + r);
            }
        }

    }





}