package com.interview.concurrency.publish;

import java.util.Arrays;

/**
 * Created with IDEA
 * author:RicardoXu
 * Date:2019/7/7
 * Time:22:59
 */
public class UnsafePublish {

    private String[] states = {"a","b","c"};

    public String[] getStates() {
        return states;
    }

    public static void main(String[] args) {
        UnsafePublish unsafePublis = new UnsafePublish();
        System.out.println(Arrays.toString(unsafePublis.getStates()));

        unsafePublis.getStates()[0] = "d";
        System.out.println(Arrays.toString(unsafePublis.getStates()));
    }
}
