
package sgi;

/**
 * Instituição: Centro Universitário de Maringá
 * Diciplina: Programação I
 * Aluno: André Alves de Oliveira
 * RA: 19131743-5
 * @author aavls
 */
public class Vendedor extends Funcionario{
    private double comissao;
    
    public double salarioMesComComissao() {
        double salarioMaisComissao = this.salario + comissao;
        return salarioMaisComissao;
    }
    
    public Vendedor(){
        this("", "", 0.0, 0, "");
    }
    
    public Vendedor (String nome, String documento, double salario, int ramal, String cargo){
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
    
    //Metódos getters e setters
    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
}
