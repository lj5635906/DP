package com.design.pattern;

/**
 * @author: jie.luo
 * @create: 2020-04-01 00:39
 */
public class MyStart implements IStar {
    @Override
    public void sing() {
        System.out.println("我在唱歌");
    }

    @Override
    public void write() {
        System.out.println("我在写书");
    }
}
