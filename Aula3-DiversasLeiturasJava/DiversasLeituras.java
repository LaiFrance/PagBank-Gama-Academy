
import java.util.Scanner;

public class DiversasLeituras {
    public static void main (String args[]){
        
            Scanner teclado = new Scanner(System.in);
            int codigo;
            double preco;
            String nome;
            System.out.print("Digite o codigo: ");
            codigo = teclado.nextInt();
            System.out.print("Digite o nome : ");
            nome = teclado.nextLine();
            System.out.print("Digite o preco : ");
            preco = teclado.nextDouble();
            System.out.println("Voce digitou os valores " + codigo + " " + nome + " " + preco);
            teclado.close();
    }
    // string para double -> Double.parseDouble(string) 
    // string para int -> Integer.parseInt(string)
    // string para float -> Float.parseFloat(string)
    // int, double, float para string -> String.valueOf(int, double, float)
}
