import java.util.Objects;

public class Student {

     int id;
     String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override 
    public boolean equals(Object o) {
        if (this == o) {
            return true;
            
        }

        if (!(o instanceof Student)) {
            return false;
            
        }

       Student s = (Student) o;
       return id==s.id && Objects.equals(s.name, name);

    }

    @Override
    public int hashCode() {
        return Objects.hash(id,name);
    }

    @Override
    public String toString(){
        return id +"  :  " + name;
    }
    
}


