public class BonusMilesService {
    public int calculate(int price) {
        // 1 миля за каждые 20 рублей
        int miles = price / 20;
        return miles;
    }
}

