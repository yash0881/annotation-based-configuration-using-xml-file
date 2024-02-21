package org.annotation.based.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URI;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        URI location = URI.create("/applicationContext.xml");
        ApplicationContext context = new ClassPathXmlApplicationContext(String.valueOf(location));
        Student std = (Student) context.getBean("student");
        System.out.println(std);

    }
}