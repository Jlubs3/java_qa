//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Стоимость билета
        int ticketPrice = 13676;
        // Количество рублей, необходимых для одной бонусной мили
        int rublesPerMile = 20;
        // Расчёт количества бонусных миль (дробная часть отбрасывается автоматически при делении int)
        int bonusMiles = ticketPrice / rublesPerMile;

        // Вывод результата
        System.out.println("Начисленные мили: " + bonusMiles);

        }
    }
