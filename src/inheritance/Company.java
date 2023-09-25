package inheritance;

public class Company extends Employee {

	public void compId() {
		System.out.println("Company Id is : 12345");
	}

	public void compName() {
		System.out.println("Company Name is : Software Solutions");
	}

	public static void main(String[] args) {

		Company c = new Company();
		c.compId();
		c.compName();
		c.empId();
		c.empName();

	}
}

//    -------Single Inheritance--------