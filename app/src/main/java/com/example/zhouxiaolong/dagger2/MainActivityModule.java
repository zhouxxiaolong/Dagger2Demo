package com.example.zhouxiaolong.dagger2;

import dagger.Module;
import dagger.Provides;

/**
 * Created
 * 创 建 人: @author zhouxiaolong
 * 创建日期: 2018/6/10
 * 邮   箱: 1016579848@qq.com
 * 参   考: @link
 * 描   述:
 */
@Module
public class MainActivityModule {

    @Provides
    String providerMainContent() {
        return "providerMainContent";
    }
}
