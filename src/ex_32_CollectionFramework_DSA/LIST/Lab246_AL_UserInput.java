package ex_32_CollectionFramework_DSA.LIST;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab246_AL_UserInput {
    // Taking Input from User -> Name & Age
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> name = new ArrayList();
        ArrayList<Integer> age = new ArrayList();

        String continueInput = "Y";

        while (continueInput.equalsIgnoreCase("Y")) {


            System.out.println("Enter Name: ");
            String inputName = scanner.next();
            name.add(inputName);

            System.out.println("Enter Age: ");
            Integer inputAge = scanner.nextInt();
            age.add(inputAge);

            scanner.nextLine();
            System.out.println("Do you want to Enter another Record? (Y/N): "); // if Y then again it will iterate
            continueInput = scanner.nextLine();
        }

        for (Object n : name){
            System.out.println(name);
        }
        for (Object a : age){
            System.out.println(age);
        }
        scanner.close();

    }

}
