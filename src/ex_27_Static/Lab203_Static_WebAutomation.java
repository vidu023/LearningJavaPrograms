package ex_27_Static;

public class Lab203_Static_WebAutomation {
    public static void main(String[] args) {
        Automation a1 = new Automation();
        System.out.println(Automation.driver);

        // static variable can be called n number of times

        Automation a2 = new Automation();
        System.out.println(a2.driver);

        Automation a3 = new Automation();
        System.out.println(a3.driver);

    }
}

class Automation{
    static String driver = "Chrome";
    // we shall be creating drivers as static so that all can use them
}

