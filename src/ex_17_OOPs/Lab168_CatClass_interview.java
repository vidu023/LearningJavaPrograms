package ex_17_OOPs;

public class Lab168_CatClass_interview {
    public static void main(String[] args) {

        Cat c1 = new Cat(); // this is an object with reference c1
        Cat c2; // this is not an object but reference c2
        new Cat(); // thi is an object with no reference

        // so we have 2 objects & 2 references -> C1 & C2

        c1.sound(); // this will work as we have created an object with reference
        // c2.sound(); // will give error as object is not created here,
        // so it cannot access the behaviour of the class Cat without no reference

    }
}

class Cat{
    String name; // default value is null

    void sound(){
        System.out.println("Meow Meow");
    }

}
