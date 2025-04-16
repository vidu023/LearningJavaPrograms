package ex_21_OOPs_Encapsulation;

public class Lab187_EncapsulationEx {
    public static void main(String[] args) {

        // Creating an instance of VWOLogin class
        VWOLogin blogin = new VWOLogin("admin","12345");
        System.out.println("----Public-----");
        System.out.println(blogin.usr);
        System.out.println(blogin.pwd); //outside class can access the password of other class due to public in nature
        blogin.pwd = "67890"; // the value can also be modified here -> which is not good
        System.out.println(blogin.pwd);

        // Creating an instance of Encapsulated VMOLogin class
        EVMOLogin elogin = new EVMOLogin("usr123", "pass123");
        // password here has a private access -> Error message
        // cannot access the attributes outside the class
        // System.out.println(elogin.password); // not possible
        // therefore with this we cannot modify

        // we need getter setter method
        // select the attributes -> Right click -> Generate -> Getter Setter Method for all attributes
        // now i can access username & modify it using this methods
        System.out.println("---Private, Encapsulated-----");
        elogin.setUserName("username");
        System.out.println(elogin.getUserName());

        elogin.setPassWord("password", true);
        System.out.println(elogin.getPassWord());


    }
}

class VWOLogin{
    public String usr;
    public String pwd;

    // Parameterized Constructor
    VWOLogin(String username, String password){

        this.usr = username;
        this.pwd = password;

    }
}
// Encapsulation
class EVMOLogin {


    // making attributes private allows to access only within the class and not outside the class
    // making public constructor
    private String userName;
    private String passWord;

     // Parameterized Constructor
    public EVMOLogin(String usr1, String pwd1) {

        this.userName = usr1;
        this.passWord = pwd1;
    }

    // Getter Setter
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    // checking the access if its allowed to modify
    public void setPassWord(String passWord, boolean isAdmin) {
        if (isAdmin) {
            this.passWord = passWord;
        } else {
            System.out.println("You are allowed to modify the password");
        }

    }
}