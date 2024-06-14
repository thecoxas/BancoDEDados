/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.Helper;

import model.Usuario;
import view.Login;

/**
 *
 * @author welton
 */
public class LoginHelper {

    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }

    public Usuario obterModelo() {
        String nome = view.getTxtUsuario().getText();
        String senha = view.getTxtSenha().getText();
        Usuario modelo = new Usuario(1, "barbeiro", 'M', "18/07/1990", "30212121", "rafael.novo@fmpsc.edu.br", "521454123",
                "barbeiro", "administrador");
        return modelo;

    }
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTxtUsuario().setText(nome);
        view.getTxtSenha().setText(senha);
    }
    public void limparTela(){
        view.getTxtUsuario().setText(" ");
        view.getTxtSenha().setText(" ");
    }

}
