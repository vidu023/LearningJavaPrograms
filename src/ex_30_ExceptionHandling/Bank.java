package ex_30_ExceptionHandling;

public class Bank {

    String currency;
    Integer amount;
    String bankName;

    // Getter - Setter methods

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    // Default Constructor
    public Bank() {
    }

    //Parameterized Constructor
    public Bank(String currency, Integer amount, String bankName) {
        this.currency = currency;
        this.amount = amount;
        this.bankName = bankName;
    }

    // a function to add the total amount
    public Integer add(Bank bankName) {

        if (bankName.currency == "INR") {
            return bankName.amount + this.amount;
            // passing icici bank name
            // bankName.amount -> icici
            // this.amount -> sbi
        } else {
            try {
                throw new CurrencyMismatchCustomException("Currency Mismatch -> Amount cannot be added");
            } catch (CurrencyMismatchCustomException e) {
                System.out.println(e.getMessage());
            }
            //now this must be handled using try catch block
            // since we are using custom exception
        }
        return 0;
    }

}

    // create a Custom Exception -> CurrencyMismatchCustomException class with extends Exception class
    class CurrencyMismatchCustomException extends Exception{
        // Parametrized constructor
        CurrencyMismatchCustomException(String msg){
            // call the parent-> Exception constructor using super keyword
            super(msg);
        }
    }


