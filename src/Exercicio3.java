public class Exercicio3 {
    public static void main(String[] args) {
        int numero = 5; 

        System.out.println("Tabela de multiplicação por " + numero);

        imprimirTabelaMultiplicacao(numero);
    }

    static void imprimirTabelaMultiplicacao(int numero) {
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
