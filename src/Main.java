public class Main {
    public static void main(String[] args) {

        int initialBalance = 100;   // начальный счёт
        int deposit = 1100;         // сумма пополнения

        int bonus;
        int finalBalance;

        System.out.println("Сценарий 1: пополнение больше 1000 рублей");

        if (deposit > 1000) {
            bonus = deposit / 100;
            finalBalance = initialBalance + deposit + bonus;

            System.out.println("Пополнение: " + deposit);
            System.out.println("Бонус: " + bonus);
            System.out.println("Итоговый счёт: " + finalBalance);
        }

        System.out.println();
        System.out.println("Сценарий 2: пополнение 1000 рублей или меньше");

        int deposit1 = 600;

        if (deposit1 <= 1000) {
            bonus = 0;
            finalBalance = initialBalance + deposit1;

            System.out.println("Пополнение: " + deposit1);
            System.out.println("Бонус: " + bonus);
            System.out.println("Итоговый счёт: " + finalBalance);
        } else {
            System.out.println("Пополнение больше 1000, бонус был бы начислен (но в этом сценарии считаем, что ≤ 1000).");
        }
    }
}

