import java.util.Scanner;
public class PromedioPrincipal {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite nota 1");
        int nota1=entrada.nextInt();
        
        System.out.println("Digite segunda nota");
        int nota2 =entrada.nextInt();
        
         System.out.println("Digite tercera  nota");
        int nota3 =entrada.nextInt(); 
        
        Promedio mensajero = new Promedio(nota1,nota2,nota3);
        mensajero.imprimir();
        
        
        
    }
    
}
