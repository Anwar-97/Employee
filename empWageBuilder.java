public class empWageBuilder 
{
	public static final int IS_PRESENT = 2;
	public static final int IS_PART_TIME = 1;
	public static final int WAGE_RATE = 20;
	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation Program");
		int fullDayHour = 8;
		int partTimeHour = 4;
		int dailyWage = 0;
		int monthlyWage = 0;
		int totalWorkHour = 0;
		int totalWorkDay = 0;
		while (totalWorkHour < 100 && totalWorkDay < 20) {
			double empCheck=Math.floor(Math.random() * 10) % 3;

			switch (empCheck) {
				case IS_PRESENT:
					dailyWage = (WAGE_RATE * fullDayHour);
					monthlyWage += dailyWage;
					totalWorkHour += fullDayHour;
					break;
				case IS_PART_TIME:
					dailyWage = (WAGE_RATE * partTimeHour);
                                        monthlyWage += dailyWage;
                                        totalWorkHour += partTimeHour;
					break;
				default:
					dailyWage = 0;
                                        monthlyWage += dailyWage;
                                        totalWorkHour += 0;
			}
			totalWorkDay++;
		}
	System.out.println("Monthly Wage of the Employee is: " +monthlyWage);
	System.out.println("Total work days of the Employee ina month is: " +totalWorkDay);
	System.out.println("Total no. of hours an Employee worked in a month is: " +totalWorkHour);
	}
}

