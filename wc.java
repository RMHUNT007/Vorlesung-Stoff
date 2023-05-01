import java.util.Scanner;

public class wc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int wordCount=0;

        while(sc.hasNext()){
            String line =sc.nextLine();
            String []words =line.split(" ");


            wordCount += words.length;
        }
        System.out.println(wordCount);
        
    }
    
}
