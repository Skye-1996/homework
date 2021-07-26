package com.skye.homework.week5.q1;

public class LogAspect implements Aspect{

    @Override
    public void before() {
        // TODO Auto-generated method stub
        System.out.println("调用前");
    }

    @Override
    public void after() {
        // TODO Auto-generated method stub
        System.out.println("调用后");
    }

}
