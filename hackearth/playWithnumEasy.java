import java.util.*;

class TestClass
{
    public static void main(String[] args) {
        System.out.println("hello world");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int q=s.nextInt();
        int a[]=new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i]=s.nextInt();    
        }
        int l=0;
        int r=0;
        int mid=0;
        while (q-->0) {
            l=s.nextInt();
            r=s.nextInt();
            mid=(r-l+1)/2;

            System.out.println(a[mid]);
        }
    }
}