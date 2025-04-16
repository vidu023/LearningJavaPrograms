package ex_25_OOps_Abstraction_Interface;

public class Lab196_InterviewQ {
}

interface I1{} // possible
interface I2{} // possible

class A1{} // concrete class -> possible

abstract class B1{ // abstract class
    abstract void display();
}

class Test1 extends A1{} // class extending another class-> possible
//class Test2 extends A1, B1{} // class extending more than 1 class -> not possible
// multiple inheritance in class not possible

class Sample1 implements I1{} // possible
class Sample2 implements I1, I2 {} // possible

/*class Test2 extends A1 implements B1{ // class implements another class -> possible with implementing abstract methods
    @Override
    void display() {

    }
}*/

class Test3 extends A1 implements I1,I2{} // possible
// class Test4 implements A1 extends I1{} // not possible -> it has to be first extends & then implements

//interface I3 extends A1{} // not possible -> interface always implements
