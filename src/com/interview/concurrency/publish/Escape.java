package com.interview.concurrency.publish;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/7/7
 * Time:23:11
 * 对象溢出
 */
public class Escape {

    private int thisCanBeEscape = 0;

    public Escape() {
        new InnerClass();
    }

    private class InnerClass {

        public InnerClass() {
            System.out.println(Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }

}
