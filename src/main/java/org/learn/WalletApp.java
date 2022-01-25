package org.learn;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class WalletApp {

	public static void main(String[] args) {
		
//		Paso 2: Crear un Spring container
		ClassPathXmlApplicationContext context  = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
//		Paso 3: Sacar los beans del Spring container
		Funder funder = context.getBean("myFund", Funder.class);
		
		System.out.println(funder.fund());
		
		context.close();
	}
}
