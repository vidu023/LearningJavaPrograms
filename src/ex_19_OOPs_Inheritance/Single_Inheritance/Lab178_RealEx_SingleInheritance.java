package ex_19_OOPs_Inheritance.Single_Inheritance;

public class Lab178_RealEx_SingleInheritance {
    public static void main(String[] args) {
        // Real Scenario - in automation
        // We can have only one extends

        TestCase1 tc1 = new TestCase1();
        tc1.runningTC1();

        System.out.println("---------------------------");

        TestCase2 tc2 = new TestCase2();
        tc2.runningTC2();
        tc2.startBrowser();

    }
}
