package spring.core.xmlConf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainScope {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("applicationContextScope.xml");
		
		Airports londonAirport = appContext.getBean("flightToLondon",Airports.class);
		Airports warsawAirport = appContext.getBean("flightToWarsaw",Airports.class);
		
		System.out.println("Indicate to the same object: "+ londonAirport.equals(warsawAirport));
		System.out.println("LondonAirport location in memory: "+ londonAirport);
		System.out.println("WarsawAirport location in memory: "+ warsawAirport);
		
		appContext.close();
	}

}
