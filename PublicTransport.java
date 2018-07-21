package epam.com.secondapphw1;

public class PublicTransport {

	int id;
	String type;
	String colour;
	int yearOfIssue;
	String makeTrans; // марка, к примеру BMW, Toyota и т.д.
	double engineVolume;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getYearOfIssue() {
		return yearOfIssue;
	}
	public void setYearOfIssue(int yearOfIssue) {
		this.yearOfIssue = yearOfIssue;
	}
	public String getMakeTrans() {
		return makeTrans;
	}
	public void setMakeTrans(String makeTrans) {
		this.makeTrans = makeTrans;
	}
	public double getEngineVolume() {
		return engineVolume;
	}
	public void setEngineVolume(double engineVolume) {
		this.engineVolume = engineVolume;
	}

	@Override
	public String toString() {
		return "PublicTransport [id=" + id + ", type=" + type + ", colour=" + colour + ", yearOfIssue=" + yearOfIssue
				+ ", makeTrans=" + makeTrans + ", engineVolume=" + engineVolume + "]";
	}
	
	
}
