import java.sql.SQLOutput;
import java.util.Scanner;

public class Employee {
    public static void main(String[] args) {
        System.out.println("Namaste!");
        int totalDays = 26;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your EmpId (101-105)");
        int empId = sc.nextInt();

        if (empId == 101) {
            System.out.println("Hello Ram");
            int wageEmp = (1000 * totalDays);
            System.out.println("your salary is " + wageEmp);
        }
        if (empId == 102) {
            System.out.println("Hello Sita");
            int wageEmp = (750 * totalDays);
            System.out.println("your salary is " + wageEmp);
        } else if (empId == 103) {
            System.out.println("Hello Radha");
            int wageEmp = (1300 * totalDays);
            System.out.println("your salary is " + wageEmp);
        } else if (empId == 104) {
            System.out.println("Hello Krishna");
            int wageEmp = (1500 * totalDays);
            System.out.println("your salary is " + wageEmp);
        } else if (empId == 105) {
            System.out.println("Hello Shiva");
            int wageEmp = (1420 * totalDays);
            System.out.println("your salary is " + wageEmp);
        } else {
            System.out.println("It is invalid \n Enter valid Employee ID");
        }
    }
}
