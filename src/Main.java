public class Main {
    public static void main(String[] args) {

        // начальный счёт
        int startBalance = 100;
        int deposit = 2000; // сумма пополнения
        int bonus = 0;  // бонусы по умолчанию


        if (deposit > 1000) {
            bonus = deposit / 100;    // 1 рубль за каждые полные 100 рублей
        }


        int finalBalance = startBalance + deposit + bonus;

        System.out.println("Бонус: " + bonus + " руб.");
        System.out.println("Итоговый счёт: " + finalBalance + " руб.");
    }
}
