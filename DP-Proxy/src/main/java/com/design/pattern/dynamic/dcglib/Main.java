package com.design.pattern.dynamic.dcglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author: jie.luo
 * @create: 2020-04-01 01:25
 */
public class Main {

    public static void main(String[] args) {
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        // 实例化一个增强器，也就是cglib中的一个class generator
        Enhancer enhancer = new Enhancer();
        // 设置目标类
        enhancer.setSuperclass(ArraySort.class);
        // 设置拦截对象，这里直接使用匿名内部类写法
        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object object, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                String sortName = method.getName();
                switch (sortName) {
                    case "bubbleSort":
                        sortName = "冒泡排序";
                        break;
                    case "selectSort":
                        sortName = "选择排序";
                        break;
                    case "quickSort":
                        sortName = "快速排序";
                        break;
                    default:
                        break;
                }
                long start = System.currentTimeMillis();
                // 此处一定要使用proxy的invokeSuper方法来调用目标类的方法
                proxy.invokeSuper(object, args);
                long end = System.currentTimeMillis();
                System.out.println("本次" + sortName + "的执行时间为: " + (end - start) + "ms");
                return null;
            }

        });
        // 生成代理类并返回一个实例
        ArraySort arraySort = (ArraySort) enhancer.create();
        arraySort.bubbleSort(arr);
        arraySort.selectSort(arr);
        arraySort.quickSort(arr);
    }

}
