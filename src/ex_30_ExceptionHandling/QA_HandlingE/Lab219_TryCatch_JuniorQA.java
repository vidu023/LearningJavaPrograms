package ex_30_ExceptionHandling.QA_HandlingE;

public class Lab219_TryCatch_JuniorQA {
     public static void main(String[] args) {
         // Regular Junior QA who has no knowledge about exception handing

         try {
             // vulnerable code
             String z = args[0];
             int age = Integer.parseInt(z);
             String name = null;
             name.trim();
             int a = 10/0;
         } catch (Exception e) {
             System.out.println(e.getMessage());
         }
     }
}
