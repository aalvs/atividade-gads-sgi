
package sgi;

/**
 * Instituição: Centro Universitário de Maringá
 * Diciplina: Programação I
 * Aluno: André Alves de Oliveira
 * RA: 19131743-5
 * @author aavls
 */
abstract class Pessoa {
    protected String nome;
    protected String documento;
    protected String cargo;
    
    public Pessoa(){
        this("", "");
    }
    
    public Pessoa(String nome, String documento){
        this.setNome(nome);
        this.setDocumento(documento);
    }
    
    public void exibeDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Documento: " + getDocumento());
    }
    
    //Metódos getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
    
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
