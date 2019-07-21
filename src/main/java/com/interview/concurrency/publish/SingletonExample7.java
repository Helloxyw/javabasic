package com.interview.concurrency.publish;

import com.interview.annoations.Recommend;
import com.interview.annoations.ThreadSafe;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/7/15
 * Time:23:13
 * 枚举模式————最安全
 */
@ThreadSafe
@Recommend
public class SingletonExample7 {

    //私有构造方法
    private SingletonExample7() {

    }

    public static SingletonExample7 getInstance(){
        return Singleton.INSTANCE.getInstance();
    }


    private enum Singleton {
        INSTANCE;

        private SingletonExample7 singleton;

        //JVM保证这个方法只调用一次
        Singleton() {
            singleton = new SingletonExample7();
        }

        public SingletonExample7 getInstance(){
            return singleton;
        }
    }

}
