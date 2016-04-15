/*
Declare, instancie e inicialice una matriz de 4 elementos con nombres de personas y despliegue sus elementos, utilice bucle for (anidados).
Escriba un programa similar al anterior, pero utilice bucles while. 
Escriba un programa similar al anterior, pero utilice bucles do-while.
Declare e inicialice una matriz de 6 elementos de tipo numérica, y despliegue tanto la suma total como sus elementos. 
Escriba un programa que ingrese por teclado cuatro números a una matriz y determine cual es el mayor.
Escriba un programa similar al anterior, pero ademas de determinar el mayor, muestre la ubicación de este (su índice).
Escriba un programa similar al del punto cinco, pero determine cual es el menor y cual es su índice.
Escribir un programa que llene una matriz con nueve números enteros consecutivos y haga una copia de esa matriz en otra multiplicado sus elementos por tres, despliegue los elementos de ambas matrices.
Escribir un programa que solicite seis notas, los almacene en una matriz y luego calcule el promedio, muestre un mensaje de aprobado o reprobado según sea el caso.
Escriba un programa que ingrese nueve números a una matriz y determine cual es el menor y su posición, cual es el mayor y si posición, cual es la suma de sus elementos, cuantos fueron pares e impares, cuantos fueron positivos y negativos, cuantos fueron múltiplos de cuatro y de tres y cual es el promedio.
 */
package ClasesMiercoles13;
import java.util.Scanner;


public class Ejercicios_32 
{
    
    private Scanner rd;
    
    public void _10()
    {
        
        rd = new Scanner(System.in);
        int[][] _m = new int[3][3];
        int min;
        int max = 0;
        int pares = 0;
        int impares = 0;
        int positivos = 0;
        int negativos = 0;
        int mCuatro = 0;
        int mTres = 0;
        int add = 0;
        int sum = 0;
        int a = 0; 
        int b = 0;
        int c = 0;
        int d = 0;
        
        

        for (int fil = 0; fil < _m.length; fil++) 
            
            for (int col = 0; col < _m[fil].length; col++) 
            {
            
                System.out.println("Enter number :");
                
                    _m[fil][col] = rd.nextInt();
            }
        
        
        System.out.println("Matrix elements: ");
        
        for (int fil = 0; fil < _m.length; fil++) 
            
            for (int col = 0; col < _m[fil].length; col++)
             
                System.out.println(_m[fil][col]);
          
        
        //...el menor y su posición.
        
        min = _m[0][0];
        
        for (int fil = 0; fil < _m.length; fil++) 
        
            for (int col = 0; col < _m[fil].length; col++) 
            
                if(min > _m[fil][col])
                {
                    
                    min = _m[fil][col];
                    
                        c = fil;
                            
                            d = col;
                }
        
        System.out.println("smaller: " + min);
        System.out.println("["+ c + " ][ " + d +" ] "+ " <- " + min);        
        
        
        // ...el mayor y su posición.
        
        
        for (int fil = 0; fil < _m.length; fil++) 
        
            for (int col = 0; col < _m[fil].length; col++) 
            
                if(max < _m[fil][col])                 
                {
                    
                    max = _m[fil][col];
                    
                        a = fil;
                    
                            b = col;
                }
            
        
        
        System.out.println("higher : " + max);
        System.out.println("["+ a + " ][ " + b +" ] "+ " <- " + max);
        
        
        
        //... la suma.
        

          for (int fil = 0; fil < _m.length; fil++) 
        
            for (int col = 0; col < _m[fil].length; col++) 
        
                add += _m[fil][col];
          
          
         System.out.println("Tot (sum): " + add); 
         
         
         //...pares e impares.
         
         
            for (int fil = 0; fil < _m.length; fil++) 
        
                for (int col = 0; col < _m[fil].length; col++) 
                    
                    if( _m[fil][col] % 2 == 0)
                          
                        pares++;
                    
                    else
                        
                        impares++;
                    
            
            System.out.println("pares: "+ pares);
            System.out.println("impares: "+ impares);
            
            
            //...positivos y negativos.
            
            
            for (int fil = 0; fil < _m.length; fil++) 
        
                for (int col = 0; col < _m[fil].length; col++) 
                    
                    if( _m[fil][col] > 0)
                    
                        
                        positivos++;
                    
                    else
                        
                        negativos++;
                    
            
            System.out.println("positivos: "+ positivos);
            System.out.println("negativos: "+ negativos);
            
            
            //múltiplos de tres y cuatro.
            
            
            for (int fil = 0; fil < _m.length; fil++) 
        
                for (int col = 0; col < _m[fil].length; col++) 
                    
                    if( _m[fil][col] % 3 == 0)
                    
                        
                        mTres++;
                    
                    else
                        
                        if( _m[fil][col] % 4 == 0)
                        
                            mCuatro++;
                    
            
            System.out.println("multiplos de tres: "+ mTres);
            System.out.println("multiplos de cuatro: "+ mCuatro);            
            
            
            //...promedio.
            
            
            for (int fil = 0; fil < _m.length; fil++) 
        
                for (int col = 0; col < _m[fil].length; col++) 
                    
                        sum += _m[fil][col];
            
                     
            System.out.println("Prom: " + (sum / 9) );
            
            
    }//..
    
    
    public void _9()
    {
        
        rd = new Scanner(System.in);
        double[][] scores = new double[3][2]; 
        double add = 0;
        double prom = 0;
        
        
        for (int fil = 0; fil < 3; fil++) 
            
            for (int col = 0; col < 2; col++) 
            {
                
                System.out.println("Enter scores: ");
                
                    scores[fil][col] = rd.nextDouble();
                
                        add += scores[fil][col];
            }
        
        prom = add / 6 ;
        
        System.out.println("Tot prom: " + prom);
        
        if(prom > 4.0) System.out.println("aprobado. ");
            
        else  System.out.println("Reprobado");
            
        
    }//..
    
