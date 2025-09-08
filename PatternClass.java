package patternclass;

import java.util.Scanner;

public class PatternClass {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println(" Enter the value ");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) {
               
                System.out.print(j);
             
            }
            System.out.println();
        }
    }

}
