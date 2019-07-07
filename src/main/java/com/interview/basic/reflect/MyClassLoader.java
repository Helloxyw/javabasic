package com.interview.basic.reflect;

import java.io.*;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/6/19
 * Time:23:42
 * 自定义ClassLoader
 */
public class MyClassLoader extends ClassLoader {

    private String path;
    private String classLoaderName;

    public MyClassLoader(String path, String classLoaderName) {
        this.path = path;
        this.classLoaderName = classLoaderName;
    }


    /**
     * 用于寻找类文件
     *
     * @param name
     * @return
     */
    @Override
    public Class findClass(String name) {
        byte[] b = loadClassData(name);
        return defineClass(name, b, 0, b.length);
    }

    /**
     * 用于加载类文件
     * @param name
     * @return
     */
    public byte[] loadClassData(String name){
        name = path + name + ".class";
        InputStream in = null;
        ByteArrayOutputStream out = null;
        try {
            in = new FileInputStream(new File(name));
            out = new ByteArrayOutputStream();
            int i = 0;
            while((i = in.read())!= -1){
                out.write(i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return out.toByteArray();
    }
}
