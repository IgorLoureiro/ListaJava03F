import java.util.Scanner;

public class Atividade04Lista03 {
    public static void main (String [] args) throws Exception{

        int numero;
        System.out.println("Digite um numero menor que zero");
        Scanner teclado = new Scanner (System.in);
        numero = teclado.nextInt();

        while (numero >= 0){

            System.out.print("O numero digitado não é menor que zero, por favor, digite um numero menor que zero \n");
            numero = teclado.nextInt();

        }
        
        teclado.close();

        if (numero < 0){

            System.out.print("O numero digitado é menor que zero");

        }

    }
}
