package com.spring.example;

import com.spring.example.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(UserService.class);
		annotationConfigApplicationContext.refresh();
		UserService bean = annotationConfigApplicationContext.getBean(UserService.class);
		bean.test();
	}
}
