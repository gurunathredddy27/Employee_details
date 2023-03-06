import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Namaste!");
        Scanner sc = new Scanner(System.in);
        System.out.println("choose one number");
        int a = sc.nextInt();
        System.out.println("choose another number");
        int b = sc.nextInt();

        System.out.println("enter your choice: \n 1)Add \n 2)Sub \n 3)Mul \n 4)Div \n 5)Remainder ");
        int choice = sc.nextInt();

        if(choice == 1){
            int add = a + b;
            System.out.println("the addition of two numbers "+ add);
        } else if(choice == 2){
            int sub = a - b;
            System.out.println("the subtraction of two numbers "+ sub);
        } else if (choice == 3) {
            int mul = a * b;
            System.out.println("the multiplicaiton of two number " + mul);
        } else if (choice == 4){
            int div = a / b;
            System.out.println("the division of two numbers "+ div);
        } else if (choice == 5) {
            int mod = a % b;
            System.out.println("The remainder is  "+mod);
        }

        else{
            System.out.println("it is invalid option");
        }

    }
}
