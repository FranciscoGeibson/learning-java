/*os tipos primitivos de variáveis, são as formas possíveis de armazenar os conteúdos desejados na memória */

public class tiposPrimitivos{
    public static void main (String[] args){
        //tipos primitivos
        //inteiros = int
        byte numeroPequeno = 5; // 8 bits = podendo ir de -128 a 127.
        short  numeroMenor = 2000; //16 bits = podendo ir de -32768 a 32767.
        int  numeroMaior = 2000000; // 32 bits = podendo ir de -2147483648 a 2147483647.
        long numeroEnorme = 2000000000; // 64 bits = podendo ir de -9223372036854770000 a 9223372036854770000.

        //flutuantes
        float peso = 69.9f; // 32 bits = podendo ir de -1,4024E-37 a 3,4028E+38, aqui tem que colocar a letra >> F.
        double pi = 3.141592653; // 64 bits = podendo ir de -4,94E-307 a 1,79E+308.
        
        //chat = caracteres qualquer do teclado
        char letra = 'a'; // 16 bits = podendo ir de '\u0000' a '\uFFFF'.

        //String
        String nome = "Geibson";

        //booleana = verdadeiro ou falso
        boolean queroJogar = true; // 1 bit = podendo ser apenas true or false.

       // variável do tipo longas 
       System.out.println(numeroPequeno);
       System.out.println(numeroMenor);
       System.out.println(numeroMaior);
       System.out.println(numeroEnorme);

       // variável do tipo ponto flutuante
       System.out.println(peso);
       System.out.println(pi);

       //variável do tipo caractere
       System.out.println(letra);

       //variável do tipo booleana
       System.out.println(queroJogar);
       
       //variável do tipo String
       System.out.println(nome);
    }

}