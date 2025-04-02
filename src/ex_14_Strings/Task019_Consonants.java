package ex_14_Strings;

public class Task019_Consonants {
    public static void main (String[] args) {
        // To check if the string has how many consonants  & vowels
        // space & special char is consonants
        // numbers are also termed as consonants

        String str = "Java Program to check consonants & vowels 23";
        str = str.toLowerCase();
        System.out.println(str);
        int consonants = 0;
        int vowels = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels = vowels + 1;
            } else{
                consonants = consonants + 1;
            }
        }
        System.out.println("Number of Consonants : " + consonants);
        System.out.println("Number of Vowels : " + vowels);
    }

}
