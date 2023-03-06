public class exercicioSaida {
    public static void main(String[] args) {
        String product1 = "computer";
        String product2 = "office desk";
        
        int age = 30;
        int code = 5290;
        char gender = 'f';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measura = 53.234567;

        System.out.println("productos:");
        System.out.printf("%s, which price is $%.2f%n%s, which price is $%.2f %n", product1, price1, product2, price2);

        System.out.printf("record: %d years old, code %d and gender %s%n", age, code, gender);

        System.out.printf("measure with eight decimal places: %.8f%n", measura);
        System.out.printf("rouded (three decimal places): %.3f%n", measura);
        System.out.printf("US decimal point: %.3f%n", measura);
}
    }
