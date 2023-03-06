import java.util.Scanner;

public class entradaDeDados2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2, s3;
        /*
         * quando queremos que o comando scanner leia toda as palavras que o usuário
         * inserir, usamos o comando nextLine(); ou seja, se eu colocar bom dia
         * mostrará bom dia, se for apenas o next e ele reconhecer como string, ficará
         * apenas bom, ele não reconhecerá o dia.
         */
        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();
        System.out.println("DADOS DIGITADOS:");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        sc.close();
    }
}

