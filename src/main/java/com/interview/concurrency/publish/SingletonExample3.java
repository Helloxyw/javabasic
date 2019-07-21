package com.interview.concurrency.publish;

import com.interview.annoations.NotRecommend;
import com.interview.annoations.NotThreadSafe;
import com.interview.annoations.ThreadSafe;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/7/15
 * Time:22:20
 * 懒汉模式————单例实例在第一次使用时创建
 */
@ThreadSafe
@NotRecommend
public class SingletonExample3 {

    //单例对象
    private static SingletonExample3 instance = null;

    //私有的构造方法
    private SingletonExample3() {

    }

    //静态的工厂方法
    public static synchronized SingletonExample3 getInstance() {
        if (instance == null) {
            instance = new SingletonExample3();
        }
        return instance;
    }
}
