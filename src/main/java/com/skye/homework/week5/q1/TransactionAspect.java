package com.skye.homework.week5.q1;

public class TransactionAspect implements Aspect{

    @Override
    public void before() {
        // TODO Auto-generated method stub
        System.out.println("事物开始");
    }

    @Override
    public void after() {
        // TODO Auto-generated method stub
        System.out.println("事物结束");
    }

}
