package ex_10_ForLoop;

public class Lab111_InitializationOutside {
    public static void main(String[] args) {

        // initialisation can be done outside
        //its valid
        int i = 10;
        for( ; i > 0; i--){
            System.out.println("Hello " + i);

            //if no condition then it will go infinite
        }
    }
}
