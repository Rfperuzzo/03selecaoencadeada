
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
      
        int num;
        
        System.out.println("Digite um número" );
        num = scanner.nextInt();
        
        if (( num % 10 ) == 0){
            System.out.println("é multiplo de 10");
        }else{
            if (( num % 5 == 0)){
                System.out.println("é multiplo de 5");
        }else{
            if (( num % 2 == 0)){
                System.out.println("é multiplo de 2");
        }else{
                    System.out.println("não é multiplo de neida");
            }
                
            }
            
        }
            
        
       
        
        
        
    }
}
