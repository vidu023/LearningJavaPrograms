package ex_28_ENUM;

public class Lab204_ENUM {
    public static void main(String[] args) {
        // no need of object creation incase of ENUM
        System.out.println(Day.Friday);

        /*// would print the day after creating an object & passing the index value
        Sample s1 = new Sample();
        System.out.println(s1.days[4]);*/
    }
}

/*class Sample{
    String[] days = {"Mon", "Tues", "Wed", "Thrus", "Fri", "Sat", "Sun"};
    // days of week -> universal truth
}*/

// so instead of using like this use ENUM
enum Day {Sunday, Monday, Tuesday, Wednesday, Thrusday, Friday, Saturday}
