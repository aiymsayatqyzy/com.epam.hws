package epam.com.secondapphw1;

public class CityTrans extends PublicTransport {

	String fleetName; // название парка, к которому относится

	public String getFleetName() {
		return fleetName;
	}

	public void setFleetName(String fleetName) {
		this.fleetName = fleetName;
	}

	@Override
	public String toString() {
		return "CityTrans [fleetName=" + fleetName + "]";
	}
	
	
}
