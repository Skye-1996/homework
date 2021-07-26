package com.skye.homework.week5.q1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProxyHandler implements InvocationHandler {

    private Object object;
    public ProxyHandler(Object object){
        this.object = object;
    }

    private void before(Method method){
        if(method.isAnnotationPresent(Log.class)){
            Aspect logAspect = new LogAspect();
            logAspect.before();
        }
        if(method.isAnnotationPresent(Transaction.class)){
            Aspect transAspect = new TransactionAspect();
            transAspect.before();
        }
    }

    private void after(Method method){
        if(method.isAnnotationPresent(Transaction.class)){
            Aspect transAspect = new TransactionAspect();
            transAspect.after();
        }
        if(method.isAnnotationPresent(Log.class)){
            Aspect logAspect = new LogAspect();
            logAspect.after();
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        before(method);
        method.invoke(object, args);
        after(method);
        return null;
    }
}
