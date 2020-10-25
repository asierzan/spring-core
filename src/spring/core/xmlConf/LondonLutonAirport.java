package spring.core.xmlConf;

public class LondonLutonAirport implements Airports {

	public Messages message;
	
	public LondonLutonAirport(Messages message) {
		this.message = message;
	}
	
	public void startMethod() {
		System.out.println("LondonLutonAirport: inside startMethod()");
	}
	
	public void destroyMethod() {
		System.out.println("LondonLutonsAirport: inside destroyMethod()");
	}

	@Override
	public String getDeparturePlace() {
		return "from Paris-Beauvais to London Luton";
	}

	@Override
	public int getNumberOfPassengers() {
		return 150;
	}

	

}
