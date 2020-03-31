package com.design.pattern.singleton;

import java.util.Set;

/**
 * Created by Administrator on 2016/11/23.
 */
public class Test {

    public static void main(String[] args){
        Test test = new Test();
//        test.setName("1");
//        test.add(test);
//        System.out.println(test.getName());
        String name = "1";
        test.testaa(name);
        System.out.println(name);
        System.out.println("88" +8+8);

    }

    public void testaa(String name){
        System.out.println(name);
        name = "2";
        System.out.println(name);
    }

    public void add(Test test){
        System.out.println(test.getName());
        test.setName("2");
    }


    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
