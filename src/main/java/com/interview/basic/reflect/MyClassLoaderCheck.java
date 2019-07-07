package com.interview.basic.reflect;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/6/20
 * Time:00:06
 */
public class MyClassLoaderCheck {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //要扫描的class路径
        String path = "xx/xxx/xxx";
        MyClassLoader myClassLoader = new MyClassLoader(path,"myClassLoader");
        //test.class
        Class c = myClassLoader.loadClass("test");
        System.out.println(c.getClassLoader());
        c.newInstance();

    }
}
