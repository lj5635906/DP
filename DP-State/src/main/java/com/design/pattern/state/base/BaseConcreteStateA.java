package com.design.pattern.state.base;

/**
 * 具体状态A
 *
 * @author roger.
 * @email 190642964@qq.com
 * @create 2017-02-21
 */
public class BaseConcreteStateA extends BaseState{

    @Override
    public void handle(BaseContext context) {
        System.out.println("当前状态是A....");
        context.setBaseState(new BaseConcreteStateB());
    }
}
