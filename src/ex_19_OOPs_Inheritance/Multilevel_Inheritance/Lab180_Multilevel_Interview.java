package ex_19_OOPs_Inheritance.Multilevel_Inheritance;

public class Lab180_Multilevel_Interview {
    // References

    // Son s1 = new Grandfather(); // not possible
    // Son s2 = new Father(); // not possible
    // Father f2 =  new Grandfather(); // not possible
    // its like Son cannot be present when Grandfather ror Father is being created
    // also Father cannot be present when his father i.e. Grandfather is born

    // but reverse is true
    // Grandfather can be present when Son is born & Father is born
    // Also Father can present whn his son is born
    // this can happen due to keyword 'extends'

    public static void main(String[] args) {

        // this concept is called Dynamic Dispatch because of Multilevel Inheritance
        // we can create reference of parent class with object of Child class
        Grandfather gf1 = new Son();
        Grandfather gf2 = new Father();
        Father f1 = new Son();

        gf1.land();
        // gf1.land() of Son will be called first if not in Son then Father & if not in Father than from Grandfather's will be called
        // if different function no problem
        // the real problem will arise if same function are present in all class

        //gf1.cash; // not possible cannot access attributes
        gf2.land();
        f1.land();



        // this concept is heavily used in Selenium -> Web Automation
        //WebDriver driver = new ChromeDriver();

        // with Grandfather's reference & Son's Object we still cannot access Son's Attribute & Behaviour
        // not possible
        // Only common functions & function of that reference only
        // For Eg Grandfather gf1 can access common function land() & bungalow()


    }


}
