package com.example.zhouxiaolong.dagger2.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * Created
 * 创 建 人: @author zhouxiaolong
 * 创建日期: 2018/6/10
 * 邮   箱: 1016579848@qq.com
 * 参   考: @link
 * 描   述:
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface PerFragment {
}
