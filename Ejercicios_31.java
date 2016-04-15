/*
Declare e inicialice un vector de 10 elementos con nombres de personas.
Imprima los elementos situados en las posiciones 5, 9 y 2 del vector anterior.
Declare, instancie e inicialice un vector con los números del 1 al 5 y despliegue sus elementos con un bucle for.
Escriba un programa que llene automáticamente un vector con los numeros del cero al nueve, utilice un bucle for y despliegue sus elementos con un for-each. 
Escriba un programa similar al anterior, pero utilice el bucle while tanto para el llenado como para el despliegue de los elementos.
Escriba un programa similar al anterior, pero utilice el bucle do-while tanto para el llenado como para el despligue de elementos.
Escriba un programa que llene de forma automática un vector de 10 elementos y sume sus elementos, despliegue tanto los elementos como la suma de estos.
Escriba un programa que llene de forma automática un vector con los 20 primeros números pares (utilice el bucle for) y despliegue sus elementos.
 */
package ClasesMiercoles13;

import java.util.Scanner;

/**
 *
 * @author germanriveros
 */
public class Ejercicios_31 {
    
    Scanner leerS;
    Scanner leerI;
    
    public void _eight(){
        
        int[] pares = new int[20];
        int p = 0;
        
        for (int i = 1; i <= 40; i++) {
            
            if(i % 2 == 0){
            
                pares[p] = i;
                p++;
            }
            
        }
        System.out.println("Vector elements: ");
        for(int pp : pares){
            System.out.println(pp);
        }
        
    }//End method
    
    public void _seven(){
        
        int[] enteros = new int[10];
        int suma = 0;
        
        for (int i = 0; i < enteros.length; i++) {
            
            enteros[i] = i;
            suma += enteros[i];
        }
        System.out.println("Vector elements: ");
        for(int en : enteros){
            System.out.println(en);
        }
        System.out.println("Total sum: " + suma);
        
        
    }//End method
    
    
    public void _six(){
        
        int[] vector = new int[10];
        int b = 0;
        int c = 0;
        
        do{
            vector[b] = b;
            b++;
        }while(b < vector.length);
        
        System.out.println("Vector elements: ");
        
        do{
            System.out.println(vector[c]);
            c++;
        }while(c < vector.length);
                
        
    }//End method
   
    public void _five(){
        
        int[] nn = new int[10];
        
        int i = 0;
        
        while(i < nn.length){
            
            nn[i] = i; 
            i++;
        }
        
        System.out.println("Vector elements: ");
        int a = 0;
        while(a < nn.length){
            
            System.out.println(nn[a]);
            a++;
        }
        
    }//End method
    
    public void _four(){
        
        int[] n = new int[10];
        
        
        for (int i = 0; i < n.length; i++) {
            n[i] = i; 
        }
        System.out.println("Vector elements: ");
        
        //for-each
        for(int ii : n){
            System.out.println("n: "+ n[ii]);
        }
        
    }//End method
    
    
    public void _three(){
        
        int[] numeros = new int[5];
        
        numeros[0] =  1;
        numeros[1] =  2;
        numeros[2] =  3;
        numeros[3] =  4;
        numeros[4] =  5;
        
        System.out.println("Vector elements: ");
        for (int i = 0; i < numeros.length; i++) {
            
            System.out.println(numeros[i]);
        }
        
    }//End method
    
    
    public void _one(){
        
        String[] names = {"Platón","Aristóteles","Bacon","Descartes",
        "Kant","Hegel","Fietzsche","Heidegger","Foucaul","Byun-chul Han"};
          
        //method _two
        System.out.println(names[5]);
        System.out.println(names[9]);
        System.out.println(names[2]);
        
    }//End method


}//End class
