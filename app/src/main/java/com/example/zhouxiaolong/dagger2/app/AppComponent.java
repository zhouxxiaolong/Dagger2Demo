package com.example.zhouxiaolong.dagger2.app;


import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created
 * 创 建 人: @author zhouxiaolong
 * 创建日期: 2018/6/10
 * 邮   箱: 1016579848@qq.com
 * 参   考: @link
 * 描   述:
 */
@Singleton
@Component(modules = {AndroidInjectionModule.class, BuildersModule.class, AppModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {
        @BindsInstance
        Builder application(App application);

        AppComponent build();
    }

    void inject(App application);
}
