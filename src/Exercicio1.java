public class Exercicio1 {
    public static void main(String[] args) {
        parOuImpar(-5);
        parOuImpar(10);
        parOuImpar(0);
        parOuImpar(7);
    }

    static void parOuImpar(int numero) {
        String parImpar = (numero % 2 == 0) ? "par" : "ímpar";

        String positivoNegativo = (numero > 0) ? "positivo" : (numero < 0) ? "negativo" : "zero";

        System.out.println(numero + " é " + parImpar + " e " + positivoNegativo + ".");
    }
}

