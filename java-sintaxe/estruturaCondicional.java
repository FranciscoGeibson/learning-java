    /*QUANDO VAMOS COMPARAR AS COISAS, QUANDO EXISTE UMA CONDIÇÃO
     * USAMOS OS COMANDOS:
     * > = MAIOR
     * < = MENOR
     * >= = MAIOR OU IGUAL
     * <= = MENOR OU IGUAL
     * == = IGUAL
     * != = DIFERENTE
     * ------------------------------------------------------------
     * QUANDO QUEREMOS USAR POR MEIO DE EXPRESSÕES LÓGICAS, VERDADEIRO OU FALSO
     * USAMOS OS COMANDOS:
     * && = E
     * || = OU
     * !  = NÃO
     * PODEMOS TAMBÉM USAR A TABELA VERDADE
     * A-B  | A && B
     * -----------------
     * F F      F      |
     * F V      F      |
     * V F      F      |
     * V V      V      |
     * -----------------
     * A-B  | A || B
     * -----------------
     * F F      F      |
     * F V      V      |
     * V F      V      |
     * V V      V      |
     *------------------
     * A|   !A    
     * ------------
     * F    V     |
     * V    F     |
     */
public class estruturaCondicional {
    public static void main(String[] args) {
        int idade = 17;
        boolean maior = idade > 18;
        boolean menor = idade < 18;
        boolean quasela = idade == 18;

        System.out.println(maior);
        System.out.println(menor);
        System.out.println(quasela);
        /*----------------------------------------------------------- */
        String nome = "Geibson";
        String senha = "12345";
        /*o usuário digitou na tela de login */
        String nomeDigitado = "Francisco";
        String senhaDigitada = "12364";

        boolean loginCorreto = nomeDigitado == nome && senhaDigitada == senha;

        System.out.println(loginCorreto);

    }
}
