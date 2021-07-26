package com.skye.homework.week5.q1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 使 Java 里的动态代理，实现一个简单的 AOP
 */
public class Answer1 {

    public static void main(String[] args) {
        System.getProperties().setProperty("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");

        ITest test = new Test();

        InvocationHandler handler = new ProxyHandler(test);

        ITest proxyInstance = (ITest) Proxy.newProxyInstance(test.getClass().getClassLoader(), test.getClass().getInterfaces(), handler);

        proxyInstance.method1();
        proxyInstance.method2();
        proxyInstance.method3();
        proxyInstance.method4();
    }
}
