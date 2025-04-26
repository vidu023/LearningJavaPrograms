package ex_31_Generics;

public class Lab232_GenericClass {
    //whatever is passed here <T> -> <Integer> it will be that data type
    GenericClass <Integer> intObjRef = new GenericClass<>(500);// integer value passed
    GenericClass <String> stringObjRef = new GenericClass<>("Vidya");// string value passed

    // T -> placeholder only
    // it can be any data type
}

// here advantage is this that if I replace T with Integer this will be an Integer class
class GenericClass <T>{
    private T data;

    // parameterized constructor
    public GenericClass(T data){
        this.data = data;
    }

    // generic method
    public T getData(){
        return this.data;
    }
}
