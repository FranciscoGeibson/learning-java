/* Estrutura repetitiva for "para": é uma estrtura de controle que repete um bloco de comandos
 * para um certo intervalo de valores.
 * Quando devo usar?
 * quando se sabe previamente a quantidade de repetições, ou o intervalo de valores.
 * Sintaxe/regra.
 * for ( início; condição; incremento){
 *          comando1
 *          comando2
 * }
 * início = executa somente na primeira vez
 * condição = v : executa e volta, f : pula fora
 * incremento = executa toda vez depois de voltar
 */


import java.util.Scanner;
public class estruturaFor {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); /*declaro uma variável com comando de entrada.
        APÓS LER OS COMANDOS, LEIA AQUI
        ------------------------------------------------------ NELA AQUI IREI DECLARA COMO
        O VALOR 3, PARA APÓS O FOR REPETIR O PROCESSOR 3 VEZES, ELE PARAR E MOSTRAR A SOMA 
        ---------------------------------------------------------------------------------*/

        int soma = 0; // declaro a variável soma valendo 0.
        /*o que acontece no for é que eu declaro uma variável como inteira igual a 0
         * depois eu digo que para o for ficar fazendo a repetiçãO, o valor de i tem que ser menor
         * que o de n, após isso quando a repetição acontece, vai ocorrer um incremento, uma adição de
         * mais 1 no valor de i.
         */
        for(int i = 0; i < n; i++){
            /*no momento que a variável i é criada, o valor dela é declarado como 0
             * e vai para o passo da <condição> onde o i ser menor que 0 faz com que o programa funcione 
             * novamente.
             * --------------------------
             */
            /*no momento que eu digito um valor para variável x, vai ocorrer a soma, ou seja, ficar somando
             * os valores que foram digitados na váriavelm armazenados em soma.
             * --------------------------
             * ATENÇÃO: APÓS ISSO VEM A PARTE DO INCREMENTO, TUDO QUE EU FIZ ESSE PASSO 1 VEZ
             * A VARIÁVEL DO I QUE ERA 0, IRÁ VALER AGORA 1, APÓS REALIZAR TODOS OS PROCEDIMENTOS QUE FORAM 
             * DIGITADOS ACIMA, ELA IRÁ VALER 2, DEPOIS 3, E APÓS ISSO O PROGRAMA IRÁ TERMINAR.
             */
            int x = sc.nextInt();
            soma = soma + x;
        
    }
        System.out.println(soma);
        sc.close();
}
}