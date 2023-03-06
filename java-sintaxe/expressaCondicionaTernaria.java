/*expressão condicional ternária é quando temos uma estrutura opcional if-else,
 * quando se deseja decidir um valor com base em uma condição
 * sintaxe:
 * (condição) ? valor_se_verdadeiro : valor_se_falso
 */
import java.util.Scanner;
 public class expressaCondicionaTernaria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double preco;
        preco = sc.nextDouble();
        /*serve para subistituir o if else, ou seja, se o valor da variável preco for menor que 20
        o preco será multiplicado por 0.1, caso seja maior, será multiplicado por 0.05 */ 
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.println(desconto);
        sc.close();
    }
}
