package ex_32_CollectionFramework_DSA.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab250_Comparable {
    public static void main(String[] args) {

        Student s1 = new Student("Vijay", 106, 17);
        Student s2 = new Student("Sanjay", 101, 12);
        Student s3 = new Student("Ajay", 109, 19);
        Student s4 = new Student("Jay", 103, 15);


        // Adding Students information into the studentlist array
        List <Student> studentList = new ArrayList();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        Collections.sort(studentList);
        // sorting of StudentList array is not possible as to on what basis will it sort?
        // id? or age? or alphabetically order of name?
        // because we havent given the way how we want it to sort for us
        // we can give using comparable -> compareTo()
        // we need to implement Comparable with Student class

        //automatically it will now be sorted on the basis of rollNo
        System.out.println(studentList);
        // Output - [Student {Name: Vijay Roll No: 101 Age: 13}, Student {Name: Sanjay Roll No: 106 Age: 15}, Student {Name: Ajay Roll No: 109 Age: 17}]
    }
}

class Student implements Comparable <Student>{

    private String name;
    private Integer rollNo;
    private Integer age;

    // Parameterized Constructor
    public Student(String name, Integer rollNo, Integer age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    //override method of toString
    @Override
    public String toString() {
        //return super.toString();
        return "Student {" +
                "Name: " + name +
                " Roll No: "+ rollNo +
                " Age: " + age + "}";
    }

    // we need to implement a method -> compareTo()
    // sorting based on rollNo
    /*
    @Override
    public int compareTo(Student o) {
        return this.rollNo - o.rollNo;
    }
    */

    // sorting based on Age
    /*
    @Override
    public int compareTo(Student o) {
        return this.age - o.age;
    }
    */
    // Output - [Student {Name: Sanjay Roll No: 101 Age: 12}, Student {Name: Jay Roll No: 103 Age: 15}, Student {Name: Vijay Roll No: 106 Age: 17}, Student {Name: Ajay Roll No: 109 Age: 19}]

    // sorting based on Name
    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }

}
