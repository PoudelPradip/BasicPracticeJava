package Test1017;

/*
Odd numbers between 1001 and 1200
1. Start
2. Declare num.
3. Assign num the value of 1001.
4. Increase num by 2 and print it until num is less than 2000.
5. End

*/
public class OddNumbers {
    public static void main(String[] args) {
        int num = 1001;
        for(int i = num; i<1999; i = i+2){
            System.out.println((i+2));
        }

    }
}
