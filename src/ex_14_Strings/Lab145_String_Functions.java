package ex_14_Strings;

public class Lab145_String_Functions {
    public static void main(String[] args) {
        // Some imp String Functions

        String name = "Sonal";

        // length() gives length of the string -> starts from 1
        // here it is 5 -> count
        System.out.println(name.length());

        //charAt() gives char at that index location
        // here the index starts from 0 till 4
        // so at 4 -> the char value returned is l
        System.out.println(name.charAt(4));

        // for index not available will give String exception error
        // java.lang.StringIndexOutOfBoundsException
        // System.out.println(name.charAt(6));

        // concat() will join 2 string together
        System.out.println(name.concat(" Patel"));

        // contains() will check if the string is present in the string and return boolean value
        System.out.println(name.contains("at"));
        System.out.println(name.contains("on"));

        // equals() will check if value is same or not and return boolean value
        System.out.println(name.equals("Sonal"));

        // equalsIgnoreCase will ignore case & check the value and return boolean value
        System.out.println(name.equalsIgnoreCase("sonal"));

        // indexOf() will return the index of a particular char in the  String -> starts from 0
        System.out.println(name.indexOf("n"));

        // indexOf() will return the 1st index of the value if there is more than 1 occurrence of same char
        // for eg here m is occurring twice so only 1st index value it will  -> which is 0
        String str1 = "madam";
        System.out.println(str1.indexOf("m"));

        // lastIndexOf() will return the last index of the value if there is more than 1 occurrence of same char
        // for eg here m is occurring twice so last index value it will return -> which is 4
        System.out.println(str1.lastIndexOf("m"));

        // if nothing index value found it will return -1

        // replace() function will replace the old char will new char & print the new value
        // just for printing purpose -> it will not replace the original string
        System.out.println(name.replace("S","s"));

        // split() will split the original string into different strings from which char we want to split it
        // say for eg -> @ if used will split it into 3 different strings
        // now we need array to store & print this values -> again index starts from 0
        String str = "vidya@vaishak@kini";
        String[] split = str.split("@");
        System.out.println(split[0]);
        System.out.println(split[1]);
        System.out.println(split[2]);

        // substring() returns a portion of a string
        // beginIndex & endIndex - 1
        // here it will start from index 1 till index  -> i.e. ona from Sonal
        System.out.println(name.substring(1,4));

        // toLowerCase()
        System.out.println("SONAL".toLowerCase());

        // toUpperCase()
        System.out.println("sonal".toUpperCase());

        // startsWith() will check & compare if it starts with that char & return boolean value
        System.out.println(name.startsWith("S"));

        // endsWith() will check & compare if it starts with that char & return boolean value
        System.out.println(name.endsWith("a"));

        // trim() will remove the spaces from beginning & ending of quotes if any
        String name1 = "   Sonal Patel   ";
        System.out.println(name1.trim()); // Sonal Patel is the Output

        // compareTo() will compare the value & return integer value 0 if it's true
        System.out.println(name.compareTo("Sonal"));

        // compareToIgnoreCase() will compare the value by ignoring its case & return integer value 0 if it's true
        System.out.println(name.compareToIgnoreCase("sonal"));

        // concatenation can be done using + operator as well in case of Strings
        String s1 = "Good";
        String s2 = " Morning"; // extra space will be added while concatenating
        String s3 = s1 + s2;
        System.out.println(s3);


    }
}
