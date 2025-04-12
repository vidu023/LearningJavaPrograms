package ex_19_OOPs_Inheritance.Hierarchical_Inheritance;

public class Lab181_HierarchicalInheritance {
    public static void main(String[] args) {

        // Hierarchical Inheritance - Simple

        Mother m1 = new Mother();
        Pooja po1 = new Pooja();
        Pinky pi1 = new Pinky();
        Rohan r1 = new Rohan();

        // All Derived class has access to the Reference function ie. home() , no error
        po1.home();
        pi1.home();
        r1.home();

        // Mother herself can access
        m1.home();

    }
}

class  Mother {

    void home(){
        System.out.println("Mother's 3BHK Home");
    }
}

class Pinky extends Mother{

    void money(){
        System.out.println("Pinky's Cash");
    }

}

class Pooja extends Mother{

    void flat(){
        System.out.println("Pooja's Flat");
    }

}

class Rohan extends Mother{

    void bike(){
        System.out.println("Pooja's Bike");
    }

}
