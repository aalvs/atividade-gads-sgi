
package sgi;

/**
 * Instituição: Centro Universitário de Maringá
 * Diciplina: Programação I
 * Aluno: André Alves de Oliveira
 * @author aavls
 */
public class Presidente extends Funcionario{
    
    public Presidente(){
        this("", "", 0.0, 0, "");
    }
    
    public Presidente (String nome, String documento, double salario, int ramal, String cargo){
        this.setNome(nome);
        this.setDocumento(documento);
        this.setSalario(salario);
        this.setRamal(ramal);
        this.setCargo(cargo);
    }
    
    @Override
    public void exibeDados(){
        super.exibeDados();
    }
}
