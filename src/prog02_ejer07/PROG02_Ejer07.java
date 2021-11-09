
import java.util.Scanner;


public class PROG02_Ejer07 {

   
    public static void main(String[] args) {
        
    Scanner sc= new Scanner(System.in); 
  

    System.out.print("Primer numero: ");  
    float a= sc.nextInt();  

    System.out.print("Segundo numero: ");  
    float b= sc.nextInt();  
    
    double c = a / -b;
    
    System.out.print("x="+ c +"\n");
    
    
    }
    
}
