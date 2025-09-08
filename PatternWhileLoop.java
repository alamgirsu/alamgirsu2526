package patternwhileloop;

import java.util.Scanner;

public class PatternWhileLoop {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the value: ");
        int n = input.nextInt();

        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print('*');
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
