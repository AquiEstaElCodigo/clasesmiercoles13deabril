/*
Escriba un programa que llene de forma automática un vector con los 20 primeros números impares (utilice el bucle while), sume y despliegue sus elementos.
Escriba un programa que llene de forma automática un vector con los múltiplos de 4 comprendidos entre 0 y 100, sume, cuente y despliegue dichos elementos.
Escribir un programa que llene un vector con cinco números consecutivos y haga una copia de ese vector en otro.
Escriba un programa similar al anterior, pero multiplique sus elementos por tres y copie sus elementos en otro vector.
Cree un vector de 7 elementos con el nombre notas ingrese sus datos por teclado, sume y calcule el promedio.
Escriba un programa similar al anterior, pero si su promedio es mayor que 4.0 muestre un mensaje de aprobado y de reprobado en caso contrario. 
Cree un vector de 5 elementos ingrese sus datos por teclado y determine cuál es el mayor.
Escriba un programa similar al anterior pero determine cual es el menor.
Escriba un programa similar a los dos anteriores, pero además de determinar cual es el mayor y el menor, muestre la posición o índice de estos.
Con dos vectores cree una (simple) agenda telefónica, la búsqueda deberá realizarla con los índices de los vectores.
 */
package ClasesMiercoles13;
import java.util.Scanner;

/**
 *
 * @author germanriveros
 */
public class HomeWork_31
{
    
    private Scanner read;
    private Scanner read_S;
    private Scanner read_I;
    
    public void _10()
    {
    
        read_S = new Scanner(System.in);
        read_I = new Scanner(System.in);
        String[] nms = new String[5];
        int[] nbr = new int[5];
        int index;
        
        
        
        for (int i = 0; i < nms.length; i++) 
        {
            
            System.out.println("Enter name: ");
            
                nms[i] = read_S.nextLine();
            
            System.out.println("Enter phone number: ");
            
                nbr[i] = read_I.nextInt();
        }
        
        System.out.println("Enter the index: ");
        
            index = read_I.nextInt();
        
        if(index >= 0 && index < 4) //...si "index" es mayor o igual que cero
            
            // [Y - AND] e "index" menor que 4, entonces.
                
            System.out.println("Name: " + nms[index] +
                    
                            " Phone number: " + nbr[index]);
        
        else //...Sino
            
            System.out.println("Error"); //...Solo números entre 0 y 4
        
        
        
        
    }//...
    
    public void _9()
    {
        
        read = new Scanner(System.in);
        int[] nu = new int[5];
        int aux_min;
        int aux_max = 0;
        int pos_max = 0;
        int pos_min = 0;
        
        for (int i = 0; i < nu.length; i++) 
        {
            
            System.out.println("Enter number: ");
            
                nu[i] = read.nextInt();
            
        }
        
        System.out.println("Vector Elements: ");

            for(int _n : nu) System.out.println(_n);
 
        aux_min = nu[0];
        
        for (int i = 0; i < nu.length; i++)
        {
            
            
            if(aux_min > nu[i])  
            {
              
                aux_min = nu[i]; //...el menor.
                    
                    pos_min = i; //...su posición.  
                    
            }  
            else
            
                    if(aux_max < nu[i]) 
                    {
                        
                        aux_max = nu[i]; //...el mayor.
                        
                            pos_max = i; //...su posición.
                            
                    }
                
        }
        
        System.out.println("higher: " + aux_max + 
                                    
                                " position: " + pos_max);
        
        System.out.println("smaller: " + aux_min + 
                
                                " position: " + pos_min);
        
    }//...
    
    public void _8()
    {
        
        read = new Scanner(System.in);
        int[] mr = new int[5];
        int aux;
        
    
        for (int i = 0; i < mr.length; i++) 
        {
            
            System.out.println("Enter number: ");
            
                mr[i] = read.nextInt();
            
        }
        
        //...determinando el menor.
        
        System.out.println("Vector Elements: ");

            for(int _m : mr) 
                
                System.out.println(_m);

        
        aux = mr[0];
        
        for (int i = 0; i < mr.length; i++) 
        
            if(aux > mr[i]) 
                
                aux = mr[i];
            
               
        System.out.println("smaller: " + aux);
        
    }//...
    
