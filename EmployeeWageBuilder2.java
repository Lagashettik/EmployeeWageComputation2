
public class EmployeeWageBuilder2 {

	EmployeeWageBuilder2() {
		System.out.println("Welcome to Employee Wage Computation");

		}

	void EmployeeWage(){

		int isFullTime=1;
		int WagePerHour=20;
		int NoOfHours;

		double empCheck= Math.floor(Math.random() * 10) % 2;

		if(empCheck == isFullTime) {
			System.out.println("Employee is Present");
			NoOfHours=8;
			}
		else {
			System.out.println("Employee is absent");
			NoOfHours=0;
			}

		int Payment= WagePerHour * NoOfHours;
		System.out.println("Payment is "+Payment);
		}

	public static void main(String args[]) {
		EmployeeWageBuilder2 employee = new EmployeeWageBuilder2();

		employee.EmployeeWage();

		}
}
