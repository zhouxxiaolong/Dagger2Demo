package com.example.zhouxiaolong.dagger2;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/7/12
 * Contact with 1016579848@qq.com
 */

@Module
public class VehicleModule {

    @Singleton
    @Provides
    Motor provideMotor() {
        return new Motor();
    }

    @Singleton
    @Provides
    Vehicle provideVehicle() {
        return new Vehicle(new Motor());
    }

}
