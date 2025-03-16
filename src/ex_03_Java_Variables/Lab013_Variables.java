package ex_03_Java_Variables;

public class Lab013_Variables {
    public static void main(String[] args) {

        // data_type variable_name = variable_value
        byte b = 15;
        // byte -> data_type -> type of container
        //stores only integer part
        //-128 to 127

        // b -> variable_name -> identifier
        // = assignment operator
        // 15 -> variable_value
        System.out.println(b);

        // but how jvm stores this value - it will be converted into binary number
        //then jvm will allocate memory of the variable b
        // container -> byte
        // contains value -> 15
        //name of the container -> b (reference variable_name)
    }
}
