package estruturascondicionais.lacosderepeticao.whiles;

import java.util.Scanner;

public class menuNavegavel {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            int opcao = 0;
            while(opcao != 3){
                System.out.println("Digite uma opção: ");
                System.out.println("1. Calcular imposto: ");
                System.out.println("2. Depositar salário: ");
                System.out.println("3. Sair: ");
                opcao = teclado.nextInt();

                if(opcao == 1){
                    System.out.println("Calcular imposto selecionado");
                    System.out.println("------------------------------------------------------------------------------------------");
                } else if (opcao == 2){
                    System.out.println("Depositar imposto selecionado");
                    System.out.println("------------------------------------------------------------------------------------------");
                } else if (opcao == 3){
                    break;
                } else {
                    System.out.println("Opcao inválida");
                }
            }
        }
    }

