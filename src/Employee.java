import java.sql.SQLOutput;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Namaste!");
        int totalDays = 20;
        int perHourRs = 20;
        int fulDayHours = 8;
        Scanner sc = new Scanner(System.in);
        String[] empName = {"Ram", "Sita", "Radha", "Krishna", "Shiva"};


        System.out.println("Enter your EmpId (101-105)");
        int empId = sc.nextInt();

        if (empId == 101) {
            System.out.println("Hello Ram");
            int wageEmp = ((perHourRs * fulDayHours) * totalDays);
            System.out.println("your salary this month is " + wageEmp);
        }
        if (empId == 102) {
            System.out.println("Hello Sita");
            int wageEmp = ((perHourRs * fulDayHours) * totalDays);
            System.out.println("your salary this month is " + wageEmp);
        } else if (empId == 103) {
            System.out.println("Hello Radha");
            int wageEmp = ((perHourRs * fulDayHours) * totalDays);
            System.out.println("your salary this month is " + wageEmp);
        } else if (empId == 104) {
            System.out.println("Hello Krishna");
            int wageEmp = ((perHourRs * fulDayHours) * totalDays);
            System.out.println("your salary this month is " + wageEmp);
        } else if (empId == 105) {
            System.out.println("Hello Shiva");
            int wageEmp = ((perHourRs * fulDayHours) * totalDays);
            System.out.println("your salary this month is " + wageEmp);
        }
    }
}