    public void _8()
    {
        
        int[][] A = new int[3][3];
        int[][] B = new int[3][3];
        int v = 2;
        
        
        for (int fl = 0; fl < A.length; fl++) 
            
            for (int cl = 0; cl < A[fl].length; cl++) 
            {
                
                A[fl][cl] = v;
                
                    B[fl][cl] = A[fl][cl] * 3;
                
                        v += 2;
            }
        
        
        for (int i = 0; i < A.length; i++) 
            
            for (int j = 0; j < A[i].length; j++) 
                
                System.out.println( A[i][j] 
                        
                            + "  |   " + B[i][j]);
            
        
    }//...
    
    
    public void _7()
    {
        
        rd = new Scanner(System.in);
        int[][] b_m = new int[2][2];
        int mn = 0;
        int a=0;
        int b = 0;
        mn = b_m[0][0];      
        
        
        for (int fil = 0; fil < b_m.length; fil++) 
            
            for (int col = 0; col < b_m[fil].length; col++)
            {
                
                System.out.println("Enter number: ");
                
                    b_m[fil][col] = rd.nextInt();
            }
        
        
        System.out.println("Matrix elements: ");
        
        
        for(int i = 0; i < b_m.length ;i++)
            
            for (int col = 0; col < b_m[i].length; col++) 
                
                System.out.println(b_m[i][col]);
        
        //..el menor y su ubicación.              
        
        for(int i = 0; i < b_m.length ;i++)
            
            for (int col = 0; col < b_m[i].length; col++) 
                
                
                if(mn > b_m[i][col]) 
                {
                 
                    mn = b_m[i][col];
                    
                        a = i;
                    
                            b = col;
                }
                
        
        
        System.out.println("smaller : " + mn);
        System.out.println("[ " + a + " ][ "+ b +" ] : "+ mn);
        
    }//..
    
