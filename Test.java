package com.javatpoint;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: 605137323
 * Date: 02/04/17
 * Time: 08:58
 * To change this template use File | Settings | File Templates.
 */
public class Test {
    public static void main(String[] args) {
        Resource   resource = new ClassPathResource("applicationContext.xml");
        BeanFactory beanFactory= new XmlBeanFactory(resource);
        Student student= (Student) beanFactory.getBean("studetbean");

        student.displayInfo();




    }



}
