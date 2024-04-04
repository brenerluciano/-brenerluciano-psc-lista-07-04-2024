import java.util.Scanner;

public class Exercício6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numAlunos = 10;
        double medias[] = new double[numAlunos];
        int contador = 0;

        System.out.println("Insira as 4 notas de todas aulnos.");
        for(int i = 0; i < numAlunos; i++){
            System.out.println("Aluno " + (i + 1) + ": ");
            double somadasnotas = 0;
          for(int j = 0; j < 4; j++){
            System.out.print("Digite a nota " + (j + 1) + ": ");
            double nota = scanner.nextDouble();
            somadasnotas += nota;
          }
          medias[i] = somadasnotas / 4; 
          
          if (medias[i] >= 7.0){
            contador++;

          }
        }
        System.out.println("Número de alunos com média maior ou igual a 7.0: " + contador);
       scanner.close();
    }
}