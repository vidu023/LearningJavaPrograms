package ex_19_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab179_Multilevel_Inheritance {
    // Multilevel Inheritance
    // Father extends -> Grandfather
    // Son extends -> Father
    // bottom can access top but top cannot access bottom

    // Grandfather
    //  |
    // Father
    //  |
    // Son

    public static void main(String[] args) {

         Son s1 = new Son();
         // Son can access his attributes & Function
         System.out.println(s1.car);
         s1.home();

         // Son has access to Father
        System.out.println("-------------------------");
        System.out.println(s1.gold);
        s1.house();

        //Son has access to his Grandfather also
        System.out.println("-------------------------");
        System.out.println(s1.cash);
        s1.bungalow();
    }

}
