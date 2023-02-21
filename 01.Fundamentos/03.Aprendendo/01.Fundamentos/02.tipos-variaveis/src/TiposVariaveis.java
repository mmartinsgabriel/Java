public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        /*Exemplo Variáveis */
        double salarioMinimo = 2500;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        /*Exemplo Constante */

        final double VALOR_DE_PI = 3.14;

        VALOR_DE_PI = 10.75;

        /*Constantes devem ter sempre "final" escrito no inicio e o nome da constante sem em maiusculo */
    }
}
/*TABELA DE VARIÁVEIS */

/* FAMILIA  -  TIPO PRIMITIVO - WRAPPER CLASS
 * LÓGICO   -     boolean     -     Boolean  
 * LITERAIS -       char      -    Character 
 *          -      string     -     String   
 * INTEIROS -       byte      -      Byte    
 *          -      short      -      Short   
 *          -       int       -     Interger 
 *          -      long       -      Long    
 * REAIS    -      float      -      Float   
 *          -      double     -      Double  
*/