package ex_29_WrapperClass;

public class Lab210_WrapperClass {
    public static void main(String[] args) {
        // Object creation
        Mobile iphone = new Mobile("Iphone16",1200000.00);
        Mobile samsung = new Mobile("Samsung Ultra 24",1350000.00);

        //changing the price of samsung using setPrice() method
        samsung.setPrice(1400000.00);

        // calling display function to print
        iphone.display();
        samsung.display();

        // Printing Mobile Carrier
        // common attribute using word -> static
        System.out.println(Mobile.mobileCarrier);
        Mobile.switchAirplaneMode();
    }
}

class Mobile extends OldPhone{ // Inheritance

    private String phoneName;
    private Double price;
    static String mobileCarrier = "Airtel";

    // Default Constructor
    Mobile(){
        System.out.println("Default Constructor");
    }

    // Parameterized Constructor
    public Mobile(String phoneName, Double price) {
        this.phoneName = phoneName;
        this.price = price;
    }

    // Getter Setter
    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    // function
    void display(){
        System.out.println("Mobile name: "+ this.phoneName);
        System.out.println("Mobile price: "+ this.price);
        System.out.println("--------------------------------");
    }

    static void switchAirplaneMode(){
        System.out.println("Airplane mode Switched on");
    }

    @Override // overriding parent method here
    void calling(){
        System.out.println("Touch Keypad");
    }

}

class OldPhone implements SIMCard{
    void calling(){
        System.out.println("Dial-pad");
    }

    @Override
    public void enterCard() {
        System.out.println("SIM Card is entered");
    }
}

// abstraction
interface SIMCard{
    void enterCard();
}
