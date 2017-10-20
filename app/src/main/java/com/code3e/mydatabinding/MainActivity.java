package com.code3e.mydatabinding;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.databinding.DataBindingUtil;

import com.code3e.mydatabinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;
    public Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activityMainBinding
                = DataBindingUtil.setContentView(this, R.layout.activity_main);

        car = new Car();
        car.setNumberOfDoors(4);
        car.setCurrentSpeed(100);

        activityMainBinding.setCar(car);
    }
}
