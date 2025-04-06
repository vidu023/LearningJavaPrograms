package ex__18_OOPs_Constructor;

public class Lab176_OOPs_ConstructorOverloading {
    public static void main(String[] args) {

        // Constructor overloading

        People p1 = new People("Ram", "Mumbai", 9988776655L);
        p1.read(); // Ram

        People p2 = new People("Krishna", "Pune");
        p2.read(); // Krishna
    }
}

class People{

    //constructors are available only within the classes

    // instance variable
    String name;
    String address;
    long phoneNum;

        // PC -> with 3 arguments
    People(String name_args, String address_args, long phoneNum_args){
        this.name = name_args;
        this.address = address_args;
        this.phoneNum = phoneNum_args;
    }

    // PC -> with 2 arguments
    // same constructor with less num of arguments -> different
    // constructor overloading
    // in this case it will match against the arguments and call the constructor accordingly
    People(String name_args, String address_args){
        this.name = name_args;
        this.address = address_args;
    }

    // Behaviour
    void read(){
        // we cannot use variable 'name' directly instead use -> this.name
        //System.out.println(this.name + "reads");
        System.out.println(this.name);
    }
}

