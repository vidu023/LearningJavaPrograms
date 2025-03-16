package ex_04_Literals_Operators;

public class Lab029EscapeCharacter {
    public static void main(String[] args) {

        // Escape Character
        char new_line = '\n';
        char tab_line = '\t';
        char back_space ='\b';
        char carriage_return ='\r';

        System.out.println("VidyaKini");
        //+ is used for concatenation
        System.out.println("Vidya"+new_line+"Kini");// will add a new line
        System.out.println("Vidya"+tab_line+"Kini");// will add a tab in the line (space)
        System.out.println("Vidya"+back_space+"Kini");
        // will delete a character between a word where this is used
        System.out.println("Vidya"+carriage_return+"Kini");
        // will delete a word or sentence etc which was used before it this

        // using println
        System.out.println("This is a First line\nThis is a Second line \nThis is a Third line");
        //using print
        System.out.print("This is a First line\nThis is a Second line \nThis is a Third line");
        //using variable new_line
        System.out.print("This is a First line"+new_line+"This is a Second line"+new_line+"This is a Third line");

    }
}
