//Nome: Igor Loureiro
//RA: 1292316043
//Nome do Programa: Atividade08Lista03
//Data: 19/04/2023
// Faça um programa que preencha com zeros todas as posições de um vetor de tamanho 50 
public class Atividade08Lista03 {
    public static void main (String [] args) throws Exception{

        int vetor[];
        int i = 0;
        vetor = new int [51];

        while(i <= 50){

            vetor[i] = 0;
            i++;
        }
        
        System.out.printf("o Vetor inicial é %d e o vetor final é %d", vetor[0], vetor[50]);

    }
}
