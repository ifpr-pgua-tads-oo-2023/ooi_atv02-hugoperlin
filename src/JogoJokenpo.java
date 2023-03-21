import java.util.Scanner;
import java.util.Random;

public class JogoJokenpo{

    public static void main(String[] args){
        int opcaoUsuario;
        int opcaoComputador;
        int jogarNovamente=1;
        Scanner teclado = new Scanner(System.in);
        Random rand = new Random();

        while(jogarNovamente==1){
            System.out.println("Escolha uma opção (1-pedra,\n2-papel,\n3-tesoura):");
            opcaoUsuario = teclado.nextInt();
            
            opcaoComputador = (rand.nextInt(3))+1;

            if(opcaoUsuario == opcaoComputador){
                System.out.println("Empate...");
            }else if(opcaoUsuario==1 && opcaoComputador==3){
                System.out.println("Usuário ganhou!!");
            }else if(opcaoUsuario==2 && opcaoComputador==1){
                System.out.println("Usuário ganhou!!");
            }else if(opcaoUsuario==3 && opcaoComputador==2){
                System.out.println("Usuário ganhou!!");
            }else{
                System.out.println("Computador ganhou!!");
            }

            System.out.println("Deseja jogar novamente? (1-sim;0-não)");
            jogarNovamente = teclado.nextInt();
        }
    }

}