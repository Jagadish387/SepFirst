package inheritance;

public class Client extends Company{

	private void clientId() {
		System.out.println("Client id id : 001 ");
	}

	private void clientName() {
		System.out.println("Client name is : Medicare Industry");
	}

	public static void main(String[] args) {
		
		Client cl = new Client();
		cl.clientId();
		cl.clientName();
		cl.compId();
		cl.compName();
		cl.empId();
		cl.empName();
	}
}

//   ---------Multilevel Inheritance---------