/*Formatar: toLowerCase(), toUpperCase(). trim()
 *Recortar: substring(inicio), substring(inicio. fim)
 *Substituir: Replace(char, char). Replace(string, string)
 *Buscar: indexOf, LastIndexOf
 *str.Split(" ").
 */

public class funcoesStrings{
    public static void main(String[] args){
        String original = "abcde FGHIJ ABC abc DEFG";

        /*Comando para deixar toda a string com letra minúscula */
        String s01 = original.toLowerCase();
        /*Comando para deixar toda a string com letra maiúscula */
        String s02 = original.toUpperCase();
        /*elimina os espaços em brancos que ficam sobrando */
        String s03 = original.trim();
        /*pega o caractere determinado e mostra na tela o resultado dele em diante*/
        String s04 = original.substring(2);
        /*mostra onde deve começar a imprimir na tela e onde deve terminar, nos caracteres */
        String s05 = original.substring(2,9);
        /*sempre que encontrar determinado caractere, trocar ele pelo o outro desejado */
        String s06 = original.replace('a', 'x');
        /*sempre que encontrar determinado caractere, trocar ele pelo o outro desejado em substring */
        String s07 = original.replace("abc", "xy");
        /*mostra qual o lugar, posição está o caractere, assim dizendo que a variável terá o valor
         * associado a posição*/
        int i = original.indexOf("bc");
        /*mesma coisa, mostrando a ultima ocorrencia do bc */
        int j = original.lastIndexOf("bc");



        System.out.println("original: - " + original + "-");
        System.out.println("toLowerCase: -" + s01 + "-");
        System.out.println("toUpperCase: -" + s02 + "-");
        System.out.println("trim: -" + s03 + "-");
        System.out.println("substring(2): -" + s04 + "-");
        System.out.println("substring(2,9): -" + s05 + "-");
        System.out.println("replace('a', 'x'): -" + s06 + "-");
        System.out.println("replace('abc', 'x'): -" + s07 + "-");
        System.out.println("Index of 'bc: " + i);
        System.out.println("Last index of 'bc: " + j);

/*-------------------------------------------------------------------------- */
        String s = "potato apple lemon orange";
        /*o comando split faz cortar as palavras e separar elas em vetores */
        String[] vect = s.split(" ");
        System.out.println(vect[0]);
        System.out.println(vect[1]);
        System.out.println(vect[2]);
        System.out.println(vect[3]);

    }
}