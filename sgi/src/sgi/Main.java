
package sgi;

import java.text.DecimalFormat;

/**
 * Instituição: Centro Universitário de Maringá
 * Diciplina: Programação I
 * Aluno: André Alves de Oliveira
 * @author aavls
 */
public class Main {
    
    public static void main(String[] args) {
        
        DecimalFormat fmt = new DecimalFormat();
        fmt.applyPattern("##0,000.00");
        
        //Cadastro do Presidente
        Presidente ps1 = new Presidente
            ("Asdrubal Leôncio Correa",
            "CPF 88.909.349-06", 
            12000, 
            451, 
            "Presidente");
        
        //Cadastro das Secretárias
        Secretaria sc1 = new Secretaria
            ("Fátima",
            "CPF 67.245.145-02", 
            2400, 
            452, 
            "Secretária");
        
        Secretaria sc2 = new Secretaria
            ("Ana",
            "CPF 90.656.485-77", 
            2400, 
            453, 
            "Secretária");
        
        //Cadastro dos Vendedores
        Vendedor vend1 = new Vendedor
        ("João",
                "CPF 64.852.145-03", 
                1800, 
                351, 
                "Vendedor");
        
        Vendedor vend2 = new Vendedor
        ("Vanessa",
        "CPF 56.586.234-87", 
        1800, 
        352, 
        "Vendedor");
        
        Vendedor vend3 = new Vendedor
        ("Carlos",
        "CPF 68.486.963-02", 
        1800, 
        353, 
        "Vendedor");
        
        //Comissão dos Vendedores
        vend1.setComissao(920);
        vend2.setComissao(800);
        vend3.setComissao(840);
        
        //Cadastro dos Clientes
        Cliente client1 = new Cliente
            ("Marcos",
            "CPF 54.689.320-12", 
            "sgi.marcos", 
            "outrosegredo", 
            "Cliente");
        
        Cliente client2 = new Cliente
            ("Joana",
            "CPF 89.969.303-77", 
            "sgi.joana", 
            "teste", 
            "Cliente");
        
        Cliente client3 = new Cliente
        ("Elisa",
        "CPF 23.856.569-56", 
        "sgi.elisa", 
        "segredo", 
        "Cliente");
        
        Cliente client4 = new Cliente
        ("Lucas",
        "CPF 84.995.314-08", 
        "sgi.lucas", 
        "123456", 
        "Cliente");
        
        //Salário Anual Funcionários Asdrubal e Ana
        System.out.println("----- Salário Anual de Funcionários -----");
        System.out.println("O salário anual do " + ps1.nome + " mais 13º é "
                + "de R$ " + fmt.format(ps1.calculaSalarioAnual()));
        System.out.println("O salário anual da " + sc2.nome + " mais 13º é "
                + "de R$ " + fmt.format(sc2.calculaSalarioAnual()));
        System.out.println(""); 
        System.out.println("Obs:Os valores exibidos acima, "
                + "estão considerando 12 meses trabalhados sem "
                + "desconto do Imposto de Renda e INSS!");
        System.out.println("--------------------------------");
        System.out.println(""); 
        
        //Verificação de senha do vendedor Lucas
        System.out.println("----- Verificação de Senha -----");
        client4.verificarSenha("123456");
        client4.verificarSenha("segredo");
        client4.verificarSenha("teste");
        System.out.println("--------------------------------");
        System.out.println(""); 
        
        //Exibir dados dos usuários
        ps1.exibeDados();
        sc1.exibeDados();
        sc2.exibeDados();
        vend1.exibeDados();
        vend2.exibeDados();
        vend3.exibeDados();
        client1.exibeDados();
        client2.exibeDados();
        client3.exibeDados();
        client4.exibeDados();                 
    } 
}