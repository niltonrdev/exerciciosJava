public class Exercicio5 {
    public static void main(String[] args) {
        
        String[] array1 = {"Morango", "Banana", "Maçã", "Uva", "Caqui"};
        String[] array2 = {"Manga", "Caqui", "Morango", "Amora"};

        encontrarElementosComuns(array1, array2);
    }

    static void encontrarElementosComuns(String[] array1, String[] array2) {
        System.out.println("Elementos comuns:");

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    System.out.println(array1[i]);
                    break; 
                }    
            }
        }
    }
}
