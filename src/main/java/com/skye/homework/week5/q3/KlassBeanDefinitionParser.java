package com.skye.homework.week5.q3;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.AbstractSimpleBeanDefinitionParser;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class KlassBeanDefinitionParser implements BeanDefinitionParser {

    private Class<?> beanclass;

    public KlassBeanDefinitionParser(Class<?> beanclass) {
        this.beanclass = beanclass;
    }

    @Override
    public BeanDefinition parse(Element element, ParserContext parserContext) {
        RootBeanDefinition beanDefinition = new RootBeanDefinition();
        beanDefinition.setBeanClass(beanclass);
        beanDefinition.setLazyInit(false);
        Integer id = Integer.parseInt(element.getAttribute("id"));
        String name = element.getAttribute("name");
        beanDefinition.getPropertyValues().add("id",id);
        beanDefinition.getPropertyValues().add("name",name);
        String beanName = element.getAttribute("beanName");
        beanDefinition.getPropertyValues().add("beanName", beanName);
        BeanDefinitionRegistry beanDefinitionRegistry = parserContext.getRegistry();
        beanDefinitionRegistry.registerBeanDefinition(beanName,beanDefinition);
        return beanDefinition;
    }
}
