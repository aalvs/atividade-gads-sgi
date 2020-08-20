/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

/**
 *
 * @author aavls
 */
public class Cliente extends Pessoa {
    private String usuario;
    private String senha;
    
    public boolean verificarSenha(){
        return true;
    }
}
