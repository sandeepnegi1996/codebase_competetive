import java.util.*;


class TestClass
{
    public static void main(String[] args) {
        System.out.println("hello world");

        Scanner s=new Scanner(System.in);
        int x=s.nextInt();

        for (int i = 1; i <= x; i++)
        {
            if (i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
                
            }
            else if (i%3==0)
            {
                System.out.println("Fizz");
            }
            else if (i%5==0) 
            {
                System.out.println("Buzz");    
            }
            else
            {
                System.out.println(i);
            }
        }
    }
}