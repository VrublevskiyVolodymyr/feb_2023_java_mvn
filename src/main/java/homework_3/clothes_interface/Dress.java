package homework_3.clothes_interface;

public class Dress extends Clothes implements WomansСlothes {

    public Dress() {
    }

    public Dress(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Dressing a woman in a" + this.getClass().getSimpleName());
    }

}
