import java.util.Scanner;

public class SwapLastFast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        int num = n;
        int last = num % 10;

   
        int first = num;
        int count = 0;
        while (first >= 10) {
            first /= 10;
            count++;
        }

  
        int middle = n % (int)Math.pow(10, count);
        middle /= 10;

        int swapped = last * (int)Math.pow(10, count) + (middle * 10) + first;

        System.out.println("Number after swapping = " + swapped);
        sc.close();
    }
}
