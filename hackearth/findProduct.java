import java.util.*;

class TestClass
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] a=new int[n];
        long modulo=(long)Math.pow(10, 9)+7;
        long answer=1;
        for (int i = 0; i < n; i++) 
        {
            a[i]=s.nextInt();    
            answer=(answer*a[i])%modulo;
        }
        System.out.println(answer);
    }
}
/*abstract

ong prod = 1;
        for(int i =0; i<N; i++){
            prod = (prod * Integer.parseInt(str[i])) % ((long)Math.pow(10,9) +7);
*/