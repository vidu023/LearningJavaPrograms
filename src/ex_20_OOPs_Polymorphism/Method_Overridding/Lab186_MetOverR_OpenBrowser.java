package ex_20_OOPs_Polymorphism.Method_Overridding;

public class Lab186_MetOverR_OpenBrowser {
    public static void main(String[] args) {

        ChromeBrowser cm = new ChromeBrowser();
        FirefoxBrowser ff = new FirefoxBrowser();

        cm.openBrowser();
        ff.openBrowser();

        // Dynamic Dispatch
        CommonBrowser cb1 = new ChromeBrowser();
        CommonBrowser cb2 = new FirefoxBrowser();

        System.out.println("------Dynamic Dispatch-------");
        // Father Reference with Child Object

        cb1.openBrowser();
        cb2.openBrowser();

        //FirefoxBrowser fb = new ChromeBrowser(); // not possible -> no relation

    }

}

class CommonBrowser{

    void openBrowser(){
        System.out.println("Common Browser will open");
    }
}

class ChromeBrowser extends CommonBrowser{

    void openBrowser(){
        System.out.println("Chrome Browser will open");
    }
}

class FirefoxBrowser extends CommonBrowser{

    void openBrowser(){
        System.out.println("FireFox Browser will open");
    }
}