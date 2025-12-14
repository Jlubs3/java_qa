//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BodyMaxIndexService service = new BodyMaxIndexService();

        System.out.println ("Рост, вес "+ "1.7/56");
        System.out.println("Индекс массы тела"+ service.index(1.7,56));
        System.out.println();

        System.out.println ("Рост, вес "+ "1.65/59");
        System.out.println("Индекс массы тела "+ service.index(1.65,59));
        }
    }

