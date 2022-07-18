package com.spring.ex02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest02 {

	public static void main(String[] args) {
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		PersonService person1 = (PersonService) factory.getBean("personService1"); //아이디 1번을 불러와서 출력 
		person1.sayHello();
		System.out.println();

		PersonService person2 = (PersonService) factory.getBean("personService2"); //아이디 2번을 불러와서 출력 
		person2.sayHello();
	
	}

}

