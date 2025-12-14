//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        CreditCalcService calculator = new CreditCalcService();

        // Пример 1: Кредит 1 000 000 рублей на 1 год под 9.99%
        double payment1 = calculator.calculate(1_000_000, 0.0999, 12);
        System.out.println("Кредит 1 000 000 руб. на 1 год под 9.99%:");
        System.out.println("Ежемесячный платеж: " + Math.round(payment1) + " руб.");
        System.out.println();

        // Пример 2: Кредит 1 000 000 рублей на 2 года под 9.99%
        double payment2 = calculator.calculate(1_000_000, 0.0999, 24);
        System.out.println("Кредит 1 000 000 руб. на 2 года под 9.99%:");
        System.out.println("Ежемесячный платеж: " + Math.round(payment2) + " руб.");
        System.out.println();

        // Пример 3: Кредит 1 000 000 рублей на 3 года под 9.99%
        double payment3 = calculator.calculate(1_000_000, 0.0999, 36);
        System.out.println("Кредит 1 000 000 руб. на 3 года под 9.99%:");
        System.out.println("Ежемесячный платеж: " + Math.round(payment3) + " руб.");
        }
    }
