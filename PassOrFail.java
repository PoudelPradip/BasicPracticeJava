package Test1017;

/*
Student passed or Failed?
1. Start.
2. Declare c1, c2, c3, c4, grade
3, Take the value of the courses.
4. Calculate Grade.
5. Check if Student passed(Grade should be 60 or more).
6. Display respective message.
7. End
*/

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        double c1, c2, c3, c4, Grade;
        Scanner newScan = new Scanner(System.in);
        System.out.println("Enter the points for 1st course: ");
        c1 = newScan.nextDouble();
        System.out.println("Enter the points for 2nd course: ");
        c2 = newScan.nextDouble();
        System.out.println("Enter the points for 3rd course: ");
        c3 = newScan.nextDouble();
        System.out.println("Enter the points for 4th course: ");
        c4 = newScan.nextDouble();

        Grade = (c1+c2+c3+c4)/4;
        if (Grade>=60){
            System.out.println("Congrats, you passed the course!!!");
        }else {
            System.out.println("Sorry you failed the course. Better luck next time.");
        }
    }
}
