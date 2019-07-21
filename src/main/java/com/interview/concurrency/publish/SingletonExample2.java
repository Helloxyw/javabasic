package com.interview.concurrency.publish;

import com.interview.annoations.NotThreadSafe;
import com.interview.annoations.ThreadSafe;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/7/15
 * Time:22:20
 * 饿汉模式————单例实例类装载使用时创建
 */
@ThreadSafe
public class SingletonExample2 {

    //单例对象
    private static SingletonExample2 instance = new SingletonExample2();

    //私有的构造方法
    private SingletonExample2() {

    }

    //静态的工厂方法
    public static SingletonExample2 getInstance() {
        return instance;
    }
}
