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

