package ex_13_Functions.Tasks;

import java.util.Locale;
import java.util.Scanner;

public class Task013_CountVowelsConsonants {
    public static void main(String[] args) {
        // To count vowels & consonants in a word

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word to find how many consonants & vowels are there: ");
        String word = scanner.nextLine().toLowerCase(); // changing into loercase
        //System.out.println(word);

        int consonants = 0, vowels = 0;
        for(int i = 0; i < word.length(); i++)
        //word.length() will calculate its length
        {
            char ch = word.charAt(i);
            //word.charAt() will retrieve which word is at i position

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                vowels++;
            }else {
                consonants++;
            }
        }
        System.out.println("There are "+vowels+ " Vowels & "+consonants+ " Consonants");
        scanner.close();
    }
}
