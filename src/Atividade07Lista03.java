//Nome: Igor Loureiro
//RA: 1292316043
//Nome do Programa: Atividade07Lista03
//Data: 19/04/2023
//Escreva um programa que, dada a carga máxima de um elevador e a quantidade máxima de pessoas digitadas pelo usuário, leia o peso de cada pessoa 
//também digitada pelo usuário, que entra peso de cada pessoa, também digitada pelo usuário, que entra no elevador até que a carga máxima seja atingida ou o número
//máximo de pessoas seja atingido (utilize do / while).
import java.util.Scanner;

public class Atividade07Lista03 {
    public static void main (String [] args) throws Exception{

        Integer quantidade, carga, peso, carinf, cardis, quantdis;

        System.out.println("Informe a carga máxima suportada pelo elevador");
        Scanner teclado = new Scanner (System.in);
        carga = teclado.nextInt();
        System.out.println("Informe a quantidade máxima de pessoas suportadas pelo elevador");
        quantidade = teclado.nextInt();
        

        Integer i = 0;
        carinf = 0;
        cardis = 0;
        quantdis = 0;

        do {

            
            System.out.println("Qual o peso do próximo passageiro?");
            peso = teclado.nextInt();
            i++;

            carinf = carinf + peso;

            cardis = carga - carinf;

            quantdis = quantidade - i;

            System.out.printf("O elevador ainda suporta %d kg e %d pessoas \n", cardis, quantdis);
            
        } while(carinf < carga && i < quantidade);

        teclado.close();

        if (i == quantidade){

            System.out.println("A quantidade máxima de pessoas foi atingida");

        } else {

            System.out.println("A carga máxima foi atingida");

        }


    }
}
