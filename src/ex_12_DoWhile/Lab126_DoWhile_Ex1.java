package ex_12_DoWhile;

public class Lab126_DoWhile_Ex1 {
    public static void main(String[] args) {
        int a = 0;
        do {
            System.out.println(a); // a is 0
            a++; // increment happens a becomes 1
        }
        while(a<10); // it will run till a is less than 10 -> till a becomes 9
    }
}
