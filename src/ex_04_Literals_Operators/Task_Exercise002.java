package ex_04_Literals_Operators;

public class Task_Exercise002 {
    public static void main(String[] args) {
        // Math.function in java
        // cube root -> Math.cbrt()
        // power -> Math.pow(x,y) -> where x is the number & y is the power
        // i.e. -> x^2 x to the power of 2 -> here 10 to power of 2
        // absolute value -> Math.abs()

        double x = 10;
        double y = 10;
        double z = 10;

        double x_pow = Math.pow(10,2);
        double y_pow = Math.pow(10,2);
        double z_abs = Math.abs(10);
        double cube_root_result = (Math.cbrt(x_pow+y_pow-z_abs)) ;

        System.out.println(x_pow);
        System.out.println(y_pow);
        System.out.println(z_abs);

        System.out.println("Final Result of the Equation is: " + cube_root_result);
    }
}
