package ex_19_OOPs_Inheritance.Single_Inheritance;

public class TestCase2 extends CommonToAll {

    public static void main(String[] args) {
        TestCase2 tc2 = new TestCase2();
        tc2.runningTC2(); // calling the method
    }

    void runningTC2() {
        System.out.println("TestCase 2 Running");
        // You can call parent class methods here
        // startBrowser();
    }
}
