public class ExemploBreakContinue {
    // class ExemploBreakContinue.java
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3)
                break;
            System.out.println(numero);
        }
        // Qual a saída no console ?
    }
}

// public class ExemploBreakContinue {
//     // class ExemploBreakContinue.java
//     public static void main(String[] args) {
//         for (int numero = 1; numero <= 5; numero++) {
//             if (numero == 3)
//                 continue;
//             System.out.println(numero);
//         }
//         // Qual a saída no console ?
//     }
// }