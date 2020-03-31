package com.design.pattern.state.base;

/**
 * 抽象状态类，定义一个接口以封装与Context的一个特定状态相关的行为
 *
 * @author roger.
 * @email 190642964@qq.com
 * @create 2017-02-21
 */
public abstract class BaseState {

    /**
     * 操作
     */
    public abstract void handle(BaseContext context);
}
