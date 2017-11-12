package com.example.kaupp.sensordemo;

import android.content.Context;
import android.content.Intent;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.List;

import static android.R.attr.button;
import static com.example.kaupp.sensordemo.R.id.accelerometer;

public class SensorMenu extends AppCompatActivity {

    private SensorManager mySensorManager;
    private Sensor sensor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_menu);

        mySensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);


            if (mySensorManager.getDefaultSensor(Sensor.TYPE_GRAVITY) != null) {
                Button button = (Button) findViewById(R.id.gravity);
                button.setVisibility(View.VISIBLE);
            }
            if (mySensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER) != null) {
                Button button = (Button) findViewById(R.id.accelerometer);
                button.setVisibility(View.VISIBLE);
            }
            if (mySensorManager.getDefaultSensor(Sensor.TYPE_AMBIENT_TEMPERATURE) != null) {
                Button button = (Button) findViewById(R.id.ambtemp);
                button.setVisibility(View.VISIBLE);
            }
            if (mySensorManager.getDefaultSensor(Sensor.TYPE_GYROSCOPE) != null) {
                Button accB = (Button) findViewById(R.id.gyro);
                accB.setVisibility(View.VISIBLE);
            }
            if (mySensorManager.getDefaultSensor(Sensor.TYPE_LIGHT) != null) {
                Button accB = (Button) findViewById(R.id.light);
                accB.setVisibility(View.VISIBLE);
            }
            if (mySensorManager.getDefaultSensor(Sensor.TYPE_LINEAR_ACCELERATION) != null) {
                Button accB = (Button) findViewById(R.id.linacc);
                accB.setVisibility(View.VISIBLE);
            }
            if (mySensorManager.getDefaultSensor(Sensor.TYPE_MAGNETIC_FIELD) != null) {
                Button accB = (Button) findViewById(R.id.magnetic);
                accB.setVisibility(View.VISIBLE);
            }
            if (mySensorManager.getDefaultSensor(Sensor.TYPE_PRESSURE) != null) {
                Button accB = (Button) findViewById(R.id.pressure);
                accB.setVisibility(View.VISIBLE);
            }
            if (mySensorManager.getDefaultSensor(Sensor.TYPE_RELATIVE_HUMIDITY) != null) {
                Button accB = (Button) findViewById(R.id.relhum);
                accB.setVisibility(View.VISIBLE);
            }
            if (mySensorManager.getDefaultSensor(Sensor.TYPE_ROTATION_VECTOR) != null) {
                Button accB = (Button) findViewById(R.id.rotvec);
                accB.setVisibility(View.VISIBLE);
            }
            if (mySensorManager.getDefaultSensor(Sensor.TYPE_PROXIMITY) != null) {
                Button accB = (Button) findViewById(R.id.proximity);
                accB.setVisibility(View.VISIBLE);
            }
    }

    public void StartAcceleration(View view){
        Intent accel = new Intent(this, accelerationActivity.class);
        startActivity(accel);
    }

    public void StartAmbient(View view){
        Intent ambient = new Intent(this, AmbientTemperature.class);
        startActivity(ambient);
    }

    public void StartGravity(View view){
        Intent gravity = new Intent(this, Gravity.class);
        startActivity(gravity);
    }

    public void StartGyroscope(View view){
        Intent gyro = new Intent(this, gyroScope.class);
        startActivity(gyro);
    }

    public void StartHumidity(View view){
        Intent humi = new Intent(this, Humidity.class);
        startActivity(humi);
    }

    public void StartLight(View view){
        Intent light = new Intent(this, Light.class);
        startActivity(light);
    }

    public void StartLinearAcceleration(View view){
        Intent liAccel = new Intent(this, LinearAcceleration.class);
        startActivity(liAccel);
    }

    public void StartMagnetic(View view){
        Intent magnetic = new Intent(this, MagneticField.class);
        startActivity(magnetic);
    }

    public void StartPressure(View view){
        Intent pressure = new Intent(this, Pressure.class);
        startActivity(pressure);
    }

    public void StartProximity(View view){
        Intent prox = new Intent(this, Proximity.class);
        startActivity(prox);
    }

    public void StartRotationVector(View view){
        Intent rotation = new Intent(this, RotationVector.class);
        startActivity(rotation);
    }
}








