/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpaneatividade;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author 31441841
 */
public class JOptionPaneAtividade {

    /**
     * @param args the command line arguments
     */
    
    public JOptionPaneAtividade() {
    }
    
    public static void main(String[] args) {
//        entradaValor();
        entradaExercicio2();
    }
    
    
    public static void entradaValor(){
      
        
    String aux="";
    double result;
    aux = JOptionPane.showInputDialog("Digite o valor do produto:");
    double valorProduto = Double.parseDouble(aux);
    aux = JOptionPane.showInputDialog("Digite o código de aumento: ");
    int codigoAumento = Integer.parseInt(aux);
    
    switch (codigoAumento){
        case 1: 
     result = valorProduto + (valorProduto * 0.10);
    JOptionPane.showMessageDialog(null," O valor final do produto é " + result);  
        break;
            
            case 3:                
                result = valorProduto + (valorProduto * 0.25);
    JOptionPane.showMessageDialog(null," O valor final do produto é " + result);
        break;
                
                case 4: 
                    result = valorProduto + (valorProduto * 0.30);
    JOptionPane.showMessageDialog(null," O valor final do produto é " + result);
        break;
                    
                    case 8: 
                        result = valorProduto + (valorProduto * 0.50);
    JOptionPane.showMessageDialog(null," O valor final do produto é " + result);
        break;
                        
                    default:
                        
                        JOptionPane.showMessageDialog(null," Código inválido ");
                        
    }    
    }

    public static void entradaExercicio2(){
        Scanner entrada = new Scanner (System.in);
        int aux;
        do{
         System.out.println("1-Solteiro(a)\n"+ "2-Desquitado(a)\n"+ "3-Casado(a)\n"+"4-Divorciado(a)\n"+ "5-Viúvo(a)\n");
         System.out.println("Digite o código do seu estado civil: ");
         aux = entrada.nextInt();
         
         
         switch (aux){
        case 1:
            System.out.println("Você é solteiro(a)");
            break;
            
            case 2:
            System.out.println("Você é desquitado(a)");
            break;
                
                case 3:
            System.out.println("Você é casado(a)");
            break;
                    
                    case 4:
            System.out.println("Você é divorciado(a)");
            break;
                        
                        case 5:
            System.out.println("Você é viúvo(a)");
            break;
                            
                        default:
                            System.out.println("Esse código não é válido. Digite um código válido");
        }
        }while(aux<1 || aux>5);
    }
    
    
}