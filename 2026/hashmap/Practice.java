import java.util.HashMap;

public class Practice {
    public static void main(String[] args) {
        HashMap<Integer,String> map =  new HashMap<>();

        map.put(1,"sandeep" );
        map.put(1,"priyu");

        System.out.println(map);


        //custom object as key in hashmap

        Student s1 = new Student(1, "sandeep");
        Student s2 =  new Student(1, "sandeep");

        HashMap<Student,String> studentMap =  new HashMap<>();

        //here key is same for the hashmap 
        studentMap.put(s1,"sandeep");
        studentMap.put(s2,"priyu");


        System.out.println(studentMap);

        // mutable keys 

           Student s3 = new Student(1, "sandeep");

           HashMap<Student,String> studentMap2 =  new HashMap<>();

           studentMap2.put(s3, "value");   // this goes to bucket 1 

           s3.id = 5;


           
           System.out.println(studentMap2.get(s3));



    }
}
