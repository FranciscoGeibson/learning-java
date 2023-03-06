/*O uso da estrutura condicional simples if 
Simples
quando verificamos se o que está dentro dos parenteses for verdadeiro, acontecerá que mostrará o que foi
escrito no comando1 ou seja
V = executa o bloco de comandos
F = pula o bloco de comandos 
if ( <condição> ) { 
     <comando1>
     <comando2>
}------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
Quando usamos o if e else juntos, o que acontecer no if e for falso, irá para o else como verdadeiro
quando o if seja verdadeiro o else não é executado
ou seja
if ( <condição> ) { 
     <comando1>
     <comando2>
} else {
    <comando3>
    <comando4>
}
Caso eu deseje realizar mais de 2 estruturas condicionais, usamos o formato de encadeamento
ou seja
if ( <condição> ) { 
     <comando1>
     <comando2>
} else {
    if( condição 2){
        <comando3>
        <comando4>
    } else {
        <comando5>
        <comando6>
    }
}
*/
import java.util.Scanner;
public class estruturaIfAndElse {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int idade;

    System.out.println("qual a sua idade? ");
    idade = sc.nextInt();
    if(idade < 18){
        System.out.println("você eh de menor, só entra apenas com 18");
    }else{
        if(idade == 18){
            System.out.println("você pode ir, pois tem 18");
        }else{
            System.out.println("vc é idoso, aceite");
        }
    } sc.close();
}
}
