package ex_24_OOPs_Abstraction_AbstractClass;

public class Lab192_Abstraction_RealEg {
}

abstract class Employee {
    private String ename;
    private String address;
    private int enumber;

    Employee() {

    }

    Employee(String name, String address, int num) {
        System.out.println("Parameterized Constructor");
        this.ename = name;
        this.address = address;
        this.enumber = num;

    }

    abstract double computePay();

    void mailCheck(){
        System.out.println("Mail Checking for "+this.ename+" whose address is "+this.address+ " & whose Emp num is: "+this.enumber);
    }
}

class Person extends Employee{


    @Override
    double computePay() {
        return 0;
    }
}