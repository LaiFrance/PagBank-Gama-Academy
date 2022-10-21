
import java.util.Scanner;

public class inverteNum {
    public static void main(String  args[]) {
        Scanner teclado = new Scanner(System.in);
        int numeroOriginal, c, d, u, resto;
        int novoNumero;
        // ENTRADA DE DADOS
        System.out.println("Digite um numero inteiro de 3 digitos");
        numeroOriginal = teclado.nextInt();
        // PROCESSAMENTO
        c = numeroOriginal / 100; // ex: 234 / 100 = 2 , portanto C = 2
        resto = numeroOriginal % 100; // ex: 234 % 100 = 34,portanto RESTO=34
        d = resto / 10; // ex: 34 / 10 3, ortanto D = 3
        u = resto % 10; // ex: 34 % 10 = 4, portanto U = 4;
        novoNumero = u * 100 + d * 10 + c;
        System.out.println("O Novo numero vale  ="+novoNumero);
        teclado.close();
    }
    
}
