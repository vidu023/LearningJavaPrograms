package ex_03_Java_Variables;

public class Lab024_Constants {
    public static void main(String[] args) {
        final byte z = 75; // final keyword means cannot change the value of z
        //z = 96; // cannot assign value to z because of final keyword
        // so that nobody can change the value of z again
        System.out.println(z);

        //final can be written to a data type, class & method also
    }
}
