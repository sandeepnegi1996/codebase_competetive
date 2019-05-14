import java.util.*;

class TestClass
{
   
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
      
        for (int i = 0; i < n; i++) 
        {
            a[i]=s.nextInt();    
           
        }
        int max=0;
        int calculatedMax=0;
        int sum=0;
        for (int i = 0; i <n; i++) 
        {
            //first check for first element
            sum=0;
            

            
            for (int j = i; j < kahntkjana; j++)
            {
                sum=sum+a[j];
            }

            System.out.println(sum);
            if (sum>max) 
            {
                max=sum;    
            }
            
        }
        System.out.println(max);
}
}
