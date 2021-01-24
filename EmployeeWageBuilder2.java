
public class EmployeeWageBuilder2 {

	EmployeeWageBuilder2() {
		System.out.println("Welcome to Employee Wage Computation");

		}

	void EmployeeWage(){
		int WagePerHour=20;
		int NoOfHours=0;
		int TotalHours=100;	// Max working Hours is 100 in One Month
		int TotalDays=20;	// Max Days in Month is 20 Days
		int day=1;

		while( day<=TotalDays ){
			int empCheck=(int) Math.floor(Math.random() * 10) % 2;
				//empCheck=0 then Employee is Part Time
				//empCheck=1 then Employee is Full Time

			switch (empCheck) {
				case 1:
					NoOfHours+=8;
					break;
				case 0:
					NoOfHours+=4;
					break;
				}

		if( TotalHours <= NoOfHours ){
			break;}

		day++;
	}

		int Payment= WagePerHour * NoOfHours * day;
		System.out.println("Total Payment of Employee is "+Payment);

		}

	public static void main(String args[]) {
		EmployeeWageBuilder2 employee = new EmployeeWageBuilder2();

		employee.EmployeeWage();

		}
}
