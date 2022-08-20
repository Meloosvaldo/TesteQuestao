/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testequestao;

/**
 *
 * @author user
 */
public class TesteQuestao {

    public static void main(String[] args) {
    C1 a = new C2();
    C1 b = new C2();
    C1 c = new C3();
    Object o1 = a.criar(); 
    o1 = a.criar();
    Object o2 = b.criar();
    Object o3 = c.criar();
    o3 = c.criar();     
    a.exibir(); 
    b.exibir();
    c.exibir(); 
    System.out.print(" " + o1);
    System.out.print(" " + o2); 
    System.out.print(" " + o3); 
   
}
}