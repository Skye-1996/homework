package com.skye.homework.week5.q1;

public interface ITest {

    @Transaction()
    public void method1() ;

    @Log()
    public void method2() ;

    @Transaction()
    @Log()
    public void method3() ;

    public void method4() ;

}
