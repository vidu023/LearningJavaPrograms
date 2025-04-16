package ex_28_ENUM;

import java.awt.*;

public class Lab205_ENUM_LocatorsEg {
    public static void main(String[] args) {
        // give me the value of that key locator
        System.out.println(Locators.page_button.getLocators());
        System.out.println(Locators.page_input.getLocators());

        System.out.println("-------------------------------------");
        System.out.println(Colours.RED.getHexCode());

        System.out.println("-------------------------------------");
        System.out.println(APIURLs.katalon.getURL());
    }


}


