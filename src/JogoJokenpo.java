import java.util.Scanner;
import java.util.Random;

public class JogoJokenpo{

    public static void main(String[] args){
        int opcaoUsuario;
        int opcaoComputador;
        int contRodadas=0;

        int nRodadas;
        int[] opcoesUsuario = new int[3];
        int[] opcoesComputador = new int[3];

        int vitoriasUsuario=0;
        int vitoriasComputador=0;

        Scanner teclado = new Scanner(System.in);
        Random rand = new Random(System.currentTimeMillis());

        do{
            System.out.println("Quantas rodadas você deseja? (Deve ser um número impar e >= 3 )");
            nRodadas = teclado.nextInt();
        }while(nRodadas%2==0 || nRodadas<3);
        

        while(contRodadas < nRodadas){
            System.out.println("Escolha uma opção (1-pedra,\n2-papel,\n3-tesoura):");
            opcaoUsuario = teclado.nextInt();
            
            opcoesUsuario[opcaoUsuario-1] += 1;

            opcaoComputador = (rand.nextInt(3))+1;
            opcoesComputador[opcaoComputador-1] += 1;

            if(opcaoUsuario == opcaoComputador){
                System.out.println("Empate...");
            }else if(opcaoUsuario==1 && opcaoComputador==3){
                System.out.println("Usuário ganhou!!");
                vitoriasUsuario += 1;
            }else if(opcaoUsuario==2 && opcaoComputador==1){
                System.out.println("Usuário ganhou!!");
                vitoriasUsuario += 1;
            }else if(opcaoUsuario==3 && opcaoComputador==2){
                System.out.println("Usuário ganhou!!");
                vitoriasUsuario += 1;
            }else{
                System.out.println("Computador ganhou!!");
                vitoriasComputador += 1;
            }

            contRodadas += 1;
        }

        if(vitoriasUsuario == vitoriasComputador){
            System.out.println("Resultado final: Empate");
        }else if(vitoriasUsuario > vitoriasComputador){
            System.out.println("Resultado final: Usuário ganhou!");
        }else{
            System.out.println("Resultado final: Computador ganhou!");
        }

        System.out.println("Relatório de escolhas");
        System.out.println("Usuário:");
        System.out.println("\tPedra:"+opcoesUsuario[0]+" Papel:"+opcoesUsuario[1]+" Tesoura:"+opcoesUsuario[2]);
        System.out.println("Computador:");
        System.out.println("\tPedra:"+opcoesComputador[0]+" Papel:"+opcoesComputador[1]+" Tesoura:"+opcoesComputador[2]);


    }

}