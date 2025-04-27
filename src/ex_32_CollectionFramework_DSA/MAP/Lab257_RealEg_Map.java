package ex_32_CollectionFramework_DSA.MAP;

import java.util.*;

public class Lab257_RealEg_Map {
    public static void main(String[] args) {

        //Student 1
        Map <String, Object> student_1 = new HashMap();
        student_1.put("fname", "Kishore");
        student_1.put("lname", "Patel");
        student_1.put("age", 18);
        student_1.put("address", "Mumbai");
        student_1.put("rollNo", 15);
        student_1.put("phone", 986532415);

        //Student 2
        Map <String, Object> student_2 = new HashMap();
        student_2.put("fname", "Raghav");
        student_2.put("lname", "Sharma");
        student_2.put("age", 20);
        student_2.put("address", "Bangalore");
        student_2.put("rollNo", 20);
        student_2.put("phone", 974125638);

        System.out.println(student_1);
        System.out.println(student_2);

        List students = new ArrayList();
        students.add(student_1);
        students.add(student_2);
        System.out.println(students);

        Set bookName = new HashSet();
        bookName.add("Rich Dad Poor Dad");
        bookName.add("Adventures of Huckleberry Finn");
        bookName.add("One Hundred Years of Solitude");
        bookName.add("Pride and Prejudice");
        //duplicates wont be added -> The Road will not be inserted
        bookName.add("The Road");
        bookName.add("The Road");
        bookName.add("The Sympathizer");

        System.out.println(bookName);
        // Output - [Pride and Prejudice, The Road, The Sympathizer, Adventures of Huckleberry Finn, One Hundred Years of Solitude, Rich Dad Poor Dad]
}
}
