import java.util.Scanner;

public class Exercício2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int tamanho = 10;
        double reais[] = new double[tamanho];

        System.out.println("Digite os " + tamanho + " números reias: ");
        for(int i = 0; i < tamanho; i++){
            reais[i] = scanner.nextDouble();
        }
        System.out.println("Os números na ordem inversa são: ");
        for (int i = tamanho - 1; i >=0; i--){
            System.out.println(reais[i]);

        }
        scanner.close();
        }
        
    }

