package ex_30_ExceptionHandling;

public class Lab229_CustomException_BankEg {
    public static void main(String[] args) {

        Bank sbi = new Bank("INR", 75000, "SBI");
        Bank icici = new Bank("INR", 150000, "ICICI");

        //int totalAmt = sbi.amount+ icici.amount;
        // instead of above adding like this -> use add function from the bank class
        int totalAmt = sbi.add(icici); // adding icici amount to sbi drectly
        System.out.println(totalAmt);

        Bank jp_chase = new Bank("USD", 5000, "JP CHASE");
        // in this bank i have USD
        // I cannot add INR & USD -> should throw error
        // custom exception needs to be created in bank class with the check in the currency

        int total = icici.add(jp_chase);
        System.out.println(total);
    }
}
