import java.util.Scanner;

public class Atividade05Lista03 {
    public static void main (String [] args) throws Exception{

        int numero;
        int fatorial = 1;
        int i;

        System.out.println("Digite um numero para receber seu fatorial");
        Scanner teclado = new Scanner (System.in);
        numero = teclado.nextInt();
        teclado.close();

        for(i = 1; i <= numero; i++){
            fatorial = fatorial*i;

        }

        System.out.printf("o fatorial do Numero informado é de %d", fatorial);
    }

}
