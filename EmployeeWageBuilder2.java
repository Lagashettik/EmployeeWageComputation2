
public class EmployeeWageBuilder2 {

	EmployeeWageBuilder2() {
		System.out.println("Welcome to Employee Wage Computation");

		}

	void EmployeeWage(){

		int isFullTime=1;

		double empCheck= Math.floor(Math.random() * 10) % 2;

		if(empCheck == isFullTime)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is absent");

		}

	public static void main(String args[]) {
		EmployeeWageBuilder2 employee = new EmployeeWageBuilder2();
		employee.EmployeeWage();

		}
}
