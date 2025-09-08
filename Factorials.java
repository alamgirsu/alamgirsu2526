package factorials;

public class Factorials {

    public static void main(String[] args) {

        System.out.println("Enter the value ");
        int i=1, fact = 1;
        do {
            System.out.println(fact);
          
            fact = fact * i; 
            ++i;
        }
        while(i<=6);
    }

}
