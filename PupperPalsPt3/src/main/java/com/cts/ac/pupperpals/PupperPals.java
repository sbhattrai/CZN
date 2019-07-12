package com.cts.ac.pupperpals;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cts.ac.pupperpals.controller.PupperController;

public class PupperPals {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		PupperController controller = ctx.getBean("Controller", PupperController.class);
	}

}
