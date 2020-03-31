package com.design.pattern.dynamic.djdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author: jie.luo
 * @create: 2020-04-01 00:53
 */
public class ProxyHandler implements InvocationHandler {

    /**
     * 代理目标对象
     */
    private Object target;

    /**
     * 绑定关系，也就是关联到哪个接口（与具体的实现类绑定）的哪些方法将被调用时，执行invoke方法。
     *
     * @param target 绑定具体的代理实例
     * @return 动态代理类实例
     */
    public Object newProxyInstance(Object target) {
        this.target = target;

         /*
        该方法用于为指定类装载器、一组接口及调用处理器生成动态代理类实例。
        第一个参数指定产生代理对象的类加载器，需要将其指定为和目标对象同一个类加载器。
        第二个参数要实现和目标对象一样的接口，所以只需要拿到目标对象的实现接口。
        第三个参数表明这些被拦截的方法在被拦截时需要执行哪个InvocationHandler的invoke方法
        根据传入的目标返回一个代理对象
        */
        Object result = Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);

        return result;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        try {
            System.out.println("执行前----- simpleName : " + proxy.getClass().getSimpleName());
            result = method.invoke(target, args);
            System.out.println("执行后----- simpleName : " + proxy.getClass().getSimpleName());
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("执行中出现异常----- simpleName : " + proxy.getClass().getSimpleName());
        }
        return result;
    }
}
