package structural.bridge;

public class bridge {
    public static void main(String[] args) {
        Shape greenShape = new Square(new GreenColor());
        greenShape.applyColorOnMe();
    }
}
