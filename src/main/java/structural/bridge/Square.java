package structural.bridge;

public class Square extends Shape {
    public Square(Color color) {
        super(color);
    }

    @Override
    public void applyColorOnMe() {
        System.out.print("I am Square and : ");super.getColor().applyColor();
    }
}
