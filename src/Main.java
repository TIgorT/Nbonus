public class Main {
    public static void main(String[] args) {
        byte remains = 100; // Остаток у клиентов на счету.
        byte bonusRubles = 1; // Сумма бонусов за 100 руб.
        int replenishment = 1100; // Сумма пополнения счёта второго клиента.
        int balance;
        if (replenishment > 1_000) {
            balance = replenishment / remains * bonusRubles;
        } else {
            balance = 0;
        }
        System.out.println("Клиент пополнил счёт на: " + replenishment);
        System.out.println("Начисленно бонусных рублей клиенту : " + balance);
        System.out.println("Остаток на счёту у клиента : " + (replenishment + remains + balance));
    }
}