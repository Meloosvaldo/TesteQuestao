/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Model.Agendamento;
import Model.Cliente;
import Model.Servico;
import Model.Usuario;

public class Main {
   public static void main(String[]args){
      
       Servico servico = new Servico(1,"barba", 30);
       
       Cliente cliente = new Cliente(2, "Assis", "Rua teste", "120012211");
       System.out.println(cliente.getNome());
       
       Usuario usuario = new Usuario(3, "Barbeiro", "Senha");
       System.out.println(usuario.getNome());
       
       Agendamento agendamento = new Agendamento(1, cliente, servico, 40, "13/06/2022 as 15:00");
       System.out.println(agendamento.getCliente().getNome());
   }
    
    
}
