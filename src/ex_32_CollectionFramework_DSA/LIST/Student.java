package ex_32_CollectionFramework_DSA.LIST;

public class Student {

    private String s_name;
    private Integer s_rollNo;

    //parameterized constructor
    public Student(String name, Integer rollNo) {
        this.s_name = name;
        this.s_rollNo = rollNo;
    }

    // getter setter
    public String getS_name() {
        return s_name;
    }

    public void setS_name(String s_name) {
        this.s_name = s_name;
    }

    public Integer getS_rollNo() {
        return s_rollNo;
    }

    public void setS_rollNo(Integer s_rollNo) {
        this.s_rollNo = s_rollNo;
    }

    // print details function
    public void printDetails(){
        System.out.println("Student's Name is: " + s_name);
        System.out.println("Student's Roll No is: " + s_rollNo);
    }

    // to print Object reference values which are stored
    @Override
    public String toString() {
        //return super.toString();
        return "Student {" +
                    "Name = " + s_name + ", " +
                    "Roll No = " + s_rollNo + "}";
    }

    public static void main(String[] args) {


    }
}
