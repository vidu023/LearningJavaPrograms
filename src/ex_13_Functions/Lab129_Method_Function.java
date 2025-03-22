package ex_13_Functions;

public class Lab129_Method_Function {
    public static void main(String[] args) {
        // definition of the function - it shall be done outside the main function
        // then there is a calling of a function - which is inside the main function
        // this function can be called any number of times - > n times
        // if the function is not called -> not used -> function will not be executed

        //step 2 -calling of the function
        f1();

    }

        //step 1 - definition
    static void f1(){
        System.out.println("Hello I am the function called here");
    }
}
