package com.example.zhouxiaolong.dagger2;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/7/12
 * Contact with 1016579848@qq.com
 */

@Singleton
@Component(modules = {VehicleModule.class})
public interface VehicleComponent {

    Vehicle provideVehicle();
}
