package com.example.zhouxiaolong.dagger2;

import javax.inject.Inject;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/7/11
 * Contact with 1016579848@qq.com
 */

public class Vehicle {

    private Motor motor;

    @Inject
    public Vehicle(Motor motor) {
        this.motor = motor;
    }

    public void increaseSpeed(int value){
        motor.accelerate(value);
    }

    public void stop(){
        motor.brake();
    }

    public int getSpeed(){
        return motor.getRpm();
    }
}
