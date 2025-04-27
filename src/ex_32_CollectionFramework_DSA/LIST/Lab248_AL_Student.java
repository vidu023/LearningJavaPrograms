package ex_32_CollectionFramework_DSA.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab248_AL_Student {
    // I can store the student details in the array list
    // using Student class
    public static void main(String[] args) {

        Student s1 = new Student("Amit", 21);
        Student s2 = new Student("Chetan", 25);
        Student s3 = new Student("Deepak", 12);

        // adding details of each student into the array
        List <Student> myStudents = new ArrayList<>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents); // this will print only the reference object & not the entire list

        // Output -
        // [ex_32_CollectionFramework_DSA.LIST.Student@1d81eb93, ex_32_CollectionFramework_DSA.LIST.Student@7291c18f, ex_32_CollectionFramework_DSA.LIST.Student@34a245ab]

        // Output - because of override method toString in Student class
        // [Student {Name = Amit, Roll No = 21}, Student {Name = Chetan, Roll No = 25}, Student {Name = Deepak, Roll No = 12}]
        // we can also store object references into  the array

        // printing their details
        s1.printDetails();
        s2.printDetails();
        s3.printDetails();
    }
}