    public void _7()
    {
        
        read = new Scanner(System.in);
        int[] my = new int[5];
        int aux = 0;
    
        for (int i = 0; i < my.length; i++)
        {
            
            System.out.println("Enter number: ");
            
                my[i] = read.nextInt(); 
            
        }
        
        System.out.println("Vector Elements: ");

            for(int _m : my) 
                
                System.out.println(_m);
        
        
        //...determinando el mayor
            
        for (int i = 0; i < my.length; i++) 
            
            if(aux < my[i]) //... si aux es menor a algún elemento.
                
                aux = my[i]; //... ese elemento será igual a aux.
            
        System.out.println("mayor: " + aux);
        

    }//...
    
    public void _6()
    {
        
        read = new Scanner(System.in);
        double[] nt_B = new double[7];
        int tot, add=0;
        
        for (int i = 0; i < nt_B.length; i++)
        {
            
            System.out.println("Enter scores: ");
            
                nt_B[i] = read.nextDouble(); //... ingresando notas.
            
                    add += nt_B[i]; //... la suma.
        }
        
        System.out.println("Your scores: ");
        
            for(double _n : nt_B) 
                System.out.println(_n); //...desplegando las notas.
            
        
        tot = add /nt_B.length;
        
        System.out.println("Tot prom: " + tot);
        
            if(tot >= 4.0) //.. si el promedio es mayor que 4.0.
                
                System.out.println("Pass"); //... aprobado.
        
            else //sino
                
                System.out.println("reprobate"); //...reprobado
            

    }//...
    
    public void _5()
    {
        
        read = new Scanner(System.in);
        double[] notas = new double[7];
        int add=0;
        
        for (int i = 0; i < notas.length; i++) 
        {
            
            System.out.println("Enter scores: ");
            
                notas[i] = read.nextDouble(); //...ingresando notas por teclado.
                
                    add += notas[i]; //... la suma de los elementos.
        }
        
        System.out.println("Your scores: ");
        
        for(double _n : notas) System.out.println(_n);
            
        
        System.out.println("Tot prom: " + ( add / notas.length) ); 
        
    }//...
    
    public void _4()
    {
        
        int[] A = new int[5];
        int[] B = new int[5];
        
        for (int i = 0; i < A.length; i++) 
        {
            
            A[i] = i; //...añadiendo elementos al vector
            
                B[i] = 3 * A[i]; //...realizando la copia y multiplicando por 3.
        }
        
        System.out.println("Vector elements: ");
        
            for(int vc : A) System.out.println(vc);
            
        System.out.println("Vector(_B) elements: ");
        
             for(int _B : B) System.out.println(_B);

        
    }//End method
    
    public void _3()
    {
        
        //...declarando los vectores.
        
        int[] vector = new int[5];
        int[] vector_B = new int[5];
        
        for (int i = 0; i < vector.length; i++)
        {
            
            vector[i] = i; //... asignamos el valor de i al vector.
            
                vector_B[i] = vector[i]; //... realizando la copia.
                     
        }
        
        System.out.println("Vector elements: ");
        
            for(int vc : vector) 
                
                System.out.println(vc); //...desplegando elementos.
   
        System.out.println("Vector(_B) elements: ");
        
            for(int vc_B : vector_B) 
                
                    System.out.println(vc_B); //...desplegando elementos.

           
    }//End method
    
    public void _2()
    {
        
        int[] ml_4 = new int[25]; //Los múltiplos de 4 son 25.
        int counter = 0 ;
        int adder = 12;
        
        for (int i = 0; i < 100; i++) 
            
                if(i % 4 == 0)
                {
                    
                    ml_4[counter] = i; //...añadiendo los múltiplos de 4.
                    
                        adder += ml_4[counter]; //... la suma.
                        
                            counter++; //...contando los múltiplos.
                }
  
            
        System.out.println("Vector elements: ");
        
            for(int ml : ml_4) System.out.println(ml);
            
  
        System.out.println("Tot: " + adder);
        System.out.println("Counter: " + counter);
        
        //System.out.println("La cantidad de multiplos de 4 son: "+ contador);
        
    }//...
    
    public void _1()
    {

     //zona de declaración de variables
        
     int[] odd =  new int[20];
     int i = 0;
     int counter = 0;
     int add = 0;

     while(i < 40) 
     {

         if(i % 2 != 0)
         {

             odd[counter] = i; //...añadiendo los números impares al vector.
             
                add += odd[counter]; //...la suma de los elementos.
                
                    counter++;
                
          }

        i++;
     }
     
     System.out.println("Vector elements: ");

        for(int od : odd) System.out.println(od);
         
     System.out.println("Tot: "+ add);

    }//...
    
}//.
