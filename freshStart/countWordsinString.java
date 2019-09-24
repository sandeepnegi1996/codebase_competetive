import java.util.*;

class test{
    public static void countWords(String str){
        char arr[]=str.toCharArray();
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==' ') {
                count++;
            }
            
        }
        System.out.println(++count);
        

    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String str=scan.nextLine();
       
        countWords(str);
    }
}