package com.design.pattern.pstatic;

import com.design.pattern.IStar;
import com.design.pattern.MyStart;

/**
 * @author: jie.luo
 * @create: 2020-04-01 00:41
 */
public class Main {

    public static void main(String[] args) {

        IStar iStar = new MyStart();

        ProxyHandler proxyManage = new ProxyHandler(iStar);
        proxyManage.sing();

    }

}
