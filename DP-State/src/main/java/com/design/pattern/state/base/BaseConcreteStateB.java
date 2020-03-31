package com.design.pattern.state.base;

/**
 * 具体状态B
 *
 * @author roger.
 * @email 190642964@qq.com
 * @create 2017-02-21
 */
public class BaseConcreteStateB extends BaseState {

    @Override
    public void handle(BaseContext context) {
        System.out.println("当前状态是B....");
        context.setBaseState(new BaseConcreteStateA());
    }
}