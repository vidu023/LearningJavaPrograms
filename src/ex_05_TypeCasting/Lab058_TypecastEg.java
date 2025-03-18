package ex_05_TypeCasting;

public class Lab058_TypecastEg {

    public static void main(String[] args) {
         // Typecasting Example
        int salary = 25000;
        float gst = 18.45f;

        // this is Implicit Narrowing example which is not allowed.
        //int total = salary + gst;

        // this is Explicit Narrowing example & will return integer value
        int total = salary + (int)gst;

          // this is Implicit Widening example & will return float value
        float sum1 = salary + gst;

        // this is Explicit Widening example & will return float value
        //but not required
        float sum2 = (float)salary + gst;

        System.out.println(total);
        System.out.println(sum1);
        System.out.println(sum2);
    }
}
