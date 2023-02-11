package edu.gabriel.anatomiaclasses;
// /*Aula 1 */
// /*Classe Inicio*/
// public class MinhaClasse {

//     /* Método Inicio */
//     public static void main(String[] args) {
//         System.out.print("Hello World");
//     }
//     /* Metodo Fim */
// }
// /* Classe Fim */

/*Aula 2 */

public class MinhaClasse {

public static void main(String[] args) {

    String primeiroNome = "Gabriel";
    String segundoNome = "Martins";
    String nomeCompleto = nomeCompleto (primeiroNome,segundoNome);
    System.out.println(nomeCompleto);
    } 
public static String nomeCompleto(String primeiroNome, String segundoNome) {
    return primeiroNome.concat(" ").concat(segundoNome);
}

}