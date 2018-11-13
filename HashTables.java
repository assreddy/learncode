import java.util.Enumeration;
import java.util.Hashtable;

public class HashTables {

  public static void main (String args[]){
    System.out.println("Learning Hash Tables");
    Hashtable<Student, String> hashTable = new Hashtable<>();
    Student s1 = new Student(1,"ln1", "fn1","cl1", "Male");
    Student s2 = new Student(2,"ln2", "fn2","cl2", "Male");
    Student s3 = new Student(3,"ln3", "fn3","cl3", "Female");
    Student s4 = new Student(4,"ln4", "fn4","cl4", "Female");

    hashTable.put(s1, "Son");
    hashTable.put(s2, "Doughter");
    hashTable.put(s3, "Parent");
    hashTable.put(s4, "Parent");

    System.out.println(hashTable.size());
    System.out.println(hashTable.get("Dheeraj"));


    Enumeration<Student> members = hashTable.keys();
    Student key;
    while(members.hasMoreElements()){
      key = members.nextElement();
      System.out.println(key.getStudentNo() +"  :  " +hashTable.get(key));

    }

  }

}
