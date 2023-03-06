import java.util.Scanner;
public class exerciciosWhile {
    public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("por favor, digite a senha válida: ");
            int senha = sc.nextInt();

          

            while(senha == 2002){
                System.out.println("senha correta:");
                senha = sc.nextInt();
            }
                System.out.println("senha negada: ");
                sc.close();
    }   
    
}


