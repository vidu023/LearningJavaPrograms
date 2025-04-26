package ex_31_Generics;

public class Lab231_GenericsMethod {
    public static void main(String[] args) {
        sum(15,28);
        sum(15.28,28.15);
        sum("Vidya","Kini");
    }

    static <T> T sum(T a, T b){
        return null;
    }
}
