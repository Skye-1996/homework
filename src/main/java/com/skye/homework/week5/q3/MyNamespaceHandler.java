package com.skye.homework.week5.q3;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

public class MyNamespaceHandler extends NamespaceHandlerSupport {
    @Override
    public void init() {
        registerBeanDefinitionParser("student",new StudentBeanDefinitionParser(Student.class));
        registerBeanDefinitionParser("class",new KlassBeanDefinitionParser(Klass.class));
        registerBeanDefinitionParser("school",new SchoolBeanDefinitionParser(School.class));

    }
}
