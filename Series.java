package series;

import java.util.Scanner;

public class Series {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value =");

        int n = input.nextInt();
        int i, N = 0 ;
        for (i = 1; i <= n; i = i + 2) {
            System.out.print(i + " ");

         N = N + i;
        }

        System.out.println();
        System.out.println(N);
    }

}