    public void _6()
    {
        
        rd = new Scanner(System.in);
        int[][] nu_2 = new int[2][2];
        int aux = 0;
        int a=0;
        int b = 0;
        
        
        for (int fil = 0; fil < nu_2.length; fil++) 
            
            for (int col = 0; col < nu_2[fil].length; col++) 
            {
                
                System.out.println("Enter number: ");
                
                    nu_2[fil][col] = rd.nextInt();
            }
        
        
        System.out.println("Matrix elements: ");
        
        for(int i = 0; i < nu_2.length ;i++)
            
            for (int col = 0; col < nu_2[i].length; col++) 
                
                System.out.println(nu_2[i][col]);
        
        

        //..el mayor y su ubicación.
        
        for(int i = 0; i < nu_2.length ;i++)
            
            for (int col = 0; col < nu_2[i].length; col++) 
                
                if(aux < nu_2[i][col]) 
                {
                 
                    aux = nu_2[i][col];
                        
                        a = i;
                     
                            b = col;
                }
                
        
        
        System.out.println("higher: " + aux);
        System.out.println("[ " + a + " ][ "+ b +" ] : "+ aux);
        
        
    }//..
    
    public void _5()
    {
        
        rd = new Scanner(System.in);
        int[][] mtx = new int[2][2];
        int myr = 0;
        
        for (int row = 0; row < mtx.length; row++) 
            
            for (int col = 0; col < mtx[row].length; col++)
            {
                
                System.out.println("Enter number: ");
                
                    mtx[row][col] = rd.nextInt();
            }
        
        
        System.out.println("Matrix elements: ");
        
        for (int row = 0 ; row < mtx.length ; row++) 
            
            for (int col = 0; col < mtx[row].length; col++) 
              
                System.out.println(mtx[col][row] );
         
        
        //..higher.    
        
        
           for (int row = 0 ; row < mtx.length ; row++) 
            
            for (int col = 0; col < mtx[row].length; col++) 
              
                if(myr < mtx[row][col]) myr = mtx[row][col];
                    
                     
           System.out.println("higher: " + myr);
        
         
    }//...
    
    public void _4()
    {
        
        int[][] ntr = {{1,2},{3,4},{5,6}};
        int add = 0;
        
        System.out.println("Matrix elements: ");
        
        for (int i = 0; i < ntr.length; i++) 
            
            for (int col = 0; col < ntr[i].length; col++) 
            {
                   
                System.out.println
                            
                    ("[ " + i + " ][ " + col + " ] <- " + ntr[i][col]);
                   
                         add += ntr[i][col];
            }
        
        
        System.out.println("Tot: " + add);
        
    }//...
    
    public void _3()
    {
        
        String[][] phi = new String[][]
                
                        {{"Socrátes","Táles de Mileto"},
            
                                    {"Arquímedes","Pitágoras"}};
        
        int rw = 0;
        int cl = 0;
        
        
        System.out.println("Matrix elements: ");
        
        do{
            cl = 0;
            
            do{
                
                System.out.println(phi[rw][cl]);
                
                cl++;
                
            }while(cl < phi[rw].length);
            
            rw++;
            
        }while(rw < phi.length);
        
    }//...
    
    public void _2()
    {
        
        String[][] phi = new String[][]
                
                        {{"Socrátes","Táles de Mileto"},
            
                             {"Arquímedes","Pitágoras"}};
        
        int rw = 0;
        int cl = 0;
        
        
        System.out.println("Matrix elements: ");
        
        while(rw < phi.length)
        {
            
            cl = 0;
            
            while(cl < phi[rw].length)
              
                System.out.println("Philosopher: " + phi[rw][cl]); cl++ ;
                

            rw++;
        }

        
    }//...
    
    public void _1()
    {
        
        String[][] mtrz = new String[][]
                        
                            {{"Socrátes","Táles de Mileto"},
            
                                    {"Arquímedes","Pitágoras"}};
        
        
        System.out.println("Matrix elements: ");
        
        for (int row = 0; row < mtrz.length; row++) 
            
            for (int col = 0; col < mtrz[row].length; col++) 
                
                System.out.println(mtrz[row][col]);
                   
        
    }//...
    
}//.
