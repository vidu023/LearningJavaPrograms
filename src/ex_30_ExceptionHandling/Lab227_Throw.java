package ex_30_ExceptionHandling;

public class Lab227_Throw {
    public static void main(String[] args) {

    }

    static  void divideByZero(int a){
        if(a==0){
            throw new ArithmeticException();
            // here we are throwing the exception automatically & not asking jvm
            // here jvm is not creating an exception
            // in try catch we are catching an exception
        }
    }
}
