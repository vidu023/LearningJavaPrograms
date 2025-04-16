package ex_27_Static;

public class Lab202_Static_RealEg {
    public static void main(String[] args) {

        //common i.e. static variables called here
        System.out.println(ATB.courseName);
        System.out.println(ATB.mentorName);

        //common methods are called here
        ATB.doAssignment();
        ATB.joinZoom();

        ATB amit = new ATB();
        amit.setName("Amit");
        amit.setPhone("9876543210");
        amit.howTheyDoAssignment(); // unique

        System.out.println("------------------------------------");

        ATB lucky = new ATB();
        lucky.setName("Lucky");
        lucky.setPhone("8975642310");
        lucky.howTheyDoAssignment();
    }
}

class ATB{
    static {
        System.out.println("Load the class - I shall be executed");
    }
    {
        System.out.println("IIB - this is called when object is created");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    private String name; // non-static variable
    private String phone;
    static String courseName = "ATB11x_Batch"; // static variable i.e. common among all persons
    static String mentorName = "Pramod";

    static void doAssignment(){
        // static method i.e. common to all
        System.out.println("Do Assignment");
    }

    static void joinZoom(){
        System.out.println("Live class joined");
    }

    void howTheyDoAssignment(){
        // how they finish it is different
        System.out.println("It is different");
    }
}