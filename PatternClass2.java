package patternclass2;

import java.util.Scanner;

public class PatternClass2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        System.out.println(" Enter the value ");
        for (int i = 5; i >= n; i--) {
            for (int j = 5; j >=i; j--) {
               
                System.out.print(j);
             
            }
            System.out.println();
        }
    }

}
