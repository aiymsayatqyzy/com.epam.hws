package epam.com.secondapphw1;

public class Bus extends CityTrans {

	int countSits;
	
	public int getCountSits() {
		return countSits;
	}
	public void setCountSits(int countSits) {
		this.countSits = countSits;
	}
	
	@Override
	public String toString() {
		return "Bus [countSits=" + countSits + "]";
	}
	
}
