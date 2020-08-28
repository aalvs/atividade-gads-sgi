
package sgi;

/**
 * Instituição: Centro Universitário de Maringás
 * Diciplina: Programação I
 * Aluno: André Alves de Oliveira
 * @author aavls
 */
abstract class Funcionario extends Pessoa{
    protected double salario;
    protected int ramal;
    
     public double calculaSalarioAnual(){
        double decTerceiro = this.salario / 12;
        double salarioAnual = (this.salario + decTerceiro) * 12 ;
        return salarioAnual;
    }
    
    public Funcionario(){
        this("", "", 0.0, 0, "");
    }
    
    public Funcionario(String nome, String documento, double salario, int ramal, String cargo){
        this.setNome(nome);
        this.setDocumento(documento);
        this.setSalario(salario);
        this.setRamal(ramal);
        this.setCargo(cargo);
    }
    
    @Override
    public void exibeDados(){
        System.out.println("----- Dados de Funcionário -----");
        super.exibeDados();
        System.out.println("Cargo: " + getCargo());
        System.out.println("--------------------------------");
        System.out.println(""); 
        
    }
        
    //Metódos getters e setters
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }       
}
