
public class Promedio {
    double nota1 , nota2 , nota3 ,promedio;
    
    public Promedio(int nota1 , int nota2 , int nota3){
    
    this.nota1=nota1;
    this.nota2=nota2;
    this.nota3=nota3;
    
    }
    
    public void calificacion(){
    
    promedio = (nota1 * 0.25 + nota2 * 0.25 + nota3 * 0.25)/3;
    
    }
    
    public void imprimir(){
    calificacion();
    System.out.println("El promedio es " + promedio);
    }
}
