package ex_16_Arrays;

public class Lab159_Array_String_args {
    public static void main(String[] args) {
        
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);

            // Run it once & give inputs in Edit Configuration & it will print it
            // we have not specified the length of array in cli option
            // it will read & automatically assign the length as per the input provided
            // this means cli option can take unlimited num of arguments for an array

            //cli option is rarely used while web automation
            // we use csv, excel, pdf, json file -> external files
        }
    }
}
