package com.nith.springu;

import javax.swing.Spring;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

public class DrawingApp {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//triangle triangle = new triangle();

		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("Spring.xml"));
		ApplicationContext daj = new ClassPathXmlApplicationContext("Spring.xml");
		triangle fdsd = (triangle) daj.getBean("triangle");
		fdsd.draw();

	}

}
