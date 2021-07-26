package com.skye.homework.week5.q3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 实现一个 Spring XML 自定义配置，配置一组 Bean，例如：Student/Klass/School。
 */
public class Answer3 {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("application_hd.xml");
        Student student = (Student) context.getBean("100");
        System.out.println(student);
    }
}
