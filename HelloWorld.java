import java.util.Scanner;

public class HelloWorld{

     public static void main(String []args){
        
        Scanner reader = new Scanner(System.in); 
        System.out.println("Vnesi stevilo: ");
        int n = reader.nextInt(); 
        
        for (int i = 1; i <= n; i++){
            if (i%3 == 0 && i%5 == 0){
                System.out.println("fizzbuzz");
            }
            else if(i%5 == 0){
                System.out.println("buzzzz");
            }
            else if(i%3 == 0){
                System.out.println("fizz");
            }else{
                System.out.println(i);
            }
        }
    }
}
