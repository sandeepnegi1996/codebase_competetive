import java.util.*;

class TestClass
{
    public static void main(String[] args) {
        System.out.println("hello world");
        int []arr={1,4,5};
        //misssing number is 1,3

        int x1=arr[0];
        int arrsum=0;
        for (int i = 0; i < arr.length; i++) 
        {
            arrsum+=arr[i];    
        }

        for (int i = 1; i < arr.length; i++) 
        {
            x1^=arr[i];
           
        }

        int x2=1;

        for (int i = 2; i <= 5; i++)
         {
            x2^=i;    
        }
        int result=x1^x2;
      //  System.out.println(result);

        int sum=(5*(5+1))/2;
        int diff=sum-arrsum;
       // System.out.println(diff);

       int mid=diff/2;
      // System.out.println(mid);
        int x1after=0;
        int x2after=0;
       for (int i = 1; i < arr.length; i++) 
       {
            if (arr[i]<=mid) 
            {
                x1after^=arr[i];
            } 
            else{
                x2after^=arr[i];
            }   
       }
       
       for (int i = 2; i <= 5; i++) 
       {
            if (i<=mid) 
            {
                x1after^=i;    
            }
            else{
                x2after^=i;
            }    
       }
       
       System.out.println(x1after);
       System.out.println(x2after);
        
    
    }
}