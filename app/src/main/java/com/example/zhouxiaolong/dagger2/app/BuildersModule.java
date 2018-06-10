package com.example.zhouxiaolong.dagger2.app;

import com.example.zhouxiaolong.dagger2.MainActivity;
import com.example.zhouxiaolong.dagger2.MainFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

/**
 * Created
 * 创 建 人: @author zhouxiaolong
 * 创建日期: 2018/6/10
 * 邮   箱: 1016579848@qq.com
 * 参   考: @link
 * 描   述:
 */
@Module
public abstract class BuildersModule {

    @ContributesAndroidInjector()
    abstract MainActivity bindMainActivity();

    @ContributesAndroidInjector()
    abstract MainFragment bindMainFragment();
}
