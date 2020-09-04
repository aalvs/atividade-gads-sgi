
package sgi;

/**
 * Instituição: Centro Universitário de Maringá
 * Diciplina: Programação I
 * Aluno: André Alves de Oliveira
 * RA: 19131743-5
 * @author aavls
 */
public class Secretaria extends Funcionario{
    
    public Secretaria(){
        
    }
    
    public Secretaria (String nome, String documento, double salario, int ramal, String cargo){
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
