public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        {   int price = 10_000;
            int miles = service.calculate(price); // должно получиться 500
            System.out.println(miles);
        }
        {
            int price = 5_000; // 250 миль
            int miles = service.calculate(price); // должно получиться 500
            System.out.println(miles);
        }

        {
            int price = 19_999; // 999 миль (19_999 / 20 = 999)
            int miles = service.calculate(price); // должно получиться 500
            System.out.println(miles);
        }
        {
            int price = 19_999; // 999 миль (19_999 / 20 = 999)
            int miles = service.calculate(price); // должно получиться 500
            System.out.println(miles);
        }
        {
            int price = 21; // 1 миля
            int miles = service.calculate(price); // должно получиться 500
            System.out.println(miles);
        }
        {
            int price = 19; // 0 миль
            int miles = service.calculate(price); // должно получиться 500
            System.out.println(miles);
        }
    }
}

