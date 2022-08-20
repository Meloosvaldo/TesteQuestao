/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testequestao;


public class C2 extends C1 {
    int i = 0;
    Integer j;
    
    public Object criar(){
        i++;
        j = new Integer(i);
      return j;
      }
      public void exibir(){ 
        System.out.println("j = " + j); 
 
}
      
}
        