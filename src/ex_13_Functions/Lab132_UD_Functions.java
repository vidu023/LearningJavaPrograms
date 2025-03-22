package ex_13_Functions;

public class Lab132_UD_Functions {
    public static void main(String[] args) {

        //Calling

        // 1. Without Parameter & Without return type
        wp_wr_greet();
        // 2. Without Parameter & With return type
        String fullName = wp_withr_greet();
        System.out.println(fullName);

        // 3. With Parameter & Without return type
        withp_wr_details("Vidya Kini",25, 25000);

        // 4. With Parameter & With return type
        int result2 = withp_withr_multiplication(19,22);
        System.out.println(result2);
    }

        // Definition

        // 1. Without Parameter & Without return type
        static void wp_wr_greet() {
            System.out.println("Hi, How are you?");
        }

        // 2. Without Parameter & With return type
        static String wp_withr_greet(){
            System.out.println("Greetings from us");
            return "Greetings";
        }

        // 3. With Parameter & Without return type -> 90%
        static  void withp_wr_details(String name, int age, double salary){
            System.out.println("Name is - "+name);
            System.out.println("Age is - "+age);
            System.out.println("Salary of this person is - "+salary);
        }

        // 4. With Parameter & With return type
        static  int withp_withr_multiplication(int a,int b){
            return a*b;
        }

    }

