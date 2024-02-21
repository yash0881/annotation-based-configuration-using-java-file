package org.annotation.based.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.URI;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfigFile.class);
        Student st = (Student) context.getBean("student");
        System.out.println(st);
    }
}