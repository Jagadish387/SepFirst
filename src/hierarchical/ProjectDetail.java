package hierarchical;

import inheritance.Employee;

public class ProjectDetail extends Employee {

	public void projectName() {
		System.out.println("E-Commerce");
	}

	public void projectId() {
		System.out.println("0002");
	}

	public static void main(String[] args) {

		ProjectDetail pd = new ProjectDetail();
		pd.projectId();
		pd.projectName();
		pd.empId();
		pd.empName();
	}

}

// ---------Hierarchical Inheritance---------
