package com.interview.concurrency.publish;

import lombok.extern.slf4j.Slf4j;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/7/7
 * Time:23:11
 * 对象溢出
 */
@Slf4j
public class Escape {


    private int thisCanBeEscape = 0;

    public Escape() {
        new InnerClass();
    }

    private class InnerClass {

        public InnerClass() {
            log.info("{}", Escape.this.thisCanBeEscape);
        }
    }

    public static void main(String[] args) {
        new Escape();
    }

}
