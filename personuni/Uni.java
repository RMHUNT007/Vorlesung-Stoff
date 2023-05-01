package personuni;

public class Uni{
    public static void main(String[] args) {
         Person kim = new Person ("kim","kim@hhu.de");
         

         System.out.println(kim);

         Employee martin  = new Employee ("Martin" , "mauve@hhu.de" , 1234);

         System.out.println(martin);
         System.out.println(martin.getSalary());
         ;
    }
    
}