package ex_15_StringBuilder_StringBuffer;

public class Lab148_StringBuilder {
    public static void main(String[] args) {

        // append function is similar to concat
        // StringBuilder & StringBuffer do not have concat functions
        StringBuilder str1 = new StringBuilder("Vidya");
        str1.append("Kini"); // to add value to the previous one
        System.out.println(str1);

        // Since StringBuffer as mutable in nature
        // 3 separate string won't be created
        // instead str1 with Vidya will be created & Kini value will be added i.e. appended
        // and it will print VidyaKini the newly appended value
        // older value i.e. Vidya gets deleted & replaced with new value VidyaKini

        System.out.println(str1.reverse()); // it will reverse the given string // iniKaydiV

        // we can add numeric values while appending but its not ideal
        // appending is allowed even if all are of different data type
        // so we need to convert it into String -> ToString
    }
}
