package homework_3.clothes_interface;


public class Pants extends Clothes implements WomansСlothes, MansСlothes {

    public void dressMan() {
        System.out.println("Dressing a man with" + this.getClass().getSimpleName() + "of size " );
    }

    @Override
    public void dressWoman() {
        System.out.println("Dressing a woman with" + this.getClass().getSimpleName() + "of size ");
    }

    public Pants() {
    }

    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }
}
