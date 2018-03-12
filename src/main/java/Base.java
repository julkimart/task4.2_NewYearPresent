import present.Candy;
import present.Chocolate;
import present.Jellybean;
import present.Present;
import static present.Present.summary;

public class Base {
    public static void main(String[] args) {
        Candy candy1 = new Candy("nameCandy1", 10.00, 20.00, "typeCandy1");
        Chocolate chocolate1 = new Chocolate("nameChocolate1", 11.00, 21.00, "flavourChocolate1");
        Jellybean jellybean1 = new Jellybean();
        jellybean1.setName("nameJellybean1");
        jellybean1.setWeight(12.00);
        jellybean1.setPrice(22.00);
        jellybean1.setBrand("brandJellybean1");

        Present [] box = {candy1, chocolate1, jellybean1};

        for (Present element: box) {
            System.out.println(element.toString());
        }

        double sumWeight = summary(candy1.getWeight(), jellybean1.getWeight(), chocolate1.getWeight());
        System.out.println("\nобщий вес подарка: " + sumWeight); // общий вес подарка

        double sumPrice = summary(candy1.getPrice(), jellybean1.getPrice(), chocolate1.getPrice());
        System.out.println("общая стоимость подарка: " + sumPrice); // общая стоимость подарка

    }

}
