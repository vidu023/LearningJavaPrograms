package ex_32_CollectionFramework_DSA.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Lab251_Comparator {
    public static void main(String[] args) {

        Students s1 = new Students("Vijay", 106, 17);
        Students s2 = new Students("Sanjay", 101, 12);
        Students s3 = new Students("Ajay", 109, 19);
        Students s4 = new Students("Jay", 103, 15);


        // Adding Students information into the studentlist array
        List<Students> studentList = new ArrayList();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);

        //based on Age
        // Collections.sort(studentList, new AgeComparator()); // (List, Comparator)
        // sorting of StudentList array is not possible as to on what basis will it sort?
        // we can give using comparable -> compare()

        // we need to create a new class for comparison based on what criteria we want like age/ name/ rollNo

        //based on Name
        //Collections.sort(studentList, new NameComparator());

        //based on RollNo
        Collections.sort(studentList, new RollNoComparator());

        System.out.println(studentList);
    }
}

// class for comparison wrt Age
class AgeComparator implements Comparator <Students>{

    // implement method compare()
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getAge()- o2.getAge();
    }
}

// class for comparison wrt Name
class NameComparator implements Comparator <Students>{

    // implement method compare()
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

// class for comparison wrt RollNo
class RollNoComparator implements Comparator <Students>{

    // implement method compare()
    @Override
    public int compare(Students o1, Students o2) {
        return o1.getRollNo()- o2.getRollNo();
    }
}

class Students {

    private String name;
    private Integer rollNo;
    private Integer age;

    // Parameterized Constructor
    public Students(String name, Integer rollNo, Integer age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }

    // getter - setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRollNo() {
        return rollNo;
    }

    public void setRollNo(Integer rollNo) {
        this.rollNo = rollNo;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    //override method of toString
    @Override
    public String toString() {
        //return super.toString();
        return "Student {" +
                "Name: " + name +
                " Roll No: " + rollNo +
                " Age: " + age + "}";
    }
}