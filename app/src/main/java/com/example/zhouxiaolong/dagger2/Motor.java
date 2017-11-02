package com.example.zhouxiaolong.dagger2;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/7/11
 * Contact with 1016579848@qq.com
 */

public class Motor {

    private int rpm;

    public Motor() {
        this.rpm = 0;
    }

    public int getRpm() {
        return rpm;
    }

    public void accelerate(int value) {
        rpm = rpm + value;
    }

    public void brake() {
        rpm = 0;
    }
}
