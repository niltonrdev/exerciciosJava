
public class Exercicio2 {
    public static void main(String[] args) {
        int tamanho = 10; 

        System.out.println("Sequência de Fibonacci de tamanho " + tamanho + ":");
        imprimirFibonacci(tamanho);
    }

    static void imprimirFibonacci(int tamanho) {
        int primeiroTermo = 0, segundoTermo = 1;

        for (int i = 0; i < tamanho; i++) {
            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
    }
}
