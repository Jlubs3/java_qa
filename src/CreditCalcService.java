public class CreditCalcService {
    public double calculate (double S, double R, int M) {
        // Переводим годовую ставку в месячную (в десятичном формате)
        double monthlyRate = R / 12;
        // Рассчитываем аннуитетный платеж по формуле
        double payment = S *
                (monthlyRate * Math.pow(1 + monthlyRate, M)) /
                (Math.pow(1 + monthlyRate, M) - 1);

        return payment;

    }
}
