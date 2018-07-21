package epam.com.secondapphw1;

public class InterCountryTrans extends PublicTransport {

	String companyName;

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "InterCountryTrans [companyName=" + companyName + "]";
	}
	
	
}
