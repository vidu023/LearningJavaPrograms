package ex_25_OOps_Abstraction_Interface;

public class Lab193_InterfaceEg {
    // instead of class we will now have interface
    // which will have incomplete methods
    // for interface it by default an abstract / incomplete methods

    public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.getArea(15,10);
    }

}

interface Polygon{
    void getArea(int length, int breadth); // incomplete method
}

class Rectangle implements  Polygon{
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The Area of a Rectangle is: "+ (length*breadth));

    }
    // now the keyword implements is used incase of interface
}