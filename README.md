# Competetive Coding(CP)

## Beginnning with the Bang

## Rules:-
    * Daily 2 coding problems or one 
    * Read someone else solution
    * implement Algorithm
    * implement DataStructure

#### I will make sure i will face the coding every single day

##### My Learnings:-


## Ques1. check palindrome of a given string

1. get the string input put the string in string buffer and then apply the reverse function
and then use equals method to check whether both are equal or not 

```java

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
```

2. second approach to solve this problem is compare first with the last and then increae the start
and decrease the last if this occur flawlessly than its cool otherwise it is not a palindrome

```java
 public static void secondApproach(String s){
        int start=0;
        int end=s.length()-1;
        int flag=0;
        while (start<end) {
            if (s.charAt(start)==s.charAt(end)) {
                start++;
                end--;
                
            } else {
                flag=1;
                break;
            }   
            
        }
        if (flag==0) {
            System.out.println(" palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
```

3. Reversing the string 
 1. **reversing iteratively** traverse the string from reverse and add each element from the reverse to a new string
```java
  public static void stringReverseIterative(String s){
        String s1="";
        
        for (int i = s.length()-1; i >=0 ; i--) 
            s1+=s.charAt(i);
        
        System.out.println(s1);

    }

```
 2. **Reversing recursively** take last character and again call the funtion with smaller string
```java
public static String stringReverseRecursively(String s){

        if (s.isEmpty() || s==null) 
            return s;
            
        return s.charAt(s.length()-1)+stringReverseRecursively(s.substring(0, s.length()-1));
    }
```
