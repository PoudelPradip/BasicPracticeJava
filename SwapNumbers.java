package Test1017;

import java.util.Scanner;

/*
Swapping two numbers without a third variable

1. Start
2. Declare two numbers, num1 and num2.
3. Assign the value of num1 and num2.
4. Add num1 and num2 and assign it to num2.
5. Swap num1 by subtracting num1 from num2.
6. Swap num2 by subtracting num1 from num2.
7. Print num1 and num2.
8. End.
 */
public class SwapNumbers {
    public static void main(String[] args) {
        int num1, num2;
        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter the value of num1: ");
        num1 = newScan.nextInt();
        System.out.println("Enter the value of num2: ");
        num2 = newScan.nextInt();

        num2 = num1 + num2;
        num1 = num2 - num1;
        num2 = num2 - num1;
        System.out.println("The changed value of num1 is: "+num1);
        System.out.println("The changed value of num2 is: "+num2);
    }
}
