package com.example.zhouxiaolong.dagger2;

import android.support.v4.app.Fragment;
import android.os.Bundle;

import com.example.zhouxiaolong.dagger2.base.BaseActivity;
import com.example.zhouxiaolong.dagger2.util.ActivityUtil;

import javax.inject.Inject;
import dagger.android.DispatchingAndroidInjector;

/**
 * Created
 * User: zhouxiaolong
 * Date: 2017/7/11
 * Contact with 1016579848@qq.com
 */
public class MainActivity extends BaseActivity {

    @Inject
    MainFragment mainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState == null) {
            ActivityUtil.addFragmentToActivity(
                    getSupportFragmentManager(),
                    mainFragment,
                    R.id.fl_main_container
            );
        }
    }

}

