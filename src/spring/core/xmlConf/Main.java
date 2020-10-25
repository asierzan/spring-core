package spring.core.xmlConf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Airports londonLuton = appContext.getBean("flightToLondon",Airports.class);
		Airports warsawChopin = appContext.getBean("flightToWarsaw",Airports.class);
		
		System.out.println(londonLuton.getDeparturePlace());
		System.out.println(warsawChopin.getDeparturePlace());
		
		appContext.close();
	}

}
