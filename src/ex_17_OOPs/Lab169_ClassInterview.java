package ex_17_OOPs;

public class Lab169_ClassInterview {
public static void main(String[] args) {
        System.out.println("Hello I am main function inside class");
    }
}

// certain identifiers rules we need to follow

class P1{} // capital class name is allowed
class p2{} // we can have many classes
// class 123{} // numbers as class name is not allowed
class $ {} // class with $ is allowed
class _123{} // class with numbers starting with _ (underscore) is allowed
//class -{} // class with - (hyphen) is not allowed
//class p2 {} // class with same name is not allowed
class p3{
    class p4 {
        class p5 {
        }
        }
    } // class within the class is possible and we can have more such classes too -> any level it can go
// mother -> child -> child -> child...no problem

class p6{
    public static void main(String[] args) {
        System.out.println("Hello I am main function inside p6");
    }
} // we can have 2 separate main functions but each will be treated as separate entity
// after jvm 13 its possible as previously it wasnt possible as all of them are separate classes
// single file with multiple class & multiple main function is possible due to new jdk version

class p5{

} // this class & earlier class p5 which is within p4 -> both are different even though they have same name

// we will always create separate class and no class within the class
// if we create different class under same class file we will keep only 1 main function
// keyword or reserved words cannot be used as identifiers

