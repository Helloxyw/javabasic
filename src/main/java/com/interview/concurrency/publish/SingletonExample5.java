package com.interview.concurrency.publish;

import com.interview.annoations.NotThreadSafe;
import com.interview.annoations.ThreadSafe;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/7/15
 * Time:22:20
 * 懒汉模式————单例实例在第一次使用时创建
 * 双重同步锁单例模式
 */
@ThreadSafe
public class SingletonExample5 {

    //单例对象  volatile + 双重检测机制 -> 禁止指令重排
    private volatile static SingletonExample5 instance = null;

    //私有的构造方法
    private SingletonExample5() {

    }

    //1. memory = allocate()分配对象内寸空间
    //2. ctorInstance()初始化对象
    //3. instance = memory 设置instance指向刚才分配的内存空间

    //静态的工厂方法
    public static SingletonExample5 getInstance() {
        if (instance == null) { //双重检测机制          B
            synchronized (SingletonExample5.class) {  //同步锁
                if (instance == null) {
                    instance = new SingletonExample5(); //A-3
                }
            }
        }
        return instance;
    }
}
