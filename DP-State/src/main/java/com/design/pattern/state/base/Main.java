package com.design.pattern.state.base;

/**
 * ${DESCRIPTION}
 *
 * @author roger.
 * @email 190642964@qq.com
 * @create 2017-02-21
 */
public class Main {

    public static void main(String[] args){

        BaseContext baseContext = new BaseContext(new BaseConcreteStateA());
        baseContext.request();
        baseContext.request();
    }

}
