package Test1017;

/*
Check if given number is Prime number
1. Start.
2. Declare a number, number, check.
3. Check if the number is 1, if true display message.
4. Check if the number is 2, if true display Prime.
5. Check if the number is divisible by any numbers from 2 thru the number itself.
6. Display "Not Prime if divisible, Display Prime if not.
7. End.
 */

import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        int number;
        double check = 0;
        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter the number to check: ");
        number = newScan.nextInt();

        if (number == 1){
            System.out.println("The number is neither Prime nor Composite.");
        } else if (number == 2) {
            System.out.println(number +" is a Prime number.");
        }else {
            for (int i =2; i<number; i++ ){
                if (number%i == 0){
                    System.out.println(number + " is not Prime.");
                    check = 1;
                    break;
                }

            }
            if (check == 0){
                System.out.println("The number "+ number+ " is Prime.");
            }
        }


        }

    }

