/*A Estrutura repetitiva "faça-enquanto" é menos utilizada, mas em alguns casos, se encaixa
 * melhor ao problema.
 * 
 * o bloco de comandos executa pelo menos uma vez, pois a condição é verificada no final.
 * Sintaxe/regra:
 * do{
 *     comando1
 *     comando2   
 * } while(condição);
 *
 * regra:
 * v = volta
 * f : pula fora
 */

import java.util.Scanner;
public class estruturaDoWhile {
    public static void main (String[] args){

    Scanner sc = new Scanner (System.in);
    char resp;
    
    do{
        System.out.print("Digite a temperatura em celsius: ");
        double C = sc.nextDouble();
        double F = 9.0 * C / 5.0 + 32.0;
        System.out.printf("Equivalente em fahrenheit: %.1f%n", F);
        System.out.print("Deseja repetir ( s/ n )? ");
        resp = sc.next().charAt(0);
    } while(resp != 'n');
        sc.close();

}

}