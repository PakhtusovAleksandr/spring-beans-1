package ru.be_prog;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringBeansApplication {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        SpringHelloWorld springHelloWorld = (SpringHelloWorld) context.getBean("hello-bean");
        System.out.println(springHelloWorld.getMessage());
    }
}
