/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testequestao;

/**
 *
 * @author user
 */
public class C3 extends C1 {
double d = 3.14;
float f;

public Object criar() {
   d++; 
   f = new Float(d); 
    return f;
}

public void exibir() {
  System.out.println("f = " + f);
}

}