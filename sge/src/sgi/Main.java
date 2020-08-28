/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pessoa;

import java.util.Scanner;

/**
 * Instituição: Centro Universitário de Maringá
 * Diciplina: Programação I
 * Aluno: André Alves de Oliveira
 * @author aavls
 */
public abstract class Pessoa {

    protected String nome;
    protected String documento;
    
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        short opcao = 0;
        
        do {
            System.out.println("Digite a operacao desejada:");
            System.out.println("  1. Cadastrar Funcionário");      
            System.out.println("  2. Cadastrar Cliente");      
            System.out.println("  0. Cancelar");
            opcao = entrada.nextShort();
            
            if (!OperacaoExiste(opcao)) {
            	 continue;
            }
            
            if (opcao == 0) {
            	 System.out.println("Programa Encerrado!");
            	 break;
            } 
            
            if (opcao == 1) {
            	 System.out.println("Funcionário Cadastrado");
            	 break;
            }
            
            if (opcao == 2) {
            	 System.out.println("Cliente Cadastrado");
            	 break;
            } 
        } while (opcao != 0);
        
        
    }
    
    static boolean OperacaoExiste (short opcao) {
       	boolean retorno = true;
    	if (opcao > 2) {
       		System.out.println("ERRO: Operacao escolhida é invalida.\n");
       		retorno = false;
       	}
    	return retorno;
    }
    
    static String getNomeOperacao (short opcao) {
    	
    	switch (opcao) {
		case 1:
			return "soma";
		case 2:
			return "subtracao";
                default:
                        return "undefined";
    	}
    	
    }
}
