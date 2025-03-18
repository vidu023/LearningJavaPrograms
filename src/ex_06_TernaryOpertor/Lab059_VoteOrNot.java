package ex_06_TernaryOpertor;

public class Lab059_VoteOrNot {
    public static void main(String[] args) {
        // ? : -> it acts as if else

        int age = 10;
        String canIVote = (age >= 18) ? "Yes, You can Vote" : "No, You cannot Vote";
        System.out.println(canIVote);
    }
}
