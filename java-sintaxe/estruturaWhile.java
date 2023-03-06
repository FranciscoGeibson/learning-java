/*O uso da estrutura repetitiva "enquanto" acontece qunado repete um bloco de comandos
 *enquanto ma condição for verdadeira
 Quando usar?
 quando não se sabe previamente a quantidade de repetições que será realizada.
 sintaxe:
 while(condição){    
    comando1         
    comando2         
 }
    regra: se a condição for:
    V: executa e volta
    F: pula fora
 */
/*O programa a seguir pede que digite uma quantidade x de números, quando um número for igual a 0,
 * o código irá fazer soma de todos os números digitados, ou seja o 0 será o que irá pausar a soma e 
 * realizar ela.
 */
 import java.util.Scanner;
public class estruturaWhile{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt(); // declaro uma variável como comando de entrada.


        /*declaro outra variável como um número neutro que é o zero,
        SE LEMBRE QUE SEMPRE QUE DECLARA UMA VARIÁVEL, TEMOS QUE ASSOCIAR UM VALOR
        A VARIÁVEL, POR ISSO O ASSOCIEI COMO 0 POIS É O NÚMERO NEUTRO.
        */
        int soma = 0; 

        /*o while é como se fosse um if que quando o valor da condição for verdadeiro, ele retornará,
         * assim ficando um loop,
         * nesse caso, minha condição fica com a variável x (comando de entrada), sendo digitado
         * até o valor ser igual a 0, se o valor for igual a 0, a repetição para.
         */
        while(x != 0){ 

            /*nesse caso puxo a variável soma e digo que ela própria irá somar com os valores
             * dos números declarados na variável x, fazendo assim a soma de todos eles, até que o
             * número digitado seja igual a 0.
             */
           soma = soma + x;
            /*ATENÇÃO, ESSE COMANDO SERVE PARA NO MOMENTO QUE OS NÚMEROS QUE FOR DIGITADO SER DIFERENTE DE 0
             * ELE FICAR REPETINDO EM UM LOOP
             */
            x = sc.nextInt();
        }
        System.out.println(soma);

        sc.close();
    }
}