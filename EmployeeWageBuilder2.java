
public class EmployeeWageBuilder2 {

	EmployeeWageBuilder2() {
		System.out.println("Welcome to Employee Wage Computation");

		}

	void EmployeeWage(){
		int isFullTime=1;
		int isPartTime=2;
		int WagePerHour=20;
		int NoOfHours=0;
		int Month=20;	//Here One Month as 20 Days

		int empCheck=(int) Math.floor(Math.random() * 10) % 3;

		switch (empCheck) {
		case 1:
			System.out.println("Employee is Full Time");
			NoOfHours=8;
			break;
		case 2:
			System.out.println("Employee is Part Time");
			NoOfHours=4;
			break;
		case 0:
			System.out.println("Employee is absent");
			NoOfHours=0;
			break;
			}

		int Payment= WagePerHour * NoOfHours * Month;
		System.out.println("Payment of One Month is "+Payment);
		}

	public static void main(String args[]) {
		EmployeeWageBuilder2 employee = new EmployeeWageBuilder2();

		employee.EmployeeWage();

		}
}
