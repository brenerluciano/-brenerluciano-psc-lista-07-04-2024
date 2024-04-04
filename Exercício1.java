import java.util.Scanner;
public class Exercício1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeros [] = {30,10,32,45,34};
    
        for (int i = 0; i < numeros.length; i++){
        System.out.print(numeros[i] + " ");
        
        }
        scanner.close();
    }
}
