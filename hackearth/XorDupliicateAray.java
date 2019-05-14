import java.util.*;


class TestClass
{
    public static void main(String[] args) {
        System.out.println("hello world");
        int []arr={1,3,4,2,3,1,4};

        int x1=arr[0];
        for(int i=1;i<arr.length;i++)
        {
            x1=x1^arr[i];

        }
        System.out.println(x1);
    }
}