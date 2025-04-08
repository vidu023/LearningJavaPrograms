package ex_18_OOPs_Constructor;

public class Lab175_OOPs_PC_Person {
    public static void main(String[] args) {

        // Parameterized Constructor are used to initialise & assign the value during Object creation

        Person p1 = new Person("Ram","Mumbai", 9988776655L);
        p1.read(); // Ram

        Person p2 = new Person("Krishna","Pune", 9876543210L);
        p2.read(); // Krishna

        // it basically like baby is born some unique values are given like name etc
        // so during the object creation you can call the parametrized constructor,
        // to initialize the value of instance variable

        Person p3 = new Person();
        // in this case object is already created during object creation
        p3.name = "Radha"; // I can set the value here also after object creation
        // but during object creation setting the value is different & later is different
        // this is not a good way-> after object creation
        p3.read(); // null as this is DC -> no value is assigned -> default value i.e. name = null for String
    }
}

class Person{

    //constructors are available only within the classes

    // instance variable
    String name;
    String address;
    long phoneNum;

    // DC
    Person(){

    }

    // PC
    Person(String name_args, String address_args, long phoneNum_args){
        this.name = name_args;
        this.address = address_args;
        this.phoneNum = phoneNum_args;
    }

    // Behaviour
    void read(){
        // we cannot use variable 'name' directly instead use -> this.name
        //System.out.println(this.name + "reads");
        System.out.println(this.name);
    }
}
