package com.example.zhouxiaolong.dagger2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    Vehicle vehicle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        VehicleComponent vehicleComponent = DaggerVehicleComponent.builder().vehicleModule(new VehicleModule()).build();
        vehicle = vehicleComponent.provideVehicle();
        Toast.makeText(this, String.valueOf(vehicle.getSpeed()), Toast.LENGTH_SHORT).show();
    }

}

