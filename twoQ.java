import java.util.Scanner;


public class twoQ {
 public static void main(String[] args) {
    int myNumber = (int)( Math.random()* 100);
    System.out.println(myNumber);

    Scanner sc = new Scanner(System.in);
    int userInput;
    do {
    userInput = sc.nextInt();

    if ( userInput > myNumber){
    System.out.println("My number was small");}
    else if (userInput< myNumber){
    System.out.println("Mine is bigger");
    }
   
        
    }while
        (userInput != myNumber);
        {
            System.out.println("win win");
        }

    
    
}

}
