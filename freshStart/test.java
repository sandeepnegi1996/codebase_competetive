import java.util.*;

class Test{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        String s1=scan.next();

        StringBuffer str=new StringBuffer();
        str.append(s1);
        System.out.println(str);

         str.reverse();
         
         String s2=str.toString();
         System.out.println(s2);
        if (s1.equals(s2)) {
            System.out.println("palindrome");
            
        } else {
            System.out.println("not palindrome");
        }
        System.out.println();
    }
}