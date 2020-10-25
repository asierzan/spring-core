package spring.core.xmlConf;

public class WarsawChopinAirport implements Airports {
	
	public Messages message;
	private String typeOfPlane;
	private int flightDuration;

	public WarsawChopinAirport() {
		
	}
	
	public void setMessage(Messages message) {
		this.message = message;
	}
	
	
	public String getTypeOfPlane() {
		return typeOfPlane;
	}

	public void setTypeOfPlane(String typeOfPlane) {
		this.typeOfPlane = typeOfPlane;
	}

	public int getFlightDuration() {
		return flightDuration;
	}

	public void setFlightDuration(int flightDuration) {
		this.flightDuration = flightDuration;
	}

	@Override
	public String getDeparturePlace() {
		return "from Funchal Cristiano Ronaldo Airport to Warsaw Chopin";
	}

	@Override
	public int getNumberOfPassengers() {
		return 75;
	}

}
