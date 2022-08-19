/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import View.Login;
import View.MenuPrincipal;

public class LoginController {

    private final Login view;
    private final LoginHelper helper;
       
    public LoginController(Login view) { 
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
         //pegar um usuário da view  
         Usuario usuario = helper.obterModelo();
          
         
          //pesquisar um usuário no Banco
          UsuarioDAO usuarioDAO = new UsuarioDAO();
              Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
               
              //se o usuário da view tiver o mesmo usuário e senha que o usuário do Banco direcionar para menu principal.
          //se não mostrar uma mensagem ao usuário "usuário ou senha inválido"
              if (usuarioAutenticado != null){
                  MenuPrincipal menu = new MenuPrincipal();
                  menu.setVisible(true);
                  this.view.dispose();
              }else {
                  view.exibeMensagem("usuário ou senha inválidos");
              }
          
          
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do Banco de Dados");
        this.view.exibeMensagem("Executei o fiz tarefa");
    }
    
}
