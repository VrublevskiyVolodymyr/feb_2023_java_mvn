package homework_3.clothes_interface;

public class Tie extends Clothes implements MansСlothes {
    public Tie() {
    }

    @Override
    public void dressMan() {
        System.out.println("Dressing a man with a" + this.getClass().getSimpleName());
    }

    public Tie(Size size, double cost, String color) {
        super(size, cost, color);

    }
}
