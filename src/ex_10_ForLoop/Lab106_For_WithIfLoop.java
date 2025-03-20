package ex_10_ForLoop;

public class Lab106_For_WithIfLoop {
    public static void main(String[] args) {
        // it will run 18 times from 0 to 17
        for (int age = 0; age < 18; age++){
            if (age >15){
                System.out.println("Vidya will have an Iphone as Bday Gift!");
            }
            else{
                System.out.println("No Bday Gift for Vidya :(");
            }
        }

    }
}
