/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetopessoas;

public class ProjetoPessoas {

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();
        
        p1.setNome("Pedro");
        p1.setSexo("M");
        p2.setNome("Maria");
        p3.setNome("Claudio");
        p4.setNome ("Fabiano");
        p4.setSexo("F");
        p3.setIdade(28);
        p2.setCurso("Informatica");
        p3.setSalario(2500.75f);
        p4.setSetor("estoque");
        p3.receberAumento(550.20f);
        p4.mudaTrabalho();
        p2.cancelarMatr();
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString()); 
        System.out.println(p4.toString());
        
    }
    
}
