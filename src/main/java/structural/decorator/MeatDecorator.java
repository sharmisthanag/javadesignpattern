package structural.decorator;

public class MeatDecorator implements Sandwich {
    Sandwich sandwich;

    public MeatDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String make() {
        return this.sandwich.make() + " + " + addMeat();
    }

    private String addMeat() {
        return "meat";
    }
}
