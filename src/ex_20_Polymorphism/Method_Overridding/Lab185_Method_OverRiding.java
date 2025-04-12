package ex_20_Polymorphism.Method_Overridding;

public class Lab185_Method_OverRiding {
    public static void main(String[] args) {

        Dog d1 = new Dog();
        d1.sound();

    }
}

class Animal{
    void sound(){
        System.out.println("Animal Sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Barks");
    }
}