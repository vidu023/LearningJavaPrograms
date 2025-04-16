package ex_28_ENUM;

public enum Locators{
    // key with locator value
    page_button ("#btn"),
    page_input ("#input");

    public String getLocators() {
        return Locators;
    }

    private String Locators;

    Locators(String locators){
        this.Locators = locators;
    }
}
