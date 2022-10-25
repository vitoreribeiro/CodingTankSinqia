import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int tamanho = getNumber(sc);
        int[][] tabuleiro = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++){
            for (int j = 0; j < tamanho; j++) {
                tabuleiro[i][j] = getNumber(sc);
            }
        }

        for (int[] linha : tabuleiro){
            for (int elemento : linha){
                System.out.print(elemento + " ");
            }
            System.out.print("\n");
        }

        //double media = calculaMedia(tabuleiro);
        //System.out.println("A media dos " + tamanho + " valores é " + media);

    }

    static int soma(int a, int b) {
        return a + b;
    }

    private static double calculaMedia(int[] valores){
        double soma = 0;
        for (int valor : valores) {
     soma += valor;
        }
        //      for (int i = 0; i < valores.length; i++) {
        //         soma += valores[i];
        //       }
        return soma/valores.length;
    }
    static int getNumber(Scanner input){
        try{
            System.out.println("Digite o valor desejado:");
            return input.nextInt();

            }
        catch(InputMismatchException e){
            System.out.println("O tipo digitado está incorreto. Tente novamente.");
            input.nextLine();
            return getNumber(input);
        } catch(Exception e){
            System.out.println("Não foi possível obter o número. Digite novamente");
            input.nextLine();
            return getNumber(input);
        }
    }
}







