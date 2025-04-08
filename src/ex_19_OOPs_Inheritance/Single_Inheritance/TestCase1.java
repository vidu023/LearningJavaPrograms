package ex_19_OOPs_Inheritance.Single_Inheritance;

public class TestCase1 extends CommonToAll {

    public static void main(String[] args) {
        TestCase1 tc1 = new TestCase1();
        tc1.runningTC1(); // calling the method
    }

    void runningTC1() {
        System.out.println("TestCase 1 Running");
        // You can call parent class methods here
        // startBrowser();
    }
}