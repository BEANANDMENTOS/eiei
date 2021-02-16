//student_name: ภูริน  โถทอง
//student_id: 6209650222

package No2;

public class PokemonTest {
    public static void main(String[] args) {
    Pokemon p1 = new Pokemon();
    Pokemon p2 = new Pokemon();
    Pokemon p3 = new Pokemon();
    Pokemon p4 = new Pokemon();
    Pokemon p5 = new Pokemon();

    p1.setName("Zapdos");
    p1.setType("Electric");
    p1.setCategory("Electric");
    p1.setWeight(116.0);

    p2.setName("Darmanitan");
    p2.setType("Fire");
    p2.setCategory("Blazing");
    p2.setWeight(204.8);

    p3.setName("Cyndaquil");
    p3.setType("Fire");
    p3.setCategory("Fire Mouse");
    p3.setWeight(17.4);

    p4.setName("Pikachu");
    p4.setType("Electric");
    p4.setCategory("Mouse");
    p4.setWeight(13.2);

    p5.setName("Zapdos");
    p5.setType("Groud");
    p5.setCategory("Lonely");
    p5.setWeight(14.3);

    System.out.printf("Pokemon: %5s  Category: %s\nType: %s  Weight: %.1f\n" ,p1.getName(),p1.getCategory(),p1.getType(),p1.getWeight());
    System.out.println();
    System.out.printf("Pokemon: %5s  Category: %s\nType: %s  Weight: %.1f\n" ,p2.getName(),p2.getCategory(),p2.getType(),p2.getWeight());
    System.out.println();
    System.out.printf("Pokemon: %5s  Category: %s\nType: %s  Weight: %.1f\n" ,p3.getName(),p3.getCategory(),p3.getType(),p3.getWeight());
    System.out.println();
    System.out.printf("Pokemon: %5s  Category: %s\nType: %s  Weight: %.1f\n" ,p4.getName(),p4.getCategory(),p4.getType(),p4.getWeight());
    System.out.println();
    System.out.printf("Pokemon: %5s  Category: %s\nType: %s  Weight: %.1f\n" ,p5.getName(),p5.getCategory(),p5.getType(),p5.getWeight());
    }
}
