package ex_06_TernaryOpertor;

public class Lab064_MaxNumber_3 {
    public static void main(String[] args) {
        // To Check Max from 3 numbers
        // Nested Ternary example

        int n1 = 7;
        int n2 = 19;
        int n3 = 26;

        // Logic Building Formula

        // step 1 - identify input & output
        // input will be in numbers i.e. integers ....a,b,c
        //out put can be string -> max or number in int
        // output need to ask the interviewer how he wants us to  print & do not assume

        //step 2 - rough logic & think about it
        // c > a and c > b -> c is max
        // b > a and b > c -> b is max
        // else a is max

        //printing string
        String result = (n3>n1) ? (n3>n2) ? "n3 is Max" : "n2 is max" : ((n2>n1) ? "n2 is max" : "n1 is max");
        System.out.println(result);

        //treating if -> (n3>n1) -> true
        // run -> (n3>n2) ? "n3 is Max" : "n2 is max" // if (n3>n2) -> true print n3 is max else n2 is max
        // else run -> ((n2>n1) ? "n2 is max" : "n1 is max") // if (n2>n1) -> true print n2 is max else n1 is max

        //printing number directly
        //int result = (n1 > n2) ? (n1 > n3) ? n1 : n3 : ((n2 > n3) ? n2 : n3);
        //System.out.println("Max number is: " + result);
    }
}
