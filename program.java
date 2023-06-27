import java.util.Scanner;

public class program {

    static Scanner scaner = new Scanner(System.in);

    public static void main(String[] args) {
        // boolean f = true;
        // while(f) {
        //     System.out.println("Task 1 - 1");
        //     System.out.println("Task 2 - 2");
        //     System.out.println("Task 3 - 3");
        //     System.out.println("Task 4 - 4");
        //     System.out.println("Exit - 5");
        //     System.out.println("Enter task number = ");
        //     int task_n = Integer.parseInt(scaner.nextLine());
        //     if(task_n == 1){
        //         task1();
        //     } else if(task_n == 2){
        //         task2();
        //     }
        // }
        System.out.println(task3());
    }

    static void task1(){

        System.out.println("Enter n = ");
        int n = Integer.parseInt(scaner.nextLine());
        int res = 0;
        int res2 = 1;


        for (int i = 1; i <= n; i++) {
            res += i;
            res2 *=  i;
        }

        System.out.printf("Sum 1 to n = %d", res);
        System.out.println();
        System.out.printf("Multiply 1 to n = %d", res2);

    }

    static void task2(){

        for (int n = 2; n < 1001; n++) {
            boolean flag = true;
            for (int i = 2; i <= Math.sqrt(n) ; i++) {
                if (n % i == 0){
                    flag = false;
                    break;
                }
            }
            if(flag)
                System.out.println(n);
        }
    }

    static Object task3(){
        System.out.println("Enter first digit = ");
        System.out.println();

        int first = Integer.parseInt(scaner.nextLine());

        System.out.println("Enter second digit = ");
        System.out.println();

        int second = Integer.parseInt(scaner.nextLine());

        System.out.println("Enter option");
        System.out.println("Sum - '+'");
        System.out.println("Difference - '-'");
        System.out.println("Multiply - '*'");
        System.out.println("Sum - '/'");

        String option = scaner.nextLine();


        if (option.equals("+")) {
            return first + second;
        } else if (option.equals("-")) {
                return first - second;
        } else if (option.equals("*")) {
            return first * second;
        } else if (option.equals("/")) {
            return (double) first / second;
        }

        return null;

    }
    
}