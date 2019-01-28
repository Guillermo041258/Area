/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trianguloisoceles;

/**
 *
 * @author USER
 */
public class ArePerCo {
 private float base,lado;
 private float area,perimetro;
  
  public ArePerCo(float base,float lado1)
  {
   this.base= base;
   lado = lado1;
       
  }
public float Area()
  {
   area = (base * lado)/2;       
  return area;    
  }
  
public float Perimetro()
  {
   perimetro = (lado*2) + base;        
  return perimetro;    
  }
public String Resultado()
{
    return "Area: " + Area() + " Perimetro: " + Perimetro();
}
  
  

    
 
  
 
   
    
          
 
  
  
  
  
  
  
  

  
    
    
    
}
