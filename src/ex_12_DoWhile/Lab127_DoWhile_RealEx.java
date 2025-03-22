package ex_12_DoWhile;

public class Lab127_DoWhile_RealEx {
    public static void main(String[] args) {
        // web automation
        int a = 0;
        // suppose some elements / say student data is 0 to 10
        do {
            System.out.println(a);
            // callFunction(a)
            a++;
            //may to check if this function is called
            // or something to  verify at least once
            // say may be open excel file/ close excel file etc
            // it is required during framework
            //required rarely in web automation
        }
        while(a<0);
    }
}
