import java.util.*;


class TestClass
{
    public static void main(String[] args) {
        System.out.println("hello world");

        Scanner s=new Scanner(System.in);
        int rupee=s.nextInt();
        //the coin system i am using is the (1,2,5)
        int []changes={1,2,5};
        int i=changes.length-1;
        int numberOfCoins=0;
        while (rupee>0) 
        {
            numberOfCoins+=rupee/changes[i];
            rupee=rupee%changes[i];
            --i;
        }
        System.out.println(numberOfCoins);

    }
}