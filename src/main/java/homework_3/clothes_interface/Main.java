package homework_3.clothes_interface;

public class Main {
    public static void main(String[] args) {

        Atelier atelier1 = new Atelier();

        atelier1.addClothes(new Tshirt(Size.XXS, 100, "red"));
        atelier1.addClothes(new Pants(Size.L, 200, "green"));
        atelier1.addClothes(new Tie(Size.M, 50, "green"));
        atelier1.addClothes(new Dress(Size.XXS, 600, "red"));

        System.out.println(atelier1.getManClothes());
        System.out.println("*******************");
        System.out.println(atelier1.getWomanClothes());

    }
}
