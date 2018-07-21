package epam.com.secondapphw1;

public class Plane extends InterCountryTrans{

	String engineType;
	int countEngine;
	
	public String getEngineType() {
		return engineType;
	}
	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}
	public int getCountEngine() {
		return countEngine;
	}
	public void setCountEngine(int countEngine) {
		this.countEngine = countEngine;
	}
	
	@Override
	public String toString() {
		return "Plane [engineType=" + engineType + ", countEngine=" + countEngine + "]";
	}
	
	
	
}
