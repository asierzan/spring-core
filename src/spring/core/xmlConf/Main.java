package spring.core.xmlConf;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext appContext = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Airports londonLuton = appContext.getBean("flightToLondon",Airports.class);
		Airports warsawChopin = appContext.getBean("flightToWarsaw",Airports.class);
		
		WarsawChopinAirport flightToWarsaw = appContext.getBean("flightToWarsaw",WarsawChopinAirport.class);
		
		Messages positiveMesage = appContext.getBean("positiveMessage",Messages.class);
		Messages tragicMessage = appContext.getBean("tragicMessage",Messages.class);
		
		System.out.println("Flight: "+londonLuton.getDeparturePlace());
		System.out.println("Number of passengers: "+londonLuton.getNumberOfPassengers());
		System.out.println("Message: "+positiveMesage.getMessage());
		
		System.out.println("Flight: "+ warsawChopin.getDeparturePlace());
		System.out.println("Number of passengers: "+warsawChopin.getNumberOfPassengers());
		System.out.println("Message: "+tragicMessage.getMessage());
		
		System.out.println("Flight duration: "+flightToWarsaw.getFlightDuration());
		System.out.println("Type of plane: "+flightToWarsaw.getTypeOfPlane());
		
		appContext.close();
	}

}
