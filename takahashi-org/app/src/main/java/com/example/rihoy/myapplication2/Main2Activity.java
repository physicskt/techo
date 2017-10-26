package com.example.rihoy.myapplication2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import java.util.Random;

import static com.example.rihoy.myapplication2.R.drawable.b1;


public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }


    public void CordinateChanger(View view) {

        Random m = new Random();
        int l = m.nextInt(2) + 1;
        String k = String.valueOf(l);
        ImageView cordinatetops = (ImageView) findViewById(R.id.cordinatetops);
        cordinatetops.setImageResource(getResources().getIdentifier("t" + k, "drawable", getPackageName()));

        Random r = new Random();
        int n = r.nextInt(3) + 1;
        String s = String.valueOf(n);
        ImageView cordinatebottoms = (ImageView) findViewById(R.id.cordinatebottoms);
        cordinatebottoms.setImageResource(getResources().getIdentifier("b" + s, "drawable", getPackageName()));
    }
}
