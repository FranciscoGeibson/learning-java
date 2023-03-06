/*programa onde será digitado 3 valores e ele mostrará qual é o maior, utilizando funções */
/*Função ou método em java é um pedaço de código organizado e reutilizável que é usado para
 * executar uma única ação relacionada;
 * as funções proporcionam uma melhor modularidade e um alto grau de reutilização de código;
 * não é possível criar uma função dentro de uma outra função;
 */
import java.util.Scanner;
public class funcoesSintaxeJava {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        /*aqui dentro dessa função, solicito 3 números para ser digitado */
        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /*aqui crio uma variável destacando os 3 outros valores que digitarei no código */
        int higher = max(a, b, c);

        /*peço para ele mostrar o resultado da várivel higher no que foi declarado atrás */ 
        showResult(higher);

        sc.close();
    }
    /*para o código acima funcionar, criei essas funções onde vou dizer o que ela será
     * necessário para reconhecer meu código em cima
      */
    public static int max(int a, int b, int c) {
        /*crio então a lógica que irá ser de acordo com o meu programa, reconhecer
         * qual dos números é o maior
         */
        /*crio uma variável como int para relacionar ela aos comandos estruturais e 
         * no final chamar ela
         */
         int aux;

         /*caso o x seja maior que o y e maior que o y */
        if (a > b && a > c){
            aux = a;
        }
        else if (b > c){
            aux = b;
        }
        else {
            aux = c;
        }
        return aux;
    }
    /*crio outra função onde será para o comando showResult, onde associo ela e puxo
     * o resultado de saber qual é o número maior ao comando int1
    */
    public static void  showResult(int valor){
        System.out.println("higher = " + valor);
    }
}
