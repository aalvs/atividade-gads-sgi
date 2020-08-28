
package sgi;

/**
 * Instituição: Centro Universitário de Maringá
 * Diciplina: Programação I
 * Aluno: André Alves de Oliveira
 * @author aavls
 */
public class Cliente extends Pessoa{
    private String usuario;
    private String senha;
    public String s;
    
    public boolean verificarSenha(String s){
        System.out.println(senha.equals(s));
        return true;
    }
 
    public Cliente() {
        this("", "", "", "", "");
    }
    
    public Cliente(String nome, String documento, String usuario, String senha, String cargo){
        this.setNome(nome);
        this.setDocumento(documento);
        this.setUsuario(usuario);
        this.setSenha(senha);
        this.setCargo(cargo);
    }
    
    @Override
    public void exibeDados(){
        System.out.println("------- Dados de Cliente -------");
        super.exibeDados();
        System.out.println("Cargo: " + getCargo());
        System.out.println("--------------------------------");
        System.out.println("");
    }
       
    //Metódos getters e setters
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }             
}
