package com.design.pattern.state.base;

/**
 * 环境类
 *
 * @author roger.
 * @email 190642964@qq.com
 * @create 2017-02-21
 */
public class BaseContext {

    private BaseState baseState;

    public BaseContext(BaseState baseState){
        this.baseState = baseState;
    }

    public void request()
    {
        baseState.handle(this);
    }

    public BaseState getBaseState() {
        return baseState;
    }

    public void setBaseState(BaseState baseState) {
        this.baseState = baseState;
    }
}
