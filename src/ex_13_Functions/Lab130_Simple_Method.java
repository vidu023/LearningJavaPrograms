package ex_13_Functions;

public class Lab130_Simple_Method {
    public static void main(String[] args) {

        // we can directly print the values but assigning is a good option

        doesnot_return(); // calling the void function here
        // it does not return anything
        // you cannot store any value -> void return
        // int result = doesnot_retrun(); // gives error

        // int type of value returned, stored & printed
        int result_int = return_int(); // value which is returned is assigned to result_int
        System.out.println(result_int); // printing the value ->25

        // boolean type of value returned, stored & printed
        boolean result_boolean = return_boolean(); // value which is returned is assigned to result_int
        System.out.println(result_boolean); // printing the value ->true

    }

    //this is void function
     static void doesnot_return(){
         System.out.println("Hello i don't return anything");
         //this function has void so it wont return anything
         //just run & print if any sop statements are there
     }
     //int type of function -> returning int value
     static int return_int(){
        return 25;
     }
     // boolean type of function -> returning boolean value
    static boolean return_boolean(){
        return true;
     }

}
