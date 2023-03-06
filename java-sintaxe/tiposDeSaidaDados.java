/*os comandos de saída em java servem para mostrar na tela mensagens */
public class tiposDeSaidaDados {
    public static void main(String[] args) {
        // usando apenas o comando print, irá apenas mostrar na tela a mensagem.
        System.out.print("exemplo 1 ");
        // usando o comando println, irá mostrar na tela e pular uma linha.
        System.out.println("exemplo 2");
        /* quando queremos mostrar um valor decimal com limite de casas,
         * usamos o comando "%.2f%n"
         * o %n serve como quebra de linha
         * %.2f o número de casas decimais que quero, ou seja duas casas.
        */
        double a = 10.234;
        System.out.printf("%.2f%n", a); // mostrando 2 casas após o ponto.
        //ou
        System.out.printf("%.4f%n", a); // mostrando 4 casa após o ponto.

        /*a concatenação ajuda quando vai juntar o que foi declarado na variável
         * com o que desejamos que seja mostrando na tela
         */
        System.out.println("o resultado obtido foi = " + a + " metros");

        /*usando a concatenação e formatação */
        /*neste caso quando escrevemos o %.2f, automaticamente a variável 
         * na concatecação, irá para esse lugar do %.2f, mostrando apenas o
         * número desejado com as casas após o ponto desejada, ficando assim
         * uma concatenação formatada
         */
        System.out.printf("o resultado = %.2f metros%n", a);
        //-------------------------------------------------------------------//
        /*quando desejamos concatenar vários elementos em um mesmo comando de escrita
         * %f = VARIÁVEIS QUE USAM PONTO FLUTUANTE.
         * %d = VARIÁVEIS QUE USAM NÚMEROS INTEIROS.
         * %s = VARIÁVEIS QUE SERVEM COMO STRING, TEXTOS, CHAR, ETC.
         * %n = AJUDA NA QUEBRA DE LINHA.
         */
        String nome = "Geibson";
        int idade = 20;
        double renda = 1000.000;
        /*OBSERVAÇÃO: QUANDO VAI TER ESSE TIPO DE SAÍDA DE DADOS, USANDO CONCATENAÇÃO COM VÁRIOS ELEMENTTOS,
         * APÓS ESCREVER O TEXTO DESEJADO, AS VARIÁVEIS TEM QUE ESTAREM NA ORDEM CERTA QUE FOI MOSTRADA NO TEXTO.
         */
        System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
    }
}
