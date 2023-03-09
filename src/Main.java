public class Main {
    public static void main(String[] args) {
        byte x = 100; // Остаток у клиентов на счету.
        byte i = 1; // Сумма бонусов за 100 руб.
        short y = 300; // Сумма пополнения счёта первого клиента.
        int c = 1100; // Сумма пополнения счёта второго клиента.
        int k;
        if (y > 1_000) {
            k = y / x * i;
        } else {
            k = 0;
        }
        int n;
        if (c > 1_000) {
            n = c / x * i;
        } else {
            n = 0;
        }
        System.out.println("Клиент № 1 пополнил счёт на: " + y);
        System.out.println("Начисленно бонусных рублей клиенту № 1: " + k);
        System.out.println("Остаток на счёту у клиента № 1: " + (y + x + k));
        System.out.println("Клиент № 2 пополнил счёт на: " + c);
        System.out.println("Начисленно бонусных рублей клиенту № 2: " + n);
        System.out.println("Остаток на счёту у клиента № 2: " + (c + x + n));
    }
}