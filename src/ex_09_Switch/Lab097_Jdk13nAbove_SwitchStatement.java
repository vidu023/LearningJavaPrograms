package ex_09_Switch;

public class Lab097_Jdk13nAbove_SwitchStatement {
    public static void main(String[] args) {

        // such kind of 1 liner switch statements do not require break statements
        // in jdk > 13 it will work
        int itemCode = 001;

        switch (itemCode){
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("default");
        }
    }
}
