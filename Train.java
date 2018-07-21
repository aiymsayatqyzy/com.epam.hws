package epam.com.secondapphw1;

public class Train extends InterCityTrans {
	
	int countWagons;
	String countPartSit;
	
	public int getCountWagons() {
		return countWagons;
	}
	public void setCountWagons(int countWagons) {
		this.countWagons = countWagons;
	}
	public String getCountPartSit() {
		return countPartSit;
	}
	public void setCountPartSit(String countPartSit) {
		this.countPartSit = countPartSit;
	}
	
	@Override
	public String toString() {
		return "Train [countWagons=" + countWagons + ", countPartSit=" + countPartSit + "]";
	}
	
	
	 
}
