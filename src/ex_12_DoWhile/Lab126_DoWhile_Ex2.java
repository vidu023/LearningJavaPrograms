package ex_12_DoWhile;

public class Lab126_DoWhile_Ex2 {
    public static void main(String[] args) {
        int a = 10;
        do{
            System.out.println("This is the body, which will execute at least once");
            //this will execute at least once
            a--; //decrement will happen -> a = 9
        }
        while(a<1); // still a -> 9<1 -> false
        //so now it will not execute further anymore & come out of the loop
    }
}
