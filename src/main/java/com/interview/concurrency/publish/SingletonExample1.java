package com.interview.concurrency.publish;

import com.interview.annoations.NotThreadSafe;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/7/15
 * Time:22:20
 * 懒汉模式————单例实例在第一次使用时创建
 */
@NotThreadSafe
public class SingletonExample1 {

    //单例对象
    private static SingletonExample1 instance = null;

    //私有的构造方法
    private SingletonExample1() {

    }

    //静态的工厂方法
    public static SingletonExample1 getInstance() {
        if (instance == null) {
            instance = new SingletonExample1();
        }
        return instance;
    }
}
