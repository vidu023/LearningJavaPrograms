package ex_10_ForLoop;

public class Lab117_ForLoop_RealCase {
    public static void main(String[] args) {

        //Suppose i want to print the elements present on a webpage using for loop
        //app.vwo.com -> webpage -> suppose 10 elements we have
        //for loop is always used for predefined values

        //this is how we are going to use in future automation
        //we will have number -> define the value of n
        // int n = 10; -> define say number of elements, images, input boxes etc
        for(int i = 0; i <= 10; i++){
            System.out.println( "Printing different Elements of the page here in this loop");
        }
    }
}
