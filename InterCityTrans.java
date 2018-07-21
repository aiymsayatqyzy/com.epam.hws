package epam.com.secondapphw1;

public class InterCityTrans extends PublicTransport {

	String serviceCompany;

	public String getServiceCompany() {
		return serviceCompany;
	}

	public void setServiceCompany(String serviceCompany) {
		this.serviceCompany = serviceCompany;
	}

	@Override
	public String toString() {
		return "InterCityTrans [serviceCompany=" + serviceCompany + "]";
	}

	
	
}
