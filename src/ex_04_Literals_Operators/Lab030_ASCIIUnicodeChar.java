package ex_04_Literals_Operators;

public class Lab030_ASCIIUnicodeChar {
    public static void main(String[] args) {

        char capA = 'A';
        char smallA = 'a';

        char rupees = '₹'; // rupees is also a symbol in unicode character
        char smiley = '\u1f60'; //smileys are also now a character

        System.out.println(rupees);
        System.out.println(smiley);
    }
}
