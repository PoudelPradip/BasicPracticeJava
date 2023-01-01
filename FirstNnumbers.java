package Test1017;

/*
Sum of first n numbers
1. Start
2. Declare num, Sum.
3. Take the value of num.
4. Add 1 thru num using the formula n(n+1)/2.
5. Print Sum.
6. End.
*/

import java.util.Scanner;

public class FirstNnumbers {
    public static void main(String[] args){
        int sum;
        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter the number of consecutive integers you want to add: ");
        int num = newScan.nextInt();
        sum = num*(num+1)/2;
        System.out.println("The sum of first" +num + "positive integers is: " + sum);
    }
}
