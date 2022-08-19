/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servico;

import Model.Agendamento;

/**
 *
 * @author user
 */
public class Correio {
    public void NotificarPorEmail(Agendamento agendamento){
    String emailFormatado = formarEmail(agendamento); 
    String destinatario = agendamento.getCliente().getEmail();
    
    Email email = new Email("Agendamento BarberShop", emailFormatado, destinatario);
    email.enviar();
    }

    private String formarEmail(Agendamento agendamento) {
       String nomeCliente = agendamento.getCliente().getNome();
       String servico = agendamento.getServico().getDescricao();
       String dataAgendamento = agendamento.getHoraFormatada();
       String horaAgendamento = agendamento.getHoraFormatada();
       float valor = agendamento.getValor();
       return "Olá " + nomeCliente + " vai da um tapa no visual...Seu agendamento para" + servico + 
               ", esta marcaddo para o dia " + dataAgendamento + " às "+ horaAgendamento + " O preço fica para você por R$ "
               + valor+ "Forte abraço!";
    }
}
