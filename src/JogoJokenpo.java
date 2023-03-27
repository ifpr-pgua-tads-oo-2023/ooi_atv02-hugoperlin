import java.util.Scanner;
import java.util.Random;

public class JogoJokenpo{

    public static void main(String[] args){
        int opcaoUsuario;
        int opcaoComputador;
        int contRodadas=0;

        int nRodadas;
        int qtdePedraUsuario=0, qtdePedraComputador=0;
        int qtdePapelUsuario=0, qtdePapelComputador=0;
        int qtdeTesouraUsuario=0, qtdeTesouraComputador=0;
        
        int vitoriasUsuario=0;
        int vitoriasComputador=0;

        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();

        do{
            System.out.println("Quantas rodadas você deseja? (Deve ser um número impar e >= 3 )");
            nRodadas = teclado.nextInt();
        }while(nRodadas%2==0 && nRodadas<3);
        

        while(contRodadas < nRodadas){
            System.out.println("Escolha uma opção (1-pedra,\n2-papel,\n3-tesoura):");
            opcaoUsuario = teclado.nextInt();
            
            switch(opcaoUsuario){
                case 1: 
                    qtdePedraUsuario += 1;
                    break;
                case 2:
                    qtdePapelUsuario += 1;
                    break;
                case 3:
                    qtdeTesouraUsuario += 1;
                break;
            };

            opcaoComputador = (rand.nextInt(3))+1;
            switch(opcaoComputador){
                case 1: 
                    qtdePedraComputador += 1;
                    break;
                case 2:
                    qtdePapelComputador += 1;
                    break;
                case 3:
                    qtdeTesouraComputador += 1;
                break;
            };

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

            nRodadas += 1;
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
        System.out.println("\tPedra:"+qtdePedraUsuario+" Papel:"+qtdePapelUsuario+" Tesoura:"+qtdeTesouraUsuario);
        System.out.println("Computador:");
        System.out.println("\tPedra:"+qtdePedraComputador+" Papel:"+qtdePapelComputador+" Tesoura:"+qtdeTesouraComputador);


    }

}