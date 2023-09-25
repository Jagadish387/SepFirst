package hybrid;


public class IndustryVehicle implements LiteVehicle, PublicVehicle {

	private void crane() {
		System.out.println("crane using in high level infrastructure");
	}

	@Override
	public void train() {
		System.out.println("train is public transport");
	}

	@Override
	public void fireTruck() {
		System.out.println("firetruck is emergency vehicle");
	}

	@Override
	public void tractor() {
		System.out.println("tractor can use multi purpose");
	}

	@Override
	public void car() {
		System.out.println("car is use for personal & rental");
	}

	@Override
	public void bike() {
		System.out.println("bike is peronal use");
	}

	public static void main(String[] args) {
		IndustryVehicle iv = new IndustryVehicle();
		iv.bike();
		iv.car();
		iv.crane();
		iv.fireTruck();
		iv.tractor();
		iv.train();
	}
}

// ------------Hybrid Inheritance-----------