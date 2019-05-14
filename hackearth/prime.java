import java.util.*;

public class prime 
{
    public static void main(String[] args) {
        System.out.println("hello world");

        int num=29;
        boolean flag=false;
        for (int i = 2; i <=num/2; i++) {
            
            //condition for non prime 
            if (num%i==0) {
                flag=true;
                break;
                
            }
        }
        if (flag) {
            System.out.println("not a prime ");
        }
        else{
            System.out.println("yes it is prime");
        }
    }

    
}
