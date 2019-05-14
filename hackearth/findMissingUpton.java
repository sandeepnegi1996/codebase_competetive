import java.util.*;




class TestClass
{
    public static void main(String[] args) {
        System.out.println("hello world");
        int []arr={1,2,4,5};

        int n=5;
        int sum=(n*(n+1))/2;
        int Result=0;
        for (int i = 0; i <arr.length; i++) 
        {
            Result+=arr[i];    
        }
        System.out.println("missing element is "+ (sum-Result));
        
    }
}