package ex_09_Switch;

import java.util.Scanner;

public class Lab091_Switch_inAutomation {
    public static void main(String[] args) {

        // Real example in Web Automation -> Switch
        // I will take input from the user which browser he wants to work with
        // so that I shall start automation from that browser

        // using CLI
        // if more than 1 argument is passed in CLI it will not throw the error
        // it will pick only the first value
        //String browser = args[0];
        //System.out.println(browser);

        //switch - case are case-sensitive
        // in selenium - opera browser is not supported

        // use Scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which Browser you want to start automation?");
        String browser = scanner.next();
        System.out.println(browser);

        switch (browser){
            case "chrome":
                System.out.println("This is Chrome browser");
                // some lines of code
                break;
            case "firefox":
                System.out.println("This is Chrome browser");
                // some lines of code
                //Webdriver driver = new Firefox(); //selenium code
                break;
            case "edge":
                System.out.println("This is Chrome browser");
                // some lines of code
                break;
            default :
                System.out.println("I have no idea about this browser");
                break;
        }

    }
}
