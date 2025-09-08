
package timetable;

import java.util.Scanner;

public class TimeTable {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,n;
        System.out.println("Enter the value ");
        n = input.nextInt();
      
        
        for( i = 1; i<= 10; i++)
        {
          System.out.println( n+ " X " +i +" = " + n*i );
        }
        
    }
    
}
