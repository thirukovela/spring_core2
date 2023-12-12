package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {

        ApplicationContext context = new ClassPathXmlApplicationContext("stu.xml");
        Student st = (Student) context.getBean("student");
        School sc = (School) context.getBean("school");
        Health h = (Health) context.getBean("health");
        Marksheet m = (Marksheet) context.getBean("marks");

        System.out.println(st);
        System.out.println(sc);
        System.out.println(h);
        System.out.println(m);

    }
}
