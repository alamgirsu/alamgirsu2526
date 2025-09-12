
package palindromeornot;
import java.util.Scanner;

public class PalindromeOrNot {

   
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        long id ,lastFour,temp,rem,sum=0,count=0;
        id = input.nextLong();
        lastFour = id%10000;
        System.out.println("Last Four Digit :  "+lastFour);
        
        
        temp = lastFour;
        while(temp!=0)
        {
            rem=temp%10;
            sum = sum*10 + rem;
            temp = temp/10;
            
        }
        System.out.println("Reverse Number :  "+sum);
        if(lastFour == sum)
        {
            System.out.println("Palindrome Number");
            
        }
        else{
            System.out.println("Not Palindrome");
        }
        
        
        if(sum==0 || sum==1)
        {
         System.out.println("Not Prime");
        }else{
            for(int i=2; i<=Math.sqrt(sum); i++)
            {
                if(sum%i==0)
                {
                    count++;
                    break;
                }
            
            }
            
        }
        if(count==0)
        {
            System.out.println("Prime Number");
        }else{
            
            System.out.println("Not prime");
        }
            
        
    }
    
}
