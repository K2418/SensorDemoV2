package com.example.kaupp.sensordemo;

import android.content.Intent;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        CollapsingToolbarLayout collapsingToolbarLayout =  (CollapsingToolbarLayout) findViewById(R.id.main_collapsing);
        collapsingToolbarLayout.setTitle("Demo");
    }

    public void TestSensors(View view){

        Intent SensorMenu = new Intent(this, SensorMenu.class);
        startActivity(SensorMenu);
    }


}
