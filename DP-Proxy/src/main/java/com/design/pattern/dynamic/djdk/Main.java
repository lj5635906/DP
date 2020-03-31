package com.design.pattern.dynamic.djdk;

import com.design.pattern.IStar;
import com.design.pattern.MyStart;

/**
 * @author: jie.luo
 * @create: 2020-04-01 00:58
 */
public class Main {
    public static void main(String[] args) {

        ProxyHandler proxyHandler = new ProxyHandler();

        IStar iStar = (IStar) proxyHandler.newProxyInstance(new MyStart());

        iStar.write();
    }
}
