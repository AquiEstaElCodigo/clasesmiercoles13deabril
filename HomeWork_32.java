/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasesMiercoles13;

/**
 *
 * @author germanriveros
 */
public class HomeWork_32 
{
    
    public void solucion()
    {
        
        //La matriz C es el resultado de la suma de las matrices A y B.
        
        int[][] A = new int[][]
        {
            {10, 8, 3, 0},
            {7, -3, 33, 45},
            {9, 15, 71, 29}
        };
    
        
        int[][] B = new int[3][4];  
    
            B[0][0] = 1;  B[0][1] = 6;  B[0][2] = 9;  B[0][3] = 59;
            B[1][0] = 14; B[1][1] = 22; B[1][2] = 56; B[1][3] = 7;
            B[2][0] = 3;  B[2][1] = 5;  B[2][2] = 80; B[2][3] = 1; 
        
        int[][] C = new int[3][4];    
           
        
        for (int fil = 0; fil < C.length; fil++) 
            
            for (int col = 0; col < C[fil].length; col++) 
                
                C[fil][col] = A[fil][col] + B[fil][col]; //...la suma.
            
            
        for (int fil = 0; fil < C.length; fil++) 
            
            for (int col = 0; col < C[fil].length; col++) 
    
                System.out.println(C[fil][col]);
            
  
    }//..
    
}//.
