package com.design.pattern.pstatic;

import com.design.pattern.IStar;

/**
 * @author: jie.luo
 * @create: 2020-04-01 00:39
 */
public class ProxyHandler implements IStar {

    private IStar iStar;

    public ProxyHandler(IStar iStar) {
        this.iStar = iStar;
    }

    @Override
    public void sing() {

        System.out.println("唱歌前准备练嗓子");

        iStar.sing();

        System.out.println("唱歌完毕要收钱的");

    }

    @Override
    public void write() {
        
    }
}
