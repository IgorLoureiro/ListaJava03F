//Nome: Igor Loureiro
//RA: 1292316043
//Nome do Programa: Atividade08Lista03
//Data: 19/04/2023
// . Faça um programa que preencha com zeros todas as posições de uma matriz com 10 linha e 10 colunas

public class Atividade09Lista03 {
    public static void main (String [] args) throws Exception{

        int vetor[][];
        int i = 0;
        int i2 = 0;
        vetor = new int [11][11];

        while(i <= 10){

            vetor[i][10] = 0;
            i++;
        }

        while(i2 <= 10){

            vetor[10][i2] = 0;
            i2++;
        }

        System.out.printf(" Vetor [10][10]: %d, Vetor [0][10]: %d, Vetor [10][0]: %d, Vetor [10][10]: %d", vetor[10][10], vetor[0][10], vetor[10][0], vetor[10][10]);
    }
}
