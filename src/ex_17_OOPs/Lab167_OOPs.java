package ex_17_OOPs;

public class Lab167_OOPs {
    public static void main(String[] args) {
        Person p1 = new Person();
        // using new keyword with name className -> Object is created
        // Person -> Class name; p1 -> Reference for the object; new Person() -> Object
        // moment object is created -> it understands that okay Person class need to be called
        // and class loader is called to load the class Person
        // this is object of Person with a memory allocated in heap area having its own attributes & behaviour
        // each time a new object is created a new memory is allocated in the heap area

        // we can call the functions using object
        p1.name = "Vidya";
        System.out.println(p1.name);
        p1.sleep();
        p1.talk();
        p1.greet("Vaidehi");

        Person p2; // this is a reference and not an object
        // this will be created in null area

        new Person(); // this is an object without reference -> it still works
        new Person().name = "This has no Reference";

        // Selenium -> Automation we shall be using this
        // WebDriver driver = new ChromeDriver();


    }
}

    class Person{
        // This is just a blueprint for Person Class
        // it will not take much memory

        // Attributes | Properties | Data Members | Instance Variables

        String name;
        byte age;
        long phoneNum;
        String gender;
        String occupation;
        double salary;
        double weight;
        boolean isMarried;

        // Behaviour | Functions | Methods

        void sleep(){
            System.out.println("I am sleeping");
        }
        String greet(String name){
            return ("Hello"+ name);
        }

        // void function doesnt return anything
        void talk(){
            System.out.println("I am talking");
        }

        // will return final Salary of  person -> Salary - Tax is the amnt
        double finalSal (double salary, double tax){
            return (salary-tax);
        }
    }

