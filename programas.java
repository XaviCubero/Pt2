import java.io.*;
import java.util.Random;

public class programas {
public static void main(String[] args) throws IOException {

    String a,b,c,d;
    int numero , cerca , posicio, notas, contador;
    int nota[] = new int [50];
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    
    posicio=0;
    notas=0;
    contador=0;
    
    System.out.print("Escriu la quantitat de notes d'alumnes: ");
    b = reader.readLine();
    numero = Integer.parseInt(b);  // conversió de String a Int
    
    if (numero > 50){
        System.out.println("Error!!");}
    
    else{
        for (int x= 0 ; x<numero ; x++){
    
        System.out.print("Escriu la nota de l'alumne: ");
        c = reader.readLine();
        nota[x] = Integer.parseInt(c);  // conversió de String a Int
        
        if (nota[x] >= 11){
            System.out.println("La nota no pot ser major que 10!!");}
        }
    
        for (int y= 0 ; y<numero ; y++){
        System.out.print(nota[y]+",");
        notas=nota[y];
        
        }
    }
    
    System.out.println("\n"+"Escriu la nota que vols cercar: ");
    a = reader.readLine();
    cerca = Integer.parseInt(a);  // conversió de String a Int
    
    for (int y= 0 ; y< numero ; y++){
        
        if (nota[y]==cerca){
            contador++;
        }
    }
    System.out.println("Hi ha " + contador + " notes amb el valor: " + cerca + " a les poscions");
    for (int y= 0 ; y< numero ; y++)
        if (nota[y]==cerca){
            contador++;
            System.out.println(y);
        }    
}    
}
