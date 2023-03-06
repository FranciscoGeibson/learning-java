/*Em java quando você quer que o console leia o que vc vai digitar,
 vc tem que declarar o import java.util.Scanner para ele reconhecer 
 o que o usuário irá digitar*/
import java.util.Scanner;
public class entradaDeDados {
    public static void main(String[] args) {
    /*para realizar a entrada de dados após importar, tem que digitar
     * Scanner (o nome que vc quiser) = new Scanner (System.in);
     */
    Scanner sc = new Scanner (System.in);

    String x; // declarei uma variável como String
    /*quando queremos associar a variável (String) ao comando para ser inserido na tela
    usamos a variável = sc.next(); o que dará ao console a opção de ser inserido algo e 
    ficar guardado na variável string.
    */
    x = sc.next(); 
    System.out.println("você digitou: " + x);

         // esse comando serve para fechar
    /*------------------------------------------------------------------------------------------ */
    int a;
    /*mesma coisa que foi feita com o String, porém como é int, após o next vem o int,
     * ficando a = sc.nextInt();
     */
    a = sc.nextInt();
    System.out.println("o valor de int é : " + a);
    /*------------------------------------------------------------------------------------------ */
    double b;
    /*igual aos exemplos anteriores após a ser declarado a variável como double, para ele armazenar o valor
     * digitado e guardar na variável, ficará b = sc.nextDouble();
     */
    b = sc.nextDouble();
    System.out.println("o valor do double é: " + b);
    /*------------------------------------------------------------------------------------------ */
     char c;
     /*quando queremos que ele seja inserido apenas uma letra char, usamos o comando c = sc.next().charAt(o);
      * esse comando será inserido uma letra ou palavra e o chatAt serve para pegar a primeira letra da palavra.
      */
     c = sc.next().charAt(0);
     System.out.println("a letra é: " + c);
     sc.close();
}
}