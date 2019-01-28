/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianguloisoceles;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class TrianguloIsoceles {

    /**
    ne
     */
    
    public static double MArea(ArePerCo comparacion[])
    {
    double area; 
    
    area = comparacion[0].Area();
    for(int i=1;i < comparacion.length;i++)
    {
     if(comparacion[i].Area() > area) 
     {
      area = comparacion[i].Area();
         
          
     }
       
    }      
   return area;     
    }
    
    
    
    
    public static void main(String[] args) throws IOException  {
   float base, lado1;
   int contador=0;
   String verif ="";
   Scanner in = new Scanner(System.in);
   BufferedReader bc = new BufferedReader(new InputStreamReader(System.in));
   
   
   System.out.println("Cuantos triangulo vas a sacar?");
   contador= in.nextInt();

   ArePerCo comparacion[] = new ArePerCo[contador];
   
   for(int i =0 ; i < contador;i++)
   {
   System.out.println("---------------" + (i+1));
       
System.out.println("Dame la base");
base = in.nextFloat();
System.out.println("Dame el lado");
lado1 = in.nextFloat();
comparacion[i] = new ArePerCo(base,lado1);

System.out.println("El perimetro es " + comparacion[i].Perimetro());
System.out.println("El area es " + comparacion[i].Area());

   }
System.out.print("El area mayor es " + MArea(comparacion));   
    
       
       
   }
   
   
   
   
   
   
   
   
   
        
      
             
    
    

} 
