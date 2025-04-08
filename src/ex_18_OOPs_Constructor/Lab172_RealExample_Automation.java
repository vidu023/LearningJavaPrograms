package ex_18_OOPs_Constructor;

public class Lab172_RealExample_Automation {
    public static void main(String[] args) {

        // Object creation
        WebAutomation w1 = new WebAutomation();
    }
}

class WebAutomation{

    // DC
    // Also called Non-Parameterized Constructor/ No Argument Constructor
    // Object -> new WebAutomation() calls this DC
    // If we don't create like here, it is still created automatically by Java but no line of code is printed
    // no memory will be allocated here
    WebAutomation(){
        System.out.println("I want to read CSV File");
        System.out.println("Open the page before loading scripts");
        System.out.println("You can do anything you want to do, when Object is created");
        //FileInputStream file = new FileInputStream("C://");
    }
}
