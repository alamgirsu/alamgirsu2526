package studentidcheak;


import java.util.Scanner;

public class StudentIDCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter last 4 digits of Student ID: ");
        int id = sc.nextInt();

        int reverse = 0, temp = id;
        while (temp != 0) {
            reverse = reverse * 10 + temp % 10;
            temp /= 10;
        }

        if (id == reverse) {
            System.out.println(id + " is a Palindrome");
        } else {
            System.out.println(id + " is NOT a Palindrome");
        }

        boolean isPrime = true;
        if (reverse < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= reverse / 2; i++) {
                if (reverse % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println("Reverse number " + reverse + " is Prime");
        } else {
            System.out.println("Reverse number " + reverse + " is NOT Prime");
        }
        sc.close();
    }
}
