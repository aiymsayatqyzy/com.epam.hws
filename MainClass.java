package epam.com.secondapphw1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bus publicBus = new Bus();
		publicBus.setCountSits(24);
		
		Train talgo = new Train();
		talgo.setCountWagons(15);
		talgo.setCountPartSit("coupe");
		
		Plane publicTrain = new Plane();
		publicTrain.setCountEngine(1);
		publicTrain.setEngineType("turbo");
		
		System.out.println(publicBus);
		System.out.println(talgo);
		System.out.println(publicTrain);
		
	}

}
