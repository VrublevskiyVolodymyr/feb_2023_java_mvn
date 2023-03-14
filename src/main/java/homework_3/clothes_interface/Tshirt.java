package homework_3.clothes_interface;

public class Tshirt extends Clothes implements MansСlothes, WomansСlothes {

    @Override
    public void dressMan() {
        System.out.println("Dressing a man with" +this.getClass().getSimpleName() + "of size " );
    }

    @Override
    public void dressWoman() {
        System.out.println("Dressing a woman with" + this.getClass().getSimpleName() + " of size " );
    }

    public Tshirt() {
    }

    public Tshirt(Size size, double cost, String color) {
        super(size, cost, color);
    }
}
