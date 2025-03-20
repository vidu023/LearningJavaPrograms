package ex_09_Switch;

public class Lab098_Jdk13nAbove_Switch_CommaSep {
    public static void main(String[] args) {

        // in jdk 13 and above
        // multiple cases with comma separated - in Switch statement

        int itemCode = 006;

        switch (itemCode){
            case 001,003,005:
                System.out.println("Odd Numbers");
                break;
            case 002,004,006:
                System.out.println("Even Numbers");
                break;
            default:
                System.out.println("None");
                break;
        }
    }
}
