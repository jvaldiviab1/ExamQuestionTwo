package com.commonproject.examquestiontwo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    LineChart mLineChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        float[] data = {10f, 15f, 12f, 23f, 10f, 15f, 12f};
        mLineChart = findViewById(R.id.slc);

        mLineChart.setData(data, new String[]{"Día 1", "Día 2", "Día 3", "Día 4", "Día 5", "Día 6", "Día 7"});



    }
}