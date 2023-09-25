package multiple;

public class Bank implements Sbi, Rbi {

	private void loan() {
		System.out.println("loan is 7%");
	}

	@Override
	public void fixed() {
		System.out.println("fixed is 5%");
	}

	@Override
	public void savings() {
		System.out.println("savings is 6%");
	}

	@Override
	public void deposit() {
		System.out.println("deposit is 8%");
	}

	@Override
	public void goldLoan() {
		System.out.println("Gold Loan is 7%");
	}

	@Override
	public void housingLoan() {
		System.out.println("Housing Loan is 10%");
	}

	@Override
	public void personalLoan() {
		System.out.println("personal loan is 9%");
	}

	public static void main(String[] args) {
	
		Bank b = new Bank();
		b.loan();
		b.deposit();
		b.fixed();
		b.goldLoan();
		b.housingLoan();
		b.savings();
		b.personalLoan();

	}

}

//   ---------Multiple Inheritance--------------
