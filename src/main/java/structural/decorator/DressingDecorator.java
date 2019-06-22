package structural.decorator;

public class DressingDecorator implements Sandwich {
    Sandwich sandwich;

    public DressingDecorator(Sandwich sandwich) {
        this.sandwich = sandwich;
    }

    @Override
    public String make() {
        return this.sandwich.make() + " + " + addMustard();
    }

    private String addMustard() {
        return "mustard";
    }
}
