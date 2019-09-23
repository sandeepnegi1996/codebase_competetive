# Recursion
1. when a function call to itself i know you all know this boring definition 
so let me elaborate some more points
    * whenever a function is being called it is pushed in the stack which is called as callstack
    and as soon as its work is over it will be popped out of the stack
    * all the recursion function must have a base case where it should stop
    
```java
      public static void reduce(int n){
        if (n>=0) {
            reduce(n-1);    
        }
        System.out.println(n);
        
    }
    public static void main(String[] args) {
        reduce(3);
    }
```
