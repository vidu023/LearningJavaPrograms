package ex_21_Encapsulation;

public class Lab188_BankEx_Encapsulation {
    public static void main(String[] args) {
        // if I don't have setter method I am only allowed to access & wont be able to modify

        ICICIBank bank = new ICICIBank("Vidya", 500000L);

        // now I can get the balance & set the balance
        System.out.println("Old balance is: "+ bank.getBal());
        bank.setBal(7500000L, true); // isCashier -> true ....allowed to modify
        System.out.println("New Balance is: "+ bank.getBal());
        bank.setBal(2500000L, false); // isCashier -> false....not allowed to modify
        //System.out.println(bank.getBal());
    }
}

class ICICIBank{

    private  String name;
    private  long bal;

    // Parametrized Constructor
    public  ICICIBank(String uname, long balance){
        this.name = uname;
        this.bal = balance;
    }

    // Getter Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    // allow to set balance of a user only if he is cashier else not
    // controlled access
    public void setBal(long bal, boolean isCashier) {
        if(isCashier) {
            this.bal = bal;
        }
        else{
            System.out.println("Access Denied, You are not a Cashier");
        }
    }
